package com.lsm.spring4.spring4_chap02;


public class TestFileEncryptor {

	public void testFileEncryptor() {
		Encryptor fakeEncryptor = new Encryptor() {
			
			@Override
			public void encrypt(byte[] data, int offset, int len) {
			
			}
		};
		
		FileEncryptor fileEncryptor = new FileEncryptor(fakeEncryptor);
		try {
			fileEncryptor.encryptor();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
}
