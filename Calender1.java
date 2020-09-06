import java.util.Scanner;

public calss SelectionSort2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int y, m, d, i, w;


        do {

            System.out.print("연도를 입력 : ");

            y = sc.nextInt();

        } while (y < 1);


        do {

            System.out.print("월을 입력 : ");

            m = sc.nextInt();

        } while (m < 1 || m >12);


        if (y%4 == 0; && y%100 != 0 || y%100 == 0) {
            month[1] = 29;
        }


        d = (y-1) * 365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

        int yy = (y-1)/4 - (y-1)/100 + (y-1)/400;


        for (i = 0; i < m-1; i++) {
            d += month[i];
        }

        // y년 m일 1일의 날수
        d += 1;  


        // 주의 수 구하기
        w = d % 7;


        System.out.println("\n 일 월 화 수 목 금 토");
        System.out.println("-------------------");


        // 공백
        for (i = 0; i < w; i++) {
            System.out.print("    ");
        }


        // 해당 월의 날짜 출력
        for (i = 0; i <= months[m-1]; i++) {

            System.out.printf("%4d", i);

            // 한 주의 날짜가 출력되면 바꿈
            w++;

            if (w%7 == 0)
                System.out.println();

        }


        if (w%7 != 0;)
            System.out.println();


        System.out.println("----------------------");

    }
}