/* 

// Ans 1

public class Practice{
    public static void main(String[] args) {
        for (int i=0; i<5;i++){
            System.out.println("Hello");
            i+=2;
        }
    }
}

*/


// Ans 2

/*

import java.util.*;
public class Practice{
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int number;
       int choice;
       int evenSum = 0;
       int oddSum = 0;

       do { 
           System.out.println("Enter the Number ");
           number = sc.nextInt();

           if(number % 2 == 0){
            evenSum = evenSum + number;
           }
           else{
            oddSum = oddSum + number;
           }
           System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
           choice = sc.nextInt();
       } while (choice==1);
       System.out.println("sum of even number :" + evenSum);
       System.out.println("sum of even number :" + oddSum);
    }
}

*/


// Ans 3 

/*

import java.util.*;

public class Practice {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int num ;
      int fact = 1;
      System.out.println("Enter any positive integer");
      num = sc.nextInt();

       for(int i = 1; i <= num; i++) {
         fact *= i;
       }
        
        System.out.println("Factorial : " + fact);
    }
}

*/

// Ans 4


/*


import java.util.*;

public class Practice {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter Number : ");
      int n = sc.nextInt();
      for(int i=1; i<=10; i++){
         System.out.println(n + " * " + i + " = " +n*i);
      }
    }
}

*/

// Ans 5

public class Practice {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=5; i++){
            System.out.println(" i = " +i);
        }
        System.out.println("i after the loop =" + i);
    }
}