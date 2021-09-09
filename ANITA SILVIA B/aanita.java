import java.util.Scanner;

public class aanita {

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
 
      System.out.print("Input Number : ");
      int bilangan = scan.nextInt();

      if ((bilangan % 2) == 0) {
	    System.out.print(bilangan + " adalah bilangan genap");
        } else {
            System.out.print(bilangan + "adalah bilangan ganjil");
        }
  }
}