//package com.example.shop.util;
//
//import java.util.UUID;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.example.article.dto.BoardFile;
//
//@Component
//public class FileUpload {
//	public BoardFile getFileInfo(MultipartFile fileParameter) {
//		// file 정보 테이블에 입력 및 업로드될 파일이름이며, 중복되지 않은 이름이기 위해서 UUID를 사용
//		String prefix = UUID.randomUUID().toString().replace("-", "");
//		BoardFile file = new BoardFile();
//		file.setOriginalName(fileParameter.getOriginalFilename());
//		file.setFileType(fileParameter.getContentType());
//		file.setFileSize(fileParameter.getSize());
//		// .를 포함한 확장자명을 찾기 위해 .의 위치 순서를 구함
//		int pointIndex = fileParameter.getOriginalFilename().lastIndexOf(".");
//		// suffix : pointIndex를 사용하여 .를 포함한 확장자명을 찾음 
//		String suffix = fileParameter.getOriginalFilename().substring(pointIndex);
//		// fileName에 prefix(uuid)+suffix(.-)를 바인딩
//		file.setFileName(prefix+suffix);
//		// flie 파일 정보 반환
//		return file;
//	}
//
//}
