package BASICS_OF_JAVA.PATTERN;

import java.util.Scanner;

public class HollowRectangle{
    public static void hollow(int row,int column){
        for (int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1|| i==row || j==1 || j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Row : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of Column : ");
        int n = sc.nextInt();
        hollow(m,n);
        sc.close();
    }
}