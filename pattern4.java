import java.util.Scanner;

public class pattern4 {
    public static void floydsTriangle(int n){
        for(int i=1,j=1;i<=n;i++){
            for(int k=0;k<i;j++,k++){
                System.out.print(j+",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("upto which row you want floyds triangle");
        int n=sc.nextInt();
        floydsTriangle(n);
    }
}
