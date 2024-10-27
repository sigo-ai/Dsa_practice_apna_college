import java.util.Scanner;

public class bit_manipulation {
    public static void dtob(int n) {
        Scanner sc=new Scanner(System.in);
        int power=0;
        int bin=0;
        while(n>0){
            
            bin=bin+(n%2)*(int)Math.pow(10,power);
            n=n/2;
            power++;
        }
        System.out.println(bin);
    }
    public static void odd_even(int n){
        if((n & 1)==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void getithbit(int n,int i){
        if((n & (1<<i))==0){
            System.out.println("ith bit is 0");
        }
        else{
            System.out.println("ith bit is 1");
        }
    }
    public static void setIthBit(int n,int i){
        System.out.println(n | 1<<i);
    }
    public static void clearIthBit(int n,int i){
        System.out.println(n & ~(1<<i));
    }
    public static void updateIthBit(int n,int i,int update){
        clearIthBit(n, i);
        System.out.println(n | update<<i);
    }
    public static void clearLastIthBit(int n,int i){
        System.out.println(n & (~0<<i));
    }
    public static void clearRangeOfBits(int n,int i,int j){
        int bit=(~0<<i) | ~(~0<<j);
        System.out.println(n & bit);
    }
    public static void checkPowerOf2(int n){
        if((n & (n-1))==0){
            System.out.println("the number is power of 2");
        }
        else{
            System.out.println("not a power of 2");
        }
    }
    public static void countSetBit(int n){
        int count=0;
        while(n>0){
            if((n & 1)==1){
                count++;
            }
            n=n>>1;    
        }
        System.out.println("the number of set bits are "+count);
    }
    public static void fastExponentiation(int base,int power){
        int answer=1;
        while(power>0){
            if((power & 1)==1){
                answer=answer*base;
                base=base*base;
            }
            else{
                base=base*base;
            }
            power=power>>1;
        }
        System.out.println(answer);
    }
    public static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("value of a is "+a+" and b is "+b);
    }
    public static void add1(int n){
        if((n | 1)!=n){
            System.out.println(n | 1);
        }
        else{
            System.out.println(-(~n));
        }
    }
    public static void uppertolower(){
        for(char ch='a';ch<='z';ch++){
            System.out.print((char)(ch & '_'));
        }
    }

    public static void main(String[] args) {
        dtob(5);
        dtob(6);
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println(5>>2);
        odd_even(24);
        getithbit(5, 2);
        setIthBit(5, 1);
        clearIthBit(5, 1);
        updateIthBit(5, 1, 1);
        clearLastIthBit(15, 2);
        clearRangeOfBits(215, 5, 2);
        checkPowerOf2(5);
        checkPowerOf2(4);
        checkPowerOf2(14);
        checkPowerOf2(16);;
        countSetBit(215);
        fastExponentiation(5, 3);
        fastExponentiation(2, 5);
        fastExponentiation(6, 5);
        int a=3;
        int b=5;
        swap(a,b);
        add1(13);
        uppertolower();
    }
}
