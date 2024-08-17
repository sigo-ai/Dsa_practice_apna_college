public class ques01 {
    public static void transpose_matrix(int arr[][]){
        int transpose[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                transpose[j][i]=arr[i][j];    
            }
        }
        System.out.println("normal matrix");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("transpose matrix");
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7}};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("the number of 7 in given 2d array are "+count);

        int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for(int i=1,j=0;j<nums[0].length;j++){
                if(i==1){
                    sum=sum+nums[i][j];
                }
        }
        System.out.println("sum of 2nd row elements is "+sum);
        int matrix[][]={{11,12,13},{21,22,23}};
        transpose_matrix(arr);
    }
}
