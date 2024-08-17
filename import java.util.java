import java.util.Scanner;

public class Main{
    public static int giveindex(String menucard[] ,String order){
        for(int n=0;n<menucard.length;n++){
            if(menucard[n]==order){
                return n;
          }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menucard[]= {"dosa","idli","sambhar","samosa","naan","roll"};
        Scanner sc=new Scanner(System.in);
        System.out.println("give the order");
        String order=sc.next();
        int item=give(menucard,order);
        if(item==-1){
            System.out.println("ordered item not found");
        }
        else{
            System.out.println("ordered item index is "+ i);
        }

    }
}

