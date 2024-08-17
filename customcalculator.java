
import java.util.Scanner;

class InvalidInputException extends Exception{
    public String toString(){
        return "you have given the wrong input!! This is not the valid input for calculation";
    }
}
class CannotDivideBy0Exception extends Exception{
    public String toString(){
        return "divide any value by 0 is not possible in mathematics";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "the input value cannot be exceed 100000";
    }
}
class MaxMultiplierReachedException extends Exception{
    public String toString(){
        return "the input for multiplication can not be exceed 70000";
    }
}


public class customcalculator{
    public static void addition(double a,double b){
        System.out.print("Answer is: ");
        System.out.println(a+b);
    }
    public static void substraction(double a,double b){
        System.out.print("Answer is: ");
        System.out.println(a-b);
    }
    public static void multiplication(double a,double b){
        try{
            if(a>7000 || b>7000){
                throw new MaxMultiplierReachedException();
            }
            System.out.println("Answer is: ");
            System.out.println(a*b);
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
    public static void division(double a,double b){

        try{
            if(b==0){
                throw new CannotDivideBy0Exception();
            }
            System.out.println("Answer is: ");
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("give value 1");
        double a=sc.nextDouble();
        System.out.println("give value 2");
        double b=sc.nextDouble();
        System.out.println("what will you want to do with this values");
        String str=sc.next();

        try{

            if(a>100000 || b>100000){
                throw new MaxInputException();
            }
            try{
                if(str.equals("+")){
                    addition(a,b);
                }
                else if(str.equals("-")){
                    substraction(a,b);
                }
                else if(str.equals("*")){
                    multiplication(a,b);
                }
                else if(str.equals("/")){
                    division(a,b);
                }
                else{
                    throw new InvalidInputException();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}