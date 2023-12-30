package Basic_Question_Practice;

import java.util.Scanner;

public class PrefectNum {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n= sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
        sc.close();
    }
}