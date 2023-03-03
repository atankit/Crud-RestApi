package com.api.book.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component 
public class FileUploadHelper {

	public final String UPLOAD_DIR = new ClassPathResource("static/image/").getFile().getAbsolutePath();
	 // dynamic path
	 // this will give the absolute path to the image -> resource/static/image/getFile
	
	public FileUploadHelper() throws IOException {
	}

	public boolean uploadFile(MultipartFile multipartFile) {
		boolean f = false;
		try {
			Files.copy(multipartFile.getInputStream(),
					Paths.get(UPLOAD_DIR + File.separator + multipartFile.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);
      
			// copy has 3 arguments -> 
			// 1> InputStream() -> in the input stream to read from
			// 2> Paths -> target the path to the file (.../static/image/image name) 
			// 3> StandardCopyOption -> options specifying how the copy should be done
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
