package com.boot;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @RequestMapping("t1")
	public String test1() {
		return"i am from test1...";
	}
    @RequestMapping(path="t2")
	public String test2() {
		return"i am from test2...";
	}
    @RequestMapping(path="t3", method=RequestMethod.GET)
	public String test3() {
		return"i am from test3...";
	}
    @GetMapping(path="t4")
    public String test4() {
    	return "i am from test4...";
    }
    @GetMapping("t5")
    public String test5() {
    	return "i am from test5...";
    }
    @GetMapping("/t6")
    public String test6() {
    	return "i am from test6...";
    }
    @RequestMapping("/t7")
    public String test7() {
    	return "i am from test7...";
    }
    @RequestMapping(path="/t8",method=RequestMethod.GET)
    public String test8() {
    	return "i am from test8...";
    }
    @RequestMapping(path="/t9/task1",method=RequestMethod.GET)
    public String test9() {
    	return "i am from test9...";
    }
    
}
