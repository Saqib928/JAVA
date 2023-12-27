package BASICS_OF_JAVA.ARRAY;

public class LinearSearch {
    public static int search(int Number[],int key){
        for(int i=0;i<=Number.length;i++){
            if(Number[i]==key){
                return i;
            }
           
        }return -1;
    }
    public static void main (String args[]){
        int number[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int key = 8;
        int index = search(number,key);
         if (index != -1){
                System.out.println("number found at :" + index);
            }
            else{
                System.out.println("number not found");
            }
    }
}
