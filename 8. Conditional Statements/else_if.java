/*


public class else_if {
    public static void main(String[] args) {
        int age = 19;

        if (age>=18){
          System.out.println("adult");
        }
        else if(age>=13 && age<18) {
            System.out.println("teenage");
        }
        else {
            System.out.println("child");
             }
    }
}    

*/


// Income Tax Calculator

/*


import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income < 500000){
          tax = 0;
        }
        else if(income>=500000 && income<1000000) {
            tax =(int) (income * 0.2);
        }
        else {
            tax = (int) (income * 0.3);
        }

        System.out.println("your tax is :" +tax);
    }
} 

*/

// Print the largest of 3 number

public class else_if {
    public static void main(String[] args) {
        int A = 1;
        int B = 3;
        int C = 6;

        if (A>=B && A>=C){
          System.out.println("largest is A");
        }
        else if(B>=C) {
            System.out.println("largest is B");
        }
        else {
            System.out.println("largest is C");
             }
    }
}    
