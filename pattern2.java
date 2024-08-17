import java.util.Scanner;

public class pattern2 {
    public static void invertedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("upto which row you want invertd half pyramid");
        int n=sc.nextInt();
        invertedHalfPyramid(n);
     }
     
}
