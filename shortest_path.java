import java.util.*;
public class shortest_path {
    public static void shortest(String str){
        int x=0,x1=0;
        int y=0,y1=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y1++;
            }
            else if(str.charAt(i)=='S'){
                y1--;
            }
            else if(str.charAt(i)=='E'){
                x1++;
            }
            else if(str.charAt(i)=='W'){
                x1--;
            }
        }
        System.out.println(x1);
        System.out.println(y1);
        double sum=(x1-x)*(x1-x)+(y1-y)*(y1-y);
        double path=Math.sqrt(sum);
        System.out.println("shortest path of given route is "+path);
    }
    public static void main(String[] args) {
        String move=new String("WNEENESENNN");
        shortest(move);

    }
}
