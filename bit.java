import java.util.Scanner;

public class bit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("upto which number you want all prime numbers");
        int n=sc.nextInt();
        System.out.println("thr prime numbers till your given numbers are: ");
        
        boolean a=true;
        for(int i=2;i<=n;i++){
            for(int j=2;j<i;j++){
                if((i%j)==0){
                    a=false;
                    break;
                }
                else{
                    a=true;
                }
            }
            if(a==true){
                System.out.print(i+",");
            }
        }
    }
}