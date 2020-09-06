improt java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num[] = new int[5];
        int i, j, temp;

        System.out.println("숫자 5개 입력");


        for (int p = 0; p < num.length; p++) {
            num[p] = sc.nextInt();
        }   

        System.out.print("Source Data : ");


        for (i = 0; i < num.length; i++) {
            System.out.printf("%4d", num[i]);
        }

        System.out.println();

        System.out.println("Source Data : ");


        for (int su : num) {
            System.out.printf("%4d", su);
        }

        System.out.println();


        for (i = 0; i < num.length; i++) {

            for (j = i+1; j < num.length; j++) {

                System.out.println(i + " : " + j);

                if (num[i] > num[j]) {

                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;

                }

            }

        }

        System.out.print("Sorted Data : ");


        for (i = 0; i < num.length; i++) {
            System.out.printf("%4d", num[i]);
        }

        System.out.println();
        
    }

}