package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		//List 사용
		
		Reader fr = new FileReader("C:\\javastudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List brList = new ArrayList();
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
			String[] data = str.split(",");
			
			
		}
		
		
		
	}

}
