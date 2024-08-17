class mythr1 extends Thread{
    public mythr1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<500) {
            System.out.println("111111running");
            try{
                Thread.sleep(334);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
           i++;
        }
    }
}
class mythr2 extends Thread{
    public mythr2(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<500) {
            System.out.println("22222running");
            i++;
        }
    }
}

public class l75_1 {
    public static void main(String[] args) {
        mythr1 obj1=new mythr1("harry1");
        mythr2 obj2=new mythr2("harry2");
        obj1.start();
        System.out.println(obj1.getName());
        System.out.println(obj1.getId());
        obj2.start();
        System.out.println(obj2.getName());
        System.out.println(obj2.getId());
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);
        try{
            obj1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }



    }
}
