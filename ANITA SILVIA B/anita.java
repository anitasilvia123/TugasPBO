import java.util.Scanner;

public class Anita {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

	System.out.println("6, 7, 8, 9, 10, 11, 12, 13"); 
        System.out.print("Input bilangan : ");
        int bilangan = scan.nextInt();

        int n = 0;
        int[] binary = { 6, 7, 8, 9, 10, 11, 12, 13 };
        int binaryLen = binary.length;

        for (int x : binary) { 
            if (bilangan == x) {
                System.out.println("bilangan ini ada di indeks ke  " + n);
                break;
            }
            n++;
        }

        if (n == binaryLen) {
            System.out.println("bilangan ini tidak ada dalam array!");
        }
    }
}