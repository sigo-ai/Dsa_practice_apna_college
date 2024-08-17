import java.util.Scanner;
import java.lang.Math;

public class btod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please give the binary number which you want to convert in decimal");
        int n=sc.nextInt();
        int decimal=0;
        int i=0;
        while(n>0){
            int ld=n%10;
            decimal=decimal+ld*((int)Math.pow(2,i));
            n=n/10;
            i++;
        }
        System.out.println(decimal);

    }
}
