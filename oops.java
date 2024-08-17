import java.util.*;

class complex{
    
    public static void sum(int a,int b,int c,int d){
        System.out.println((a+c)+"+i"+(b+d));
    }
    public static void difference(int a,int b,int c,int d){
        System.out.println((a-c)+"+i"+(b-d));
    }
    public static void product(int a,int b,int c,int d){
        System.out.println((a*c-b*d)+"+i"+(a*c+b*d));
    }
}

public class oops {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(a+"+i"+b);
        System.out.println(c+"+i"+d);
        complex com=new complex();
        com.sum(a,b,c,d);
        com.difference(a, b, c, d);
        com.product(a, b, c, d);
        
    }
}
