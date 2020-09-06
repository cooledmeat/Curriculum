Public class ConditionalStatmentReport {
    Public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* 1. (1) + (1+2) + (1+2+3) + ... + (1+2+3+...+10)
            결과 : 220 */

        int fact = 0;
        int num, total = 0;


        System.out.println("숫자를 입력하세요");

        num = sc.nextInt();


        for (int i = 1; i < num + 1; i++) {

            fact += i;
            total += fact;

        }

        System.out.println("결과 : " + total);



        /* 2. 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합
            짝수 합 : 2550
            홀수 합 : 2500
            전체 합 : 5050 */

        int j = 0;
        int h = 0;
        int t = 0;


        for (int i = 1; i <= 100; i++) {

            t += i;

            if (i%2 == 0) {
                j+= 1;
            } else {
                h += 1;
            }
        }

        System.out.println("홀수의 합 : %2d 짝수의 합 : %2d 전체의 합 : %2d", h, j, t);



        /* 3. 1-2+3-4+5-6+7-8+9-10
            결과 : -5 */

        int total = 0;

        for (int i = 1; i <= 10; i++) {

            if (i%2 == 0) {
                total -= i;
            } else {
                total += i;
            }
        }

        System.out.println(total);



        /* 4. 1에서 100까지의 수 중 3의 배수의 갯수
            3의 배수의 갯수 : 33 */

        int total = 0;

        for (int i = 1; i <= 100; i++) {

            if (i%3 == 0) {
                total++;
            }
        }

        System.out.println("3의 배수의 갯수 : " + total);

    }

}