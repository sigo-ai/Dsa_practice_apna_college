class mythr3 extends Thread{
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("Good Morning");
            i++;
        }
    }
}
class mythr4 extends Thread{
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("welcome");
            i++;
        }
    }
}

public class l76_3 {
    public static void main(String[] args) {
        mythr3 obj1=new mythr3();
        mythr4 obj2=new mythr4();
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(obj1.getPriority());
        System.out.println(obj1.getId());
        System.out.println(obj2.getPriority());
        System.out.println(obj2.getId());
        obj1.start();
        obj2.start();
    }
    
}

