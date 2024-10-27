public class palindrome{
    public static boolean check_palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("it is not a palindrome");
                return false;
            }
        }
        System.out.println("a palindrome string");
        return true;

    }
    public static void main(String[] args) {
        String str="nopon";
        check_palindrome(str);


    }
}