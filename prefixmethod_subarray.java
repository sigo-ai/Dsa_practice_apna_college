import java.util.*;
public class prefixmethod_subarray {
    public static void maxsumofsubarray(int arr[]){
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prefix.length;i++){
            
            for(int j=i;j<prefix.length;j++){
                int sum=0;
                if(i==0){
                    sum=prefix[j];
                }
                else{
                   sum=prefix[j]-prefix[i-1];
                }
                System.out.println(sum);
                if(max<sum){
                    max=sum;
                }

            }
        }
        System.out.println("maximum sum of subarray is "+max);
    }
    public static void kadane(int arr[]){
        int cs=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            max=Math.max(cs,max);
        }
        System.out.println("maximum value of subarray is "+max);

    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxsumofsubarray(arr);
        kadane(arr);

    }
}
