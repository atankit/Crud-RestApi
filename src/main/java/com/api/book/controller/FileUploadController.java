package com.api.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.book.helper.FileUploadHelper;

@RestController
public class FileUploadController {

	@Autowired
	private FileUploadHelper fileUploadHelper;

	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) { 
		
		try {
// validation
			if (file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Request must contain file");
			}
			if (!file.getContentType().equals("image/jpeg")) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Only JPEG file allow..");
			}

			boolean f = fileUploadHelper.uploadFile(file);
			if (f) {

				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/")
						.path(file.getOriginalFilename()).toUriString());
// ServletUriComponentsBuilder.fromCurrentContextPath ->  http://localhost:8080/image/imagename.jpeg
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Something want wrong !!Try again");
	}
}
