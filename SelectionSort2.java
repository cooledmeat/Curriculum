import java.util.Scanner;

public calss SelectionSort2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*5. 두수를 입력받아 적은 수에서 큰수 까지의 합 ex)50, 20 -> 20, 21, 22, ..., 48, 49,50
             1 ~ 100 까지의 합 : 5050 */

        int num1, num2, temp = 0;
        int sum = 0;


        do {

            System.out.println("1~100 사이의 두개의 수를 입력하시오");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

        } while (num1 < 1 || num1 >= 100 && num2 < 1 || num2 >= 100);


        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;

        }


        for (int i = num1; i <= num2; i++) {
            sum = sum + i;
        }

        System.out.printf("%2d와 %2d까지의 합 : %2d", num1, num2, sum);
        
    }

}