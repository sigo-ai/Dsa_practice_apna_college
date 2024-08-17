import java.util.Scanner;

public class pattern7 {
    public static void solidRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n){
                    System.out.print("*");
                }
                else{
                    if(j==1 || j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("upto which row you want solid rhombus");
        int n=sc.nextInt();
        solidRhombus(n);
        System.out.println("upto which row you want hollow rhombus");
        int m=sc.nextInt();
        hollowRhombus(m);
    }
}
