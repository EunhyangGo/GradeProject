package com.biz.grade;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
		FileReader fr;
		
		try {
			fr = new FileReader(nameFile);
		
			while(true) {
				// 기본값 : 파일의 내용을 아스키코드 형식으로 읽어서 그 값을 10진수 정수로 return
				// 파일 내용을 읽되
				int intRead = fr.read();
				
				//End Of File 신호가 오면 그만 읽기
				if(intRead < 0) break;
				System.out.print((char)intRead);
			}
			 

			
		} catch (FileNotFoundException e) {
			// 파일을 읽기위해 open하는 과정에서 발생하는 Exception을 처리하는 부분
			// TODO Auto-generated catch block
			
			// 자바에서 기본으로 제공하는 Exception 메세지를 콘솔에 보여주는 메서드
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			// 파일로부터 데이터(문자, 문자열)을 읽는 중에 발생하는 Exception처리하는 부분
			e.printStackTrace();
		}

	}

}
