package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.StudentVO;


public class GradeExec06 {

	/*
	 * 영어이름들.txt파일을 읽어서 각 라인의 ":"을 기준으로 자르고 
	 * sVO 리스트에 추가하시오.
	 * 1:Korea:대한민국
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
		List<StudentVO> sVO = new ArrayList();
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(nameFile);
			buffer = new BufferedReader(fr);
			while(true) {
				String strWord = buffer.readLine();
				if(strWord == null) break;
			//String[] words = strWord.split(:);
		    strWord.split(":");
			String[] words = strWord.split(":");
			if(words.length > 2) { // 길이가 3일때 
				StudentVO vo = new StudentVO();
				vo.setStrNum(words[0]);
				vo.setStrKorName(words[1]);
				vo.setStrEngName(words[2]);
				sVO.add(vo);
			}
			
			}
			buffer.close();
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(StudentVO vo :sVO) { //확인해보는것
			System.out.println(vo);
		}
		
	}

}
