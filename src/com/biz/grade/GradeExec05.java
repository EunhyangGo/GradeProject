package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GradeExec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[200];
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(nameFile);
			buffer = new BufferedReader(fr);
			for(int i = 0; i <names.length; i++) {
				String nameLine = buffer.readLine();
				if(nameLine == null )break;
				names[i] = nameLine ;
			} // 배열에 담기
			 
			// 파일 읽기를 끝내고 다른 코드를 계속 실행해야할 경우 가급적으로(원칙적으로)
			// buffer와 fr을 close()한다.
			buffer.close();
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //try end
		// ==========================================
		// names 배열의 위치에 있는 문자열을 :을 기준으로 잘라서 우리말 이름을 보여주고
		// 영어 이름을 입력받아 맞추는 코드를 작성 하시오.
		
		/*
		try {
			fr = new FileReader(nameFile);
			buffer = new BufferedReader(fr);
			for(int i = 0; i <names.length; i++) {
				String nameLine = buffer.readLine();
				if(nameLine == null )break;
				names[i] = nameLine ;
				
				int namesC = names.length;
				int intIndex = (int)(Math.random() * namesC);
				
				
				
				nameLine.split(":");
				
				
				String[] words = names[intIndex].split(":");
				System.out.println(words[2]);
				
				
				System.out.println("다음 제시된 단어를 입력하시오");
				System.out.println();
				
				Scanner scanner = new Scanner(System.in);
				String inputName = scanner.nextLine();
				
				if(inputName.equalsIgnoreCase(nameLine)) {
					System.out.println("맞았습니다!");
				}else {
					System.out.println("땡!!");
					
				}
				
					
				
			
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		
		int namesC = names.length;
		int intIndex = (int)(Math.random() * namesC);
		
		// name[intIndex] = 1:abc:에이씨
		String[] arrName = names[intIndex].split(":");
		
		// arrName[0] = 숫자
		// arrName[1] = 영어
		// arrName[2] = 한글
		try {
			System.out.println("[" + arrName[2] + "]");
			System.out.println("에 해당하는 영어 이름은?");
			Scanner scanner = new Scanner(System.in);
			System.out.println(" >>");
			String inputName = scanner.nextLine();
			if(arrName[1].equalsIgnoreCase(inputName)) {
				System.out.println("맞았습니다!");
			}else {
				System.out.println("떙!");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	
	}

}
