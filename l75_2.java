class mythr3 implements Runnable{

    public void run(){
        int i=0;
        while(i<500) {
            System.out.println("1111running");
            i++;
        }
    }
}
class mythr4 implements Runnable{
    public void run(){
        int i=0;
        while(i<500) {
            System.out.println("22222running");
            i++;
        }
    }
}

public class l75_2 {
    public static void main(String[] args) {
        mythr3 obj1=new mythr3();
        Thread t1=new Thread(obj1);
        t1.start();
        mythr4 obj2=new mythr4();
        Thread t2=new Thread(obj2);
        t2.start();

    }
}