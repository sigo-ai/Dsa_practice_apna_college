import java.util.Scanner;

public class diagonal_sum {
    public static void diagonal_sum_meth1(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                else if(i+j==arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("diagonal sum of given matrix is "+sum);

    }
    public static void diagonal_sum_meth2(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!=arr.length-i-1){
            sum+=arr[i][arr.length-i-1]; 
            }     
        }
        System.out.println("diagonal sum of given matrix is "+sum);
    }
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("give the values of matrix");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        diagonal_sum_meth1(arr);
        diagonal_sum_meth2(arr);
    }
}
