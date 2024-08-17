import java.util.Scanner;

public class menu{
    public static int giveindex(menucard[] ,String order){
        for(int i=0;i<menucard.length;i++){
            if(menucard[i]==order){
                return i;
          }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menucard[]= {"dosa","idli","sambhar","samosa","naan","roll"};
        Scanner sc=new Scanner(System.in);
        System.out.println("give the order");
        String order=sc.next();
        item=give(menucard,order);
        if(item==-1){
            System.out.println("ordered item not found");
        }
        else{
            System.out.println("ordered item index is "+ i);
        }

    }
}