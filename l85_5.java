import java.util.Scanner;

public class l85_5{
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);


        while(true){
            System.out.println("give value pls");
            int n=sc.nextInt();
            try {
                System.out.println(arr[n]);
                break;
                }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        System.out.println("program finished");

    }
}