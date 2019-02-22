package com.lsm.spring4.spring4_chap02;

public class Assembler {

	private FileEncryptor fileEnc;
	private Encryptor enc;
	
	
	public Assembler() {
		enc = new FastEncryptor();
		fileEnc = new FileEncryptor(enc);
	}
	
	public FileEncryptor fileEncryptor() {
		return fileEnc;
	}
}
