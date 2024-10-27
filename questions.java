import java.util.*;

public class questions {
    public static void question1(int arr[], int key, int si, int ei) {
        if (si > ei) {
            return;
        }
        if (arr[si] == key || arr[ei] == key) {
            if (arr[si] == key && arr[ei] == key) {
                question1(arr, key, si + 1, ei - 1);
                System.out.println(si);
                System.out.println(ei);
            } else if (arr[si] == key) {
                question1(arr, key, si + 1, ei - 1);
                System.out.println(si);
            } else {
                question1(arr, key, si + 1, ei - 1);
                System.out.println(ei);
            }
        } else {
            question1(arr, key, si + 1, ei - 1);
        }
    }

    public static void question1mod(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i);
        }
        question1mod(arr, key, i + 1);
    }

    public static void question2(String n, int i) {
        if (i == n.length()) {
            return;
        }
        switch (n.charAt(i)) {
            case '0':
                System.out.print("zero ");
                question2(n, i + 1);
                return;
            case '1':
                System.out.print("one ");
                question2(n, i + 1);
                return;
            case '2':
                System.out.print("two ");
                question2(n, i + 1);
                return;
            case '3':
                System.out.print("three ");
                question2(n, i + 1);
                return;
            case '4':
                System.out.print("four ");
                question2(n, i + 1);
                return;
            case '5':
                System.out.print("five ");
                question2(n, i + 1);
                return;
            case '6':
                System.out.print("six ");
                question2(n, i + 1);
                return;
            case '7':
                System.out.print("seven ");
                question2(n, i + 1);
                return;
            case '8':
                System.out.print("eight ");
                question2(n, i + 1);
                return;
            case '9':
                System.out.print("nine ");
                question2(n, i + 1);
                return;
            default:
                return;
        }
    }

    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void question2mod(int num) {
        if (num == 0) {
            return;
        }
        int lastdigit = num % 10;
        question2mod(num / 10);
        System.out.print(digits[lastdigit]);
        System.out.print(" ");
    }

    public static int strlength(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return strlength(str.substring(1)) + 1;
    }

    // public static void substrings(String str){
    //     for(int i=0;i<str.length();i++){
    //         System.out.print(str.charAt(i)+" ");
    //     }
    //     for(int i=0;i<str.length();i++){
    //         for(int j=i+1;j<str.length();j++){
    //             if(str.charAt(i)==str.charAt(j)){
    //                 System.out.print(str.substring(i, j+1)+" ");
    //             }
    //         }
    //     }
    // }

    public static int substring(String str,int start,int end,int len ){
        if(len==1){
            return 1;
        }
        if(len==0){
            return 0;
        }

        int result=substring(str, start+1, end, len-1)+
        substring(str, start, end-1, len-1)-substring(str, start+1, end-1, len-2);

        if(str.charAt(start)==str.charAt(end)){
            result++;
        }
        return result;
    }

    public static void towerOfHanoi(int tower_A[],int n){
        for(int i=0;i<n;i++){
            tower_A[i]=i+1;
        }
        for(int i=0;i<n;i++){
            System.out.println(tower_A[i]);
        }
        
    }
    // public static void shiftTowerOfHanoi(int disk_number,String source,String helper,String destination ){
    //     if(disk_number==0){
    //         return;
    //     }
    //     if(disk_number==1){
    //         System.out.println("transfer disk" + disk_number + "from" + source + "to" + destination);
    //         return;
    //     }

    //     shiftTowerOfHanoi(disk_number-1,source,destination,helper);
    //     System.out.println("transfer disk" + disk_number + "from" + source + "to" + helper);
    //     shiftTowerOfHanoi(disk_number-1,helper,source,destination);

    //  }

    public static void shiftTowerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk"+ n + "from" + src + "to" + dest);
            return;
        }

        shiftTowerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk"+ n + "from" + src + "to" + dest);
        shiftTowerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // question1(arr, 2, 0, arr.length - 1);
        // question1mod(arr, 2, 0);
        // question2("1947", 0);
        // question2mod(1947);
        //System.out.println(strlength("abcde"));

        //int total_substr=substring("abcab",0,4,5);
        //System.out.println(total_substr);
    
        // Scanner sc=new Scanner(System.in);
        // System.out.print("give no.of disks: ");
        // int n=sc.nextInt();
        // int tower_A[]=new int[n];
        // int tower_B[]=new int[n];
        // int tower_C[]=new int[n];
        // towerOfHanoi(tower_A,n);
        shiftTowerOfHanoi(3,"S","H","D");
    }
}
