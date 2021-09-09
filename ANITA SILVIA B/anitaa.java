import java.util.Scanner;

public class anitaa{

  public static void main(String[] args) {
      	Scanner scan = new Scanner (System.in);   
      	System.out.print("Input bilangan : ");
      	int bilangan = scan.nextInt();

      	int n = 0;
        for (int x = 2; x <= bilangan; x++) {
		if ((bilangan % x) == 0) {
                    n++;
                }
	}

        if (n == 1) {
                System.out.print(bilangan + " adalah bilangan prima");
        } else {
                System.out.print(bilangan + " adalah bilangan bukan prima ");
        }
    }
}