public class l85_3 {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        int [] arr={1,3,5,6};
        try{
            System.out.println(a/b);
            try{
                System.out.println(arr[6]);
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("program ends here");
    }
}
