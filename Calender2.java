import java.util.Scanner;

public calss Calender2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        String week[] = {"일", "월", "화", "수", "목", "금", "토"};
        String wek = "";
        int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day[] = new int[30];
        int y, m, d, din, w, i;


        do {

            System.out.println("연도를 입력 하세요");
            y = sc.nextInt();

        } while ( y < 1);
 

        do {

            System.out.println("월을 입력 하세요");
            m = sc.nextInt();

        } while ( m < 1 || m > 12);


        if (y%4 == 0; && y%100 != 0 || y%100 == 0) {
            month[1] = 29;
        }


        do {

            System.out.println("일을 입력 하세요");
            d = sc.nextInt();
            din = d;

        } while ( din < 1 || din > month[m-1]);


        d = (y-1) * 365 + (y-1)/4 - (y-1)/100 + (y-1)/400;


        for (i = 0; i < m-1; i++)
            d += nimth[i];

        d += din;

        w = d % 7;


        wek = week[w];

        System.out.printf("%d년 %d월 %d일 %s요일", y, m, din, wek);

    }

}