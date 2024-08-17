class mythr extends Thread{
    public void run(){
        try{
            Thread.sleep(450);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
        }
public class l85_1 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        System.out.println(a/b);
    }
}
