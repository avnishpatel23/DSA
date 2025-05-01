/* 

public class Switch_Statement {
    public static void main(String[] args) {
      int number = 2;
      switch (number) {
           case 1 : System.out.println("Samosa");
               break;
           case 2 : System.out.println("Burger");
               break;
           case 3 : System.out.println("Mango");
               break;
           default :  System.out.println("None");
       }
    }
}

*/

// Calculator
import java.util.Scanner;
public class Switch_Statement {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a : ");
      int a = sc.nextInt();
      System.out.println("enter b : ");
      int b = sc.nextInt();
      System.out.println("enter operator : ");
      char operator = sc.next().charAt(0);

      switch (operator) {
           case '+' : System.out.println("a+b");
               break;
           case '-' : System.out.println("a-b");
               break;
           case '*' : System.out.println("a*b");
               break;
           case '/' :  System.out.println("a/b");
               break;
            case '%':  System.out.println("a%b");
           default : 
               System.out.println("Invalid operator");
       }
    }
}
