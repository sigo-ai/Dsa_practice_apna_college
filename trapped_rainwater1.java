
import java.util.*;
public class trapped_rainwater1 {
    public static void trapped_water(int arr[]){
        int left_max[]=new int[arr.length];
        left_max[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            left_max[i]=Math.max(arr[i],left_max[i-1]);
        }

        int right_max[]=new int[arr.length];
        right_max[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            right_max[i]=Math.max(arr[i],right_max[i+1]);
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
        }
        System.out.println("total trapped water is "+total_trapped_water);
    }
    public static void main(String[] args) {
        int height_bar[]={4,2,0,6,3,2,5};
        trapped_water(height_bar);
    }
}
