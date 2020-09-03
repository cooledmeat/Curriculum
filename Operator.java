package Curriculum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operator {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2;
		
		System.out.println("첫번째 수");
		num1 = Integer.parseInt(br.readLine()); // IOException으로 예외처리 해줘야 한다.
		
		System.out.println("두번째 수");
		num2 = Integer.parseInt(br.readLine());
		
		
		System.out.printf("%d + %d = %d\t", num1, num2, (num1 + num2));
		System.out.printf("%d - %d = %d\t", num1, num2, (num1 - num2));
		System.out.printf("%d * %d = %d\t", num1, num2, (num1 * num2));
		System.out.printf("%d / %d = %d\t", num1, num2, (num1 / num2));     // 몫
		System.out.printf("%d %% %d = %d\t", num1, num2, (num1 % num2));    // 나머지
		
		
		System.out.println("num1 > num2 : " + (num1 > num2));  // ture / false - boolean의 기본값은 true

		String str;
		str = num1%2 == 0? "짝수" : "홀수"; // 삼항연산자
		str = num1 > 0? "양수" : (num1 < 0? "음수" : "영");  // 중첩해서 사용 가
		str = num1%4 == 0 && num1%100 != 0 || num1%400 == 0? "윤년" : "평년";
		
		// A &&(and) B
		// A ||(or) B
		
		System.out.println(num1 + ":" + str);

		
		char ch = 'a';  // 아스키 코드 하나. 아스키 코드를 모아둔 것이 유니코
		char result;
		
		
		System.out.println(Integer.toString(ch));  // 아스키 코드를 보여주기 위해 문자를 형변환
		System.out.println("한개의 문자?");
		
		ch = (char)System.in.read();;
		      // 강제 형변
		
		result = ch >= 65 && ch <= 90? (char)(ch+32) : (ch >= 'a' && ch <= 'z'? (char)(ch-32) : ch);
		
		System.out.println(ch + ":" + result);
		
		char h = 'ㄱ';
		
		System.out.println(h);
		System.out.println((char)(h));
		
		
	}

}
