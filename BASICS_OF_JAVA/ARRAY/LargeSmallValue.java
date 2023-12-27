package BASICS_OF_JAVA.ARRAY;
public class LargeSmallValue {
    public static int find(int number[]){
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
        if(large<number[i]){
            large=number[i];
        }
        if(small>number[i]){
            small = number[i];
        }
        }
        System.out.println(small);
        return large;
    }
    public static void main(String args[]){
        int number[]={2,3,6,4,7,9,1,5};
        System.out.println(find(number));
    }
}
