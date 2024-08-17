import java.util.Scanner;

public class l86_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("give value of a");
            int a=sc.nextInt();
            System.out.println("give value of b");
            int b=sc.nextInt();
            System.out.println(a/b);
        }
        catch(IllegalArgumentException e){
            System.out.println("hehe");
        }
        catch(ArithmeticException e){
            System.out.println("haha");
        }
    }
}
