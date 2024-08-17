import java.util.Scanner;

public class pattern1 {
    public static void hollowRectangle(int row,int coloumn){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=coloumn;j++){
                if(i==1 || i==row || j==1 || j==coloumn){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give number of rows");
        int n=sc.nextInt();
        System.out.println("give numbers of coloumns");
        int m=sc.nextInt();
        hollowRectangle(n, m);
    }
}