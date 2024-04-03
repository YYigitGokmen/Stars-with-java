



import java.util.Scanner;



public class Stars {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz : ");
        int n = scan.nextInt();


        for (int i = 1; i < n; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");

            }

            System.out.println();

        }


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");


            }
 System.out.println();

        }
    }
}
