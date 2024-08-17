import java.util.Scanner;

class CustomException extends Exception{
    public String toString(){
        return "reterivals exceeds 5 times " +
                "we can not let you run our program for 24 hours";
    }
}
public class l86_2 {
    public static void box(){
        int[] arr = {23, 45, 2, 4, 67, 24};
        int i = 0;
        Scanner sc = new Scanner(System.in);

        while (i < 6) {
            try {
                if (i == 5) {
                    throw new CustomException();
                }
            } catch (CustomException e) {
                System.out.println(e);
                break;
            }
            System.out.println("give value of n");
            int n = sc.nextInt();
            try {
                System.out.println(arr[n]);
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
        public static void main(String[] args){
            try{
                box();
            }

            finally{
                System.out.println("program finished");
            }

        }
    }

