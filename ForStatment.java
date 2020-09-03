package Curriculum;

import java.util.Scanner;

public class ForStatment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int dan;
		dan = sc.nextInt();
		
		
		// for(조건; 최대값; 증가) {}
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			System.out.printf("%d * %d = %d\n", dan, i, (dan *i));
		}
		
		
		// while(최대값) {}
		int j = 1;  // 초기값 
		
		while (j <= 9) {
			
			System.out.printf("%d * %d = %d\n", dan, j,(dan * j));
			j++;
			
		}
		
		
		// do~while(최대값)
		int k = 0;
		
		do {
			 k++;
			 System.out.printf("%d * %d = %d\n", dan, k,(dan * k));
		} while (k < 9);
		
		
	}

}
