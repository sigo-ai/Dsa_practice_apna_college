import java.util.Scanner;
public class coefficient {

        public static int factorial(int x){
            if(x==0 || x==1){
                return 1;
            }
            return x*factorial(x-1);
        }
        public static void bc(int n,int r){
            int coefficient=factorial(n)/(factorial(r)*factorial(n-r));
            System.out.println("binomial coefficient is: "+ coefficient);

        }

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("give the value of n for nCr");
            int n=sc.nextInt();
            System.out.println("give the value of r for nCr");
            int r=sc.nextInt();
            bc(n,r);

        }
    }

