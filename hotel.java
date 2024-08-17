import java.util.Scanner;

public class hotel {
    public static int giveindex(String menu[],String order){
        for(int n=0;n<menu.length;n++){
            if(menu[n].equals(order)){
                return n;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("your order please");
        String order=sc.next();
        String menu[]={"dosa","idli","sambhar","chole bhature","samosa","naan","pau bhaji"};
        int index=giveindex(menu,order);
        if(index==-1){
            System.out.println("item not found");
        } else{
            System.out.println("ordered item index is "+ index +" which is "+menu[index]);
        }


    }
}
