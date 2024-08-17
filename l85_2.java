class MyException extends Exception{
    public String toString(){
        return "an unknown exception";
    }
    public String getMessage(){
        return "message got";
    }
}
public class l85_2 {
    static int demo(int a,int b){
        return a/b;
    }
    static int arr(int a){
        int [] array={3,5,7,5,7,8};
        return array[a];
    }
    static int un() throws MyException {
        throw new MyException();
    }
    public static void main(String[] args) {
        try{
            un();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(MyException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }


    }
}
