package com.learn.Ecommerce.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Paths;
import java.util.UUID;
import java.nio.file.Files;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

// Add unimplemented method

//Service - Bean banata hai aur batata hai it has a business logic
@Service
public class FileServiceImpl implements FileService {

	
	//To Upload File
	@Override
	public String uploadFile(MultipartFile file, String path) throws IOException {

		// abc.png
		String originalFilename = file.getOriginalFilename();

		String filename = UUID.randomUUID().toString();
		String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
		String fileNameWithExtension = filename + extension;
		String fullPathWithFileName = path + fileNameWithExtension;

		if (extension.equalsIgnoreCase(".png") || extension.equalsIgnoreCase(".jpg")
				|| extension.equalsIgnoreCase(".jpeg")) {
			// file save

			File folder = new File(path);
			if (!folder.exists()) {
				// create the folder
				folder.mkdirs();
			}
			// upload
			Files.copy(file.getInputStream(), Paths.get(fullPathWithFileName));
			return fileNameWithExtension;
		} else {
			throw new RuntimeException("File with this " + extension + " not allowed !!");
		}

	}


	//To Read the File
	
	@Override
	public InputStream getResource(String path, String name) throws FileNotFoundException {
		
		String fullPath = path + File.separator + name;
        InputStream inputStream = new FileInputStream(fullPath);
        return inputStream;

		
	}

}
