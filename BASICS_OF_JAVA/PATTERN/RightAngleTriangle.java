package BASICS_OF_JAVA.PATTERN;
import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of line : ");
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=2*i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();}
}
