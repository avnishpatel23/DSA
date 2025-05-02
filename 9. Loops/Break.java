/*

public class Break{
 public static void main(String[] args) {
     for(int i=1;i<=5;i++){
        if(i==3){
            break;
        }
        System.out.println(i);
     }
     System.out.println("I am Out of the loop");
 }
}

*/

// Keep entering numbers till user entyers a multiple of 10

import java.util.*;

public class Break{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       do { 
           System.out.println("enter your number: ");
           int n = sc.nextInt();
           if(n%10==0){
            break;
           }
       } while (true);
    }
}
