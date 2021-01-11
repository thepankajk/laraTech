package com.boot;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class PersonController {
	@Autowired
	private PersonRepository personRepository;
    @RequestMapping(path="uploads",method=RequestMethod.POST)
	public String upload(@RequestParam MultipartFile myFiles)throws Exception {
		String originalFile=myFiles.getOriginalFilename();
		String fileType=originalFile.substring(originalFile.indexOf("."));
		String fileName="data";
		FileOutputStream fout=new FileOutputStream("src\\main\\resources\\uploads\\"+fileType+fileName);
		fout.write(myFiles.getBytes());
	// reading from excel sheet by poi
			
		XSSFWorkbook workbook=new XSSFWorkbook("src\\main\\resources\\uploads\\"+fileType+fileName);
		XSSFSheet worksheet=workbook.getSheetAt(0);
		ArrayList<Person> persons=new ArrayList<Person>();
		Person person;
		XSSFRow row;
		for(int i=1;i<worksheet.getPhysicalNumberOfRows();i++) {
				 row=worksheet.getRow(i);
				person=new Person();
			person.setId((int)row.getCell(0).getNumericCellValue());
			person.setFirstName(row.getCell(1).getStringCellValue());
			person.setLastName(row.getCell(2).getStringCellValue());
			person.setAge((int)row.getCell(3).getNumericCellValue());
			person.setEmail(row.getCell(4).getStringCellValue());
				
				persons.add(person);
				
		}
		personRepository.saveAll(persons);
		return originalFile+fileName+fileType+"  successfully";
		}

}
