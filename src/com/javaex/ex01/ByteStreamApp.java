package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {

	public static void main(String[] args) throws IOException { // 자바에 예외를 던져줌
		
		//InputStream FileInputStream
		//OutputStream FileOutputStream
		
		InputStream in = new FileInputStream("C:\\javastudy\\img.jpg"); 
		OutputStream out = new FileOutputStream("C:\\javastudy\\buffimg.jpg"); 
		
		byte[] buff = new byte[1024]; //속도개선 ex.쟁반에 커피를 담아서 나른다..
		
		System.out.println("복사시작(쟁반)");
		while (true) { 
			int bData = in.read(buff);
			if (bData == -1) {
				System.out.println("복사끝(쟁반)");
				break;
			}

			out.write(buff);

		}
		

		
		/*
		try {
			InputStream in = new FileInputStream("C:\\javastudy\\img.jpg");
		} catch (FileNotFoundException e) {
			// 파일이 없을경우를 대비해 예외처리해주어야 오류나지않음
			e.printStackTrace();
		}
		*/
		
		/* 속도개선없이 기본개념 ex. 커피를 한잔씩 뽑아서 나른다..
		System.out.println("복사시작");
		
		InputStream in = new FileInputStream("C:\\javastudy\\img.jpg"); // 빨대꽂기(in읽기)
		OutputStream out = new FileOutputStream("C:\\javastudy\\byteimg.jpg"); // 빨대꽂기(out쓰기)
		
		while(true) { // 한모금 읽고 쓰고.. 한모금 읽고 쓰고... (느림)
			int bData = in.read(); // 읽기
			if(bData == -1) { // 데이터의 마지막인지 체크, 마지막이면 반복문 탈출
				System.out.println("복사끝");
				break;
			}
			out.write(bData); // 데이터가 있으면 쓰기
				
		}
		
		//빨대 끊기
		out.close();
		in.close();
		*/
		
		
		
		

	}

}
