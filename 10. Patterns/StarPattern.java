// Star Pattern

/* 
public class StarPattern {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/


// Inverted pattern 

/* 

public class StarPattern {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (rows-i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/

// Half Pyramid Pattern

/* 

public class StarPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}

*/

// CHARACTER Pattern

public class StarPattern {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A' ;
        //outer loop
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
