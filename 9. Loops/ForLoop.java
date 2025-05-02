// Print hello world using for loop

/* 

import java.util.*;
public class ForLoop{
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println("Hello World");
        }
    }
}

*/

// Print Square Pattern

/*

public class ForLoop{
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            System.out.println("****");
            
        }
    }
}

*/


// Print Reverse Of a number

public class ForLoop {
    public static void main(String[] args) {
      int  rev = 0;
      int  n= 10899;
        while (n > 0) {
            int lastDigit = n % 10; // Get the last digit
            rev = (rev*10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
