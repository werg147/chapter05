package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex01 {

	public static void main(String[] args)throws IOException {
		
		/*
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		sc.close();
		*/
		
		// 기존파일 --> 키보드 사용
		//InputStream in = new FileInputStream("C:\\javastudy\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine(); //한줄씩 읽어온다. 줄바꿈기호 제외
		
		
		//출력
		System.out.println(str);
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		
		
		

	}

}
