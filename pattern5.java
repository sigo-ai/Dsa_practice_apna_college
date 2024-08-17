import java.util.Scanner;

public class pattern5 {
    public static void triangle01(int n){
        for(int i=1,k=1;i<=n;i++){
            for(int j=0;j<i;j++){
               if (i%2==0){
                System.out.print(k);
                if(j!=i-1){
                    switch (k) {
                    case 1:k--;
                        break;
                    case 0:k++;
                        break;
                    default:
                        break;
                }
              }
               }
                else{
                  System.out.print(k);
                  switch (k) {
                    case 1:k--;
                        break;
                    case 0:k++;
                        break;
                    default:
                        break;
                    }
              }  
            }
            System.out.println();
        }
    }
    public static void t01(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("upto which row you want 0-1 triangle");
        int n=sc.nextInt();
        triangle01(n);
        System.out.println("wait.......");
        t01(n);
    }
}
