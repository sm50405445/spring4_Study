package com.lsm.spring4.spring4_chap02;

import java.io.File;

public class FileEncryptor {

	private Encryptor encryptor;
	
	public FileEncryptor(Encryptor encryptor) {
		this.encryptor = encryptor;
	}
	
	public void encryptor() {
		System.out.println(encryptor);
	}
}
