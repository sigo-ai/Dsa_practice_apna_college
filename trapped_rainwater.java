import java.util.*;
public class trapped_rainwater {
    public static void trapped_water(int arr[]){
        int left_max[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            left_max[i]=arr[i];
            for(int j=i;j>=0;j--){
                if(arr[j]>=arr[i] && left_max[i]<arr[j]){
                    left_max[i]=arr[j];
                }
            }
        }
        int right_max[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            right_max[i]=arr[i];
            for(int j=i;j<arr.length;j++){
                if(arr[j]>=arr[i] && right_max[i]<arr[j]){
                    right_max[i]=arr[j];
                }
            }
        }
        int total_trapped_water=0;
        for(int i=0;i<arr.length;i++){
            int water_level=0;
            water_level=Math.min(left_max[i],right_max[i]);
            int actual_water_level=water_level-arr[i];
            if(actual_water_level<0){
                actual_water_level=0;
                total_trapped_water+=actual_water_level;
            }
            else{
                total_trapped_water+=actual_water_level;
            }
            System.out.println(total_trapped_water);
        }
        System.out.println("total trapped water is "+total_trapped_water);
    }
    public static void main(String[] args) {
        int height_bar[]={4,2,0,6,3,2,5};
        trapped_water(height_bar);
    }
}
