package com.boot;

import java.io.FileOutputStream;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController 
public class FileUploadController {
@RequestMapping(path="upload1",method=RequestMethod.POST)
public String upload1(@RequestParam MultipartFile myFile)throws Exception {
	byte[] bytes=myFile.getBytes();
	FileOutputStream  fout=new FileOutputStream("nature.png");
	fout.write(bytes);
	return "png file upload successfully...";
}
@RequestMapping(path="upload2",method=RequestMethod.POST)
public String upload2(@RequestParam MultipartFile file)throws Exception{
	byte[] bytes=file.getBytes();
	FileOutputStream fout=new FileOutputStream("test2.txt");
	fout.write(bytes);
    return "text file uploaded successfully...";
}
@RequestMapping(path="upload3",method=RequestMethod.POST)
public String upload3(@RequestParam MultipartFile files)throws Exception {
	byte[] bytes=files.getBytes();
	FileOutputStream fout=new FileOutputStream("src\\main\\resources\\uploads\\test3.pdf");
	fout.write(bytes);
	return "pdf file uploaded successfully";
}
@RequestMapping(path="upload4",method=RequestMethod.POST)
public String upload4(@RequestParam MultipartFile files)throws Exception {
	String originalFileName=files.getOriginalFilename();
	byte[] bytes=files.getBytes();
	FileOutputStream fout=new FileOutputStream("src\\main\\resources\\uploads\\"+originalFileName);
	fout.write(bytes);
	return "originalFileName file uploaded successfully";
}
@RequestMapping(path="upload5",method=RequestMethod.POST)
public String upload5(@RequestParam MultipartFile files)throws Exception {
	String originalFileName=files.getOriginalFilename();
	String fileName="hello";
	String fileType=originalFileName.substring(originalFileName.indexOf("."));
	byte[] bytes=files.getBytes();
	FileOutputStream fout=new FileOutputStream("src\\main\\resources\\uploads\\"+fileName+fileType);
	fout.write(bytes);
	return "originalFileName file uploaded successfully"+fileName+fileType;
}
int counter=0;
synchronized int getCounter(){
	counter++;
	return counter;
}
@RequestMapping(path="upload6",method=RequestMethod.POST)
public String upload6(@RequestParam MultipartFile files)throws Exception {
	String originalFileName=files.getOriginalFilename();
	String fileName="hello"+getCounter();
	String fileType=originalFileName.substring(originalFileName.indexOf("."));
	byte[] bytes=files.getBytes();
	FileOutputStream fout=new FileOutputStream("src\\main\\resources\\uploads\\"+fileName+fileType);
	fout.write(bytes);
	return "originalFileName file uploaded successfully"+fileName+fileType;
}
@RequestMapping(path="upload7",method=RequestMethod.POST)
public String upload7(@RequestParam MultipartFile myFiles,@RequestParam String jsonobj)throws Exception {
	String originalFile=myFiles.getOriginalFilename();
	String fileType=originalFile.substring(originalFile.indexOf("."));
	FileOutputStream fout=new FileOutputStream("src\\main\\resources\\uploads\\new_file"+fileType);
	fout.write(myFiles.getBytes());
	Employee emp=new ObjectMapper().readValue(jsonobj,Employee.class);
	System.out.println(emp.getId());
	System.out.println(emp.getFirstName());
	System.out.println(emp.getLaastName());
	return "Json with MultiFileData updated successfully";
	}

@RequestMapping(path="upload8",method=RequestMethod.POST)
public String upload8(@RequestParam MultipartFile File1,
		@RequestParam MultipartFile File2,
		@RequestParam String jsonEmp,
		@RequestParam String jsonAdd)throws Exception {
	String originalFile1=File1.getOriginalFilename();
	String originalFile2=File2.getOriginalFilename();
	String fileType1=originalFile1.substring(originalFile1.indexOf("."));
	String fileType2=originalFile2.substring(originalFile2.indexOf("."));
	FileOutputStream fout1=new FileOutputStream("src\\main\\resources\\uploads\\new_file1"+fileType1);
	FileOutputStream fout2=new FileOutputStream("src\\main\\resources\\uploads\\new_file2"+fileType2);
	fout1.write(File1.getBytes());
	fout2.write(File2.getBytes());
	Employee emp=new ObjectMapper().readValue(jsonEmp,Employee.class);
	Address add=new ObjectMapper().readValue(jsonAdd,Address.class);
	System.out.println(emp.getId());
	System.out.println(emp.getFirstName());
	System.out.println(emp.getLaastName());
	System.out.println(add.getHouseNo());
	System.out.println(add.getStreetName());
	return "multi Json with MultiFileData updated successfully";
	}
/*
// reading from excel sheet by poi
@RequestMapping(path="upload9",method=RequestMethod.POST)
public String upload7(@RequestParam MultipartFile myFiles)throws Exception {
	String originalFile=myFiles.getOriginalFilename();
	String fileType=originalFile.substring(originalFile.indexOf("."));
	String fileName="data";
	FileOutputStream fout=new FileOutputStream("src\\main\\resources\\uploads\\"+fileType+fileName);
	fout.write(myFiles.getBytes());
	
	XSSFWorkbook workbook=new XSSFWorkbook("src\\main\\resources\\uploads\\"+fileType+fileName);
	XSSFSheet worksheet=new workbook.getSheetAt(0);
	for(int i=1;i<worksheet.getPhysicalNumberOfRows();i++) {
			XSSFRow row=worksheet.getRow(i);
			System.out.println(row.getCell(0).getNumericCellValue()+"\t");
			System.out.println(row.getCell(1).getNumericCellValue()+"\t");
			System.out.println(row.getCell(2).getNumericCellValue()+"\t");
			System.out.println(row.getCell(3).getNumericCellValue());
	}
	return originalFile+fileName+fileType+"successfully";
	}*/


}
