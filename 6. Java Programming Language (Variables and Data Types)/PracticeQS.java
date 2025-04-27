import java.util.*;

public class PracticeQS {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Ans 1
       
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int average = (A + B + C) / 3;
        System.out.println("average is : " + average);

        //Ans 2
        
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("area of the square is : " + area);

        // Ans 3

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Bill is : " + total);
        //Add on - with 18% tax
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax : " + newTotal);5
    }
}