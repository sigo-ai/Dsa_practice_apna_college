import java.util.Scanner;
import java.lang.Math;

public class dtob{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give the decimal for convert to binary");
        int n=sc.nextInt();
        int power=0;
        int bin=0;
        while(n>0){
            
            bin=bin+(n%2)*(int)Math.pow(10,power);
            n=n/2;
            power++;
        }
        System.out.println(bin);
    }
}