package com.spring.mvc.FileUpload.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	
	@RequestMapping(path="/fileupload",method=RequestMethod.GET)
	public String fileHandler()
	{
		return "fileupload";
	}

	@RequestMapping(path="/filesuccess",method=RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file,HttpSession session,Model model) throws FileNotFoundException
	{
		System.out.println("file uploading");
		String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator + "images" + File.separator + file.getOriginalFilename();
		byte[] out = file.getBytes();
		
		FileOutputStream ostream = new FileOutputStream(path);
		
		System.out.println(path);
		
		try {
			ostream.write(out);
			ostream.close();
			System.out.println("File uploaded");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		model.addAttribute("fileName", file.getOriginalFilename());
		
		return "filesuccess";
	}
	
	@RequestMapping(path="/filesuccess/{fileName}",method=RequestMethod.GET)
	public String showImage(@PathVariable("fileName") String fileName,HttpSession session,Model model)
	{
		model.addAttribute("fileName",fileName);
		return "filesuccess";
		
	}
}
