package poly.store.service;

import java.io.File;

import javax.mail.Multipart;

import org.springframework.web.multipart.MultipartFile;

import poly.store.entity.Account;

public interface UploadService {
	File save(MultipartFile file,String folder);
}
