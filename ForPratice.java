public class Test6 {

    public static void main(String[] args) {

        int i, j;

        // 왼쪽 반쪽 삼각형
        for (i = 1; i <= 5; i++) {

            for (j = 1; j <= 5-i; j++) {

                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }


        // 오른쪽 반쪽 삼각형
        for (i = 5; i >= i; i--) {

            for (j = 1; j <= 5; j++) {

                System.out.print(" ");

            }

            for (j = 1; i <= i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }


        // 삼각형
        for (i = 1; i <= 5; i++) {

            for (j = 1; j <= 5; j++) {

                System.out.print(" ");

            }

            for (j = 1; j <= i * 2 -1; j++) {

                System.out.print("*");

            }

            System.out.println();

        }


        // 역삼각형
        for (i = 5; i >= i; i--) {

            for (j = 1; j <= 5; j++) {

                System.out.print(" ");

            }

            for (j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }


        // 모래시계 만들기
        for (i = 5; i >= 1; i--) {

            for (j = 1; j <= 5 -i; j++) {

                System.out.print(" ");

            }

            for (j = 1; j <= i * 2 -1; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

        for (i = 2; i <= 5; i++) {

            for (j = 1; j <= 5 - i; j++) {

                System.out.print(" ");

            }

            for (j = 1; j <= i * 2 - 1; j++) {

                System.out.print("*");

            }

            System.out.println();
            
        }


    }

}