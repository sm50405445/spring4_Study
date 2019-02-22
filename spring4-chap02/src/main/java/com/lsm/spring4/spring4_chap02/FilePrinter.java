package com.lsm.spring4.spring4_chap02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilePrinter {

	public void print(String filePath) throws IOException{
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line = null;
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
		}
	}
}
