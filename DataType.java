package Curriculum;

public class DataType {

	public static void main(String[] args) {
		
		int r = 10;
		
		float area, len; // 실수값을 저장하는 변수. 소수 6자리까지. 마지막 자리는 +- 값
		
		area = r * r * 3.14F; // 자바는 처음 소수점을 double로 인식. 변수를 float으로 정해줬기 때문에 형변환 해줘야한다.
		len = r * 2 * 3.14f;
		
		System.out.printf("반지름 : %d, 넓이 : %f \n", r, area);
		System.out.printf("반지름 : %d, 둘레 : %f \n", r, len);
		System.out.printf("반지름 : %d, 둘레 : %.2f \n", r, len);
		
		// 3.14  : 배정도 실수
		// 3.14f : 단정도 실수
		
		int a = 5;
		float b;
		
		b = a;
		
		System.out.println(b);
		
		// a = b;
		// System.out.println(a); - 정수가 실수변수에 들어가면 .0이 붙어서 가능하지만 실수는 형변환 해야한다.
		
		float f = 0;  // 0.0
		double d = 0; // 0.0
		
		for (int i=1; i<=10000; i++) {
			f = f + 10000;
			d = d + 10000;
		}
		
		System.out.println("float: " + f);
		System.out.println("double: " + d);

	}

}
