package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		//List 사용
		
		Scanner sc = new Scanner(System.in);
		
		
		
		//파일 읽어오기
		Reader fr = new FileReader("C:\\javastudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//리스트 준비
		List<Person> pList = new ArrayList<Person>();
		
		//리스트에 입력
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
			String[] data = str.split(",");
			Person person = new Person(data[0], data[1], data[2]);
			pList.add(person);
			
		}
		
		System.out.println(pList.toString());
		br.close();
		
		//정보 추가 (모든 정보를 새로쓰는 방식)
		System.out.println("추가할 친구 정보를 입력하세요.");
		String str = sc.nextLine();
		String[] data = str.split(",");
		
		Person person = new Person(data[0], data[1], data[2]);
		pList.add(person);
		
		System.out.println(pList.toString());
		
		//리스트의 내용을 파일에 쓰기.
		//기존 데이터는 지워지고 정보를 다 새로 쓴다 -> 리스트의 정보를 모두 파일로 쓴다.
		Writer fw = new FileWriter("C:\\javastudy\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		for(Person p : pList) {
			String pStr = p.getName() + "," + p.getHp() + "," + p.getCompany();
			bw.write(pStr);
			bw.newLine();
		}
		
		
		bw.close();
		sc.close();
		
	}

}
