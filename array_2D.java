import java.util.*;

public class array_2D {
    public static boolean search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==key){
                System.out.println("key found at ("+i+","+j+")");
                return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void max_min(int arr[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                max=Math.max(max,arr[i][j]);
                min=Math.min(min,arr[i][j]);
            }
        }
        System.out.println("max value is "+max);
        System.out.println("min value is "+min);
    }
    public static void spriral_matrix(int arr[][]){
        int startrow=0;
        int endrow=arr.length;
        int startcol=0;
        int endcol=arr[0].length;
        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<endcol;j++){
                System.out.print(arr[startrow][j]+" ");
            }
            for(int i=startrow+1;i<endrow;i++){
                System.out.print(arr[i][endcol-1]+" ");
            }
            for(int j=endcol-2;j>=startcol;j--){
                System.out.print(arr[endrow-1][j]+" ");
            }
            for(int i=endrow-2;i>=startrow+1;i--){
                System.out.print(arr[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
            
        }

    }


    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("give the values of matrix");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("give the value of key");
        int key=sc.nextInt();
        search(matrix,key);
        max_min(matrix);
        spriral_matrix(matrix);


    }
    
}
