import java.util.*;
public class counting_sort {
    public static void arrange(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int frequency[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            frequency[arr[i]]++;
        }
        for(int i=0,j=0;i<frequency.length;i++){
            while(frequency[i]>0){
                arr[j]=i;
                frequency[i]--;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void arrange_descending(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int frequency[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
            frequency[arr[i]]++;
        }
        for(int i=frequency.length-1,j=0;i>=0;i--){
            while(frequency[i]>0){
                arr[j]=i;
                frequency[i]--;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        arrange(arr);
        arrange_descending(arr);

    }
}
