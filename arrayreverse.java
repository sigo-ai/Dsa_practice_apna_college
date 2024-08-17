public class arrayreverse{
    public static void reverse(int arr[]){
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int empty=arr[i];
            arr[i]=arr[j];
            arr[j]=empty;
        }
        System.out.println("the reversed array is ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        reverse(arr);

    }
}