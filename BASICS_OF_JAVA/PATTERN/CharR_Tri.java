package BASICS_OF_JAVA.PATTERN;

import java.util.Scanner;

public class CharR_Tri {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of max line of character : ");
        int n = sc.nextInt();
       
        for(int i=1;i<=n;i++){
            char ch ='A';
            for (int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            
            }
            System.out.println();
        }
        sc.close();

    }
}