class mythr1 extends Thread{
    public void run(){
        int i=0;
        while(i<500){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}
class mythr2 extends Thread{
    public void run(){
        int i=0;
        while(i<500){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("welcome");
        }
    }
}

public class l76_2 {
    public static void main(String[] args) {
        mythr1 obj1=new mythr1();
        mythr2 obj2=new mythr2();
        obj1.start();
        obj2.start();
    }
}
