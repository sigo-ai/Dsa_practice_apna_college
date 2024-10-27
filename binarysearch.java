import java.util.Scanner;

public class binarysearch {
    public static void searchValue(int arr[],int check){
        int start=0, end=arr.length-1, mid=(start+end)/2;
        while(start<=end){
            if(arr[start]==check){
                System.out.println("index of your given value is "+ start);
                break;
            }
            else if(arr[end]==check){
                System.out.println("index of your given value is "+ end);
                break;
            }
            else if(arr[mid]==check){
                System.out.println("index of your given value is "+ mid);
                break;
            }
            else if(arr[mid]<check){
                start=mid;
                end=end-1;
            }
            else{
                end=mid-1;
                start=start+1;

            }
            
        
        }
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100};
        Scanner sc=new Scanner(System.in);
        System.out.println("give the key");
        int key=sc.nextInt();
        searchValue(array,key);

    }
}
