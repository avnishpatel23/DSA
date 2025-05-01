// Ans 1

/* 

import java.util.*;
public class PracticeQS{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        if( x < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Positive");
        }
    }
}

*/

// Ans 2

/*
public class PracticeQS{
    public static void main (String[] args){
        double temp = 103.5;
        if (temp>100) {
            System.out.println("You have a Fever");
        }
        else{
            System.out.println("You don't have a fever");
        }
    }
}

*/

// Ans 3

/*
import java.util.*;
public class PracticeQS{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int week = sc.nextInt();

        switch(week) {
        case 1 : System.out.println("Monday");
           break;
        case 2 : System.out.println("Tuesday");
           break;
        case 3 : System.out.println("Wednesday");
           break;
        case 4 : System.out.println("Thursday");
           break;
        case 5 : System.out.println("Friday");
           break;
        case 6 : System.out.println("Saturday");
           break;
        case 7 : System.out.println("Sunday");
           break;
        default : System.out.println("Please Enter Valid from 1-7");
        }
    }
}

*/

// Ans 4

/*

public class PracticeQS{
    public static void main (String[] args){
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

*/

// Ans 5

import java.util.Scanner;

public class PracticeQS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        boolean x = (year % 4) ==0;
        boolean y = (year % 100) ==0;
        boolean z = ((year % 100 ==0) && (year % 400 ==0));
        
        if (x && (!y || z)) {
            System.out.println(year+ "Leap Year");
        }
        else{
            System.out.println(year+ "Not a Leap Year");
        }
    }
}


    