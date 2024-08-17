class MyException1 extends Exception {
    public String toString() {
        return "ohhhh! Exception occured";
    }

    public String getMessage(String a) {
        return a;
    }

    public MyException1(String b) {
        getMessage(b);
    }
}
public class l85_4  {
    public static int demo(int a,int b) throws MyException1{
        if(b==0){
            throw new MyException1("i am ready");
        }
        return a/b;
    }
    public static void main(String[] args) {
       try {
           System.out.println(demo(5, 0));
           System.out.println(demo(7,0));

       }
       catch(Exception e){
           System.out.println(e);
           System.out.println(e.getMessage());
       }
       finally{
           System.out.println("nothing can stop me");
       }

    }
}
