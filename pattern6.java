import java.util.Scanner;

public class pattern6{
    public static void butterflyPattern(int n,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               System.out.print("*");
            }
            for(int k=1;k<=(m/2)-i;k++){
                  System.out.print(" ");
            }
            for(int l=1;l<=m/2;l++){
                if(l<=(m/2)-i){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }

            }
            System.out.println();

        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
               System.out.print("*");
            }
            for(int k=1;k<i;k++){
                  System.out.print(" ");
            }
            for(int l=1;l<=m/2;l++){
                if(l<i){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }

            }
            System.out.println();

        }     
            

     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("upto which row you want butterfly pattern");
        int n=sc.nextInt();
        System.out.println("upto which coloumn you want butterfly pattern !!it should be even!! 0r !! it should be twice of n");
        int m=sc.nextInt();
        butterflyPattern(n,m);
    }
} 