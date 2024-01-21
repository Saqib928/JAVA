package BASICS_OF_JAVA.ARRAY;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter Number of Column : ");
        int col = sc.nextInt();
        int matrix[][] = new int [row][col];
        System.out.print("Enter the element in 2D Array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Here is Your 2D ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
