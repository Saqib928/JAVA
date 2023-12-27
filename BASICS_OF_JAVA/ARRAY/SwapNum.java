package BASICS_OF_JAVA.ARRAY;

public class SwapNum {
    public static void swap(int number[]){
        int first =0;
        int last = number.length-1;
        while(first<last){
            int temp = number[last];
            number[last] = number [first];
            number[first] = temp;
            first++;
            last--;
        }
    }
    public static void main (String args[]){
        int number [] ={2,4,5,1,4,2,6,3,2};
        swap(number);
       for(int i=0;i<number.length;i++){
        System.out.print(number[i]+" ");
       }System.out.println();
    }
}
