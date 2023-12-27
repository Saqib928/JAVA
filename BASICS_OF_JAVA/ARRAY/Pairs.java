package BASICS_OF_JAVA.ARRAY;

public class Pairs {
    public static void pairmaker(int number[]){
        int count =0;
        for(int i=0;i<number.length-1;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length-1;j++){
                System.out.print("("+curr+ "," +number[j]+")");
                count++;
            }System.out.println();
        }System.out.print("total pairs = "+ count);
    }
    public static void main (String args[]){
        int number[]={2,3,4,5,6,3,6};
        pairmaker(number);
    }
    
}
