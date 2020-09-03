package Curriculum;

public class Variable {

	public static void main(String[] args) {
		
		int a = 20; // integer - 정수,  a - 변수 명, 20 변
		int b = 5;
		int c,d; // initialized 안해서 출력 불가.
		
		c = a + b;
		d = a - b;
		
		System.out.println("a");
		
		System.out.println(a + "+" + b + "=" + c);
		
		System.out.printf("%d + %d = %d%n", a, b, c); // f = format %d 위치에는 정수값만 가
		System.out.printf("%d + %d = %d\n", a, b, c); // f에서 %n과 \n은 같은 연산자 format에서만 사용 가
		
	}

}
