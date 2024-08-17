import java.util.*;

public class largestinarray {
    public static void getlargest(int array[]){
        int larger=Integer.MIN_VALUE;
        int smaller=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(larger<array[i]){
                larger=array[i];
            }
            if(smaller>array[i]){
                smaller=array[i];
            }
        }
        System.out.println("largest value of your array is "+ larger);
        System.out.println("smallest value of your array is "+ smaller);


    }
    public static void main(String[] args) {
        int array[]={1,3,5,46,7,98,77,44,45,88,4,2,6,63,100};
        getlargest(array);

    }
}
