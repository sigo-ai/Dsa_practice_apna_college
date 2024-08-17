class mythr extends Thread{
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("Good Morning");
            System.out.println("welcome");
            i++;
        }
    }
}

public class l76_1 {
    public static void main(String[] args) {
        mythr obj=new mythr();
        obj.start();
    }
}
