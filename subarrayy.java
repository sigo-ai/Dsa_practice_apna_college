public class subarrayy {
    public static void subarray(int arr[]){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i,m=0;j<arr.length & m<arr.length-i;j++,m++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                System.out.println(sum);
                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.println("max value of subarray "+ max);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        subarray(arr);

    }
}
