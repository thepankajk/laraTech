package MVC;

import java.time.LocalDateTime;
import java.util.*;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	@Autowired
	private Dao dao;
	
	
/*@RequestMapping is used to define mapping of web request to handler method or class.
@RequestMapping can be used at method level or class level. We will ...*/
	
	
	@RequestMapping("/")
	public String about() {
		System.out.println("i am from conteroller class home method...");
		return "search";
	}
	
@RequestMapping("/about")
public String home(Model model) {
	model.addAttribute("name", "albert");
	model.addAttribute("id", "101");
	List<String>friends=new ArrayList<String>();
	friends.add("dyna");friends.add("johnson");friends.add("stefan");friends.add("arya");
	model.addAttribute("f", "friends");
	return "about";
	
}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println(0/0);
	// creating ModelAndView object
	ModelAndView modelandview=new ModelAndView();
	modelandview.addObject("name","trump");
	modelandview.addObject("rollnumber", "201");
	modelandview.setViewName("help");
	System.out.println("i am from controller class with home url...");
	return modelandview;
	
}
	
	@RequestMapping("/form")
	public String form() {
		System.out.println("i am from conteroller class form method...");
		return "form";
	}
	/*
	//In Spring MVC, the @RequestParam annotation is used to read the form data and 
	//bind it automatically to the parameter present in the provided method.
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String formHandler(
			@RequestParam("email") String userEmail,
			@RequestParam("name") String userName,
			@RequestParam("password") String userPassword,Model model) {
		model.addAttribute("email", userEmail);
		model.addAttribute("name", userName);
		model.addAttribute("password", userPassword);
		
		return "success";
	}*/
	// 2nd shortcut process at place of @RequestParam we can use @ModelAttribute
	/*@ModelAttribute is an annotation that binds a method parameter or method return 
	 value to a named model attribute and then exposes it to a web view.*/
	// for handling error we can use BindingResult
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String formHandler(@ModelAttribute User user,BindingResult err ) {
	if(err.hasErrors()) {
		return "form";
	}else
	this.dao.saveData(user);
	return "success";
	}
	/**
@ModelAttribute	
public void commonData(Model m) {
	m.addAttribute("Header", "I am Java programmer");
	m.addAttribute("Desc", "Home for Programmer");
}*/
@RequestMapping("/serach")
public RedirectView Redirect(@RequestParam("search") String srch) {
	System.out.println("i am from conteroller redirect method...");
	String url="https://www.google.com/search?q="+srch;
	RedirectView rv=new RedirectView();
	rv.setUrl(url);
	return rv;
}

@RequestMapping("/add_product")
public String add_product() {
	System.out.println("i am from conteroller class form method...");
	return "add_product";
}







//Handling exception in our mvc project.
@ExceptionHandler({ArithmeticException.class})
public String handlingException() {
	return "exceptionHandler";
}
}
