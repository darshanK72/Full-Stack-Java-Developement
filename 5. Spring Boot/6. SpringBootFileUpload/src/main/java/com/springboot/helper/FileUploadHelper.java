package com.springboot.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
//	private String DIR_PATH = "E:\\Full Stack Java\\15. Spring Boot\\6. SpringBootFileUpload\\src\\main\\resources\\static\\images";
	public final String DIR_PATH = Paths.get("src/main/resources/static/images").toAbsolutePath().toString();
//	public final String DIR_PATH = new ClassPathResource("static/images/").getFile().getAbsolutePath();
	
	public FileUploadHelper() throws IOException
	{
		
	}

	public boolean upload(MultipartFile file) throws IOException
	{
		boolean f = false;
		
		// File Upload using multipart file, inputstream,bytes,and output stream
		
//		InputStream ios = file.getInputStream();
//		
//		byte[] out = new byte[ios.available()];
//		
//		ios.read(out);
//		
//		FileOutputStream fos = new FileOutputStream(DIR_PATH + File.separator + file.getOriginalFilename());
//		
//		fos.write(out);
//		
//		fos.flush();
//		fos.close();
		
		// File Upload using multipartfile and Files.copy
//		System.out.println(new ClassPathResource("").getFile().getAbsolutePath());
		
		
		Files.copy(file.getInputStream(),Paths.get(DIR_PATH + File.separator + file.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
		
		
		f = true;
		
		return f;
	}

}
