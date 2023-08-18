package com.springboot.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.helper.FileUploadHelper;

@RestController
public class FileUploadController {
	
	@Autowired
	private FileUploadHelper fileUploadHelper;
	

	@GetMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file)
	{
		
//		/6. SpringBootFileUpload/src/main/resources/static/images
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		
		try {
			this.fileUploadHelper.upload(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok("Controller Working");
	}
}
