package com.lsm.spring4.spring4_chap02;

public class Main {

	public static void main(String[] args) {
		
		Assembler assembler = new Assembler();
		FileEncryptor fileEnc = assembler.fileEncryptor();
		fileEnc.encryptor();
		
	}
}
