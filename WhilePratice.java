package Curriculum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhilePratice {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int su, sum;
		char ch;
		
		while (true) {
			
			do {
				
				System.out.println("수 입력 : ");
				su = Integer.parseInt(br.readLine());
				
			} while (su < 1 || su > 5000);
			
			// 1~su 까지 합계
			
			sum = 0;
			for (int i = 1; i <= su; i++) {
				sum += i;
			}
			
			System.out.println("1~ " + su + "까지의 합" + sum);
			System.out.println("계속 할래? Y/N");  // y1013 - 1013 enter
			
			ch = (char)System.in.read();
			
			if (ch != 'Y' && ch != 'y') {
				
				System.out.println("프로그램 종료...");
				break;
				// while, do~while, for, switch - 반복문에서 빠져 나올때 사용
			}
			
			System.in.skip(2);    // 10, 13
			
		}
		

	}

}
