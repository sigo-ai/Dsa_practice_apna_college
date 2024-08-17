import java.util.Scanner;

public class bonus{
    public static void numberPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                if(j%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }   
     }
     public static void nP(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }   
     }
     public static void palindromicPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i-j);
            }
            for(int j=1,a=2;j<i;j++){
                System.out.print(a++);
            }
            System.out.println();
        }
     }
     public static void pP(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("upto which row you want number pyramid");
        int n=sc.nextInt();
        numberPyramid(n);
        nP(n);
        System.out.println("upto which row you want palindromic pattern");
        int m=sc.nextInt();
        palindromicPattern(m);
        pP(m);
    }
}