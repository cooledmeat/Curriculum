package Curriculum;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConditionalStatment {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		String str = "";  // "" == null
		String name, pan;
		int kor = 0;
		
		// 단일 if문
		
		// if(조건) {}
		if (num%2 == 0) {
			str = "짝수";
		}
		
		if (num != 0) {
			str = "홀수";
		}
		
		
		// if else
		if (kor >= 90) {
			pan = "수";
		} else if (kor >= 80) {
			pan = "우";
		} else if (kor >= 70) {
			pan = "미";
		} else if (kor >= 60) {
			pan = "양";
		} else {
			pan = "가";
		}
		
	}

}
