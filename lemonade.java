import java.util.Scanner;

public class Lemonade {

     public static void main(String []args) {
        System.out.println("How many glasses of lemonade would you like?");
        
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        int cost = 2 ;
        double total = cost*count ;
        
        if (total <= 0) {
            System.out.print("Okay, whatever.");
        } else {
            System.out.printf("You owe $%.2f" , total);
        }
    }
}
