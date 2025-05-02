// Print Hello World 10 times

/*

public class WhileLoop {
    public static void main(String[] args) {
       int counter=0;
        while(counter<10){
           counter++;
           System.out.println("Hello World!");
       }
    }
}

*/


// Print number from 1 to 10

/* 

public class WhileLoop {
    public static void main(String[] args) {
     int counter=1;
     while(counter<=10){
        System.out.println(counter);
        counter++;
       }
    }
}

*/

// Print number from 1 to n , n=7

/*

import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int range = sc.nextInt();
        int counter=1;
        while(counter<=range){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}

*/

// Print Sum of n natural numbers, n= 5
import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum + i; // or sum +=i;
            i++;
        }
        System.out.println("sum is : " + sum);
    }
}

