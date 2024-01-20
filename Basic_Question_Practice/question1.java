package Basic_Question_Practice;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a,b,c,d;
        System.out.print("insert the four for operation : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        float C = a/c * b/d;
        System.out.println("Wrong answer because divisor type is int : "+ C);
        float B = 7/(float)c * 9/(float)d;
        System.out.println("Right Answer because divisor type is float and result store in float : "+B);
        sc.close();
    }
   
}
