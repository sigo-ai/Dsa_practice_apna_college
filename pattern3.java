import java.util.Scanner;

public class pattern3 {
    public static void invertedHalfPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
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
