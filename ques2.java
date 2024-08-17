import java.util.Scanner;

public class ques2 {
    public static void lowercase_vowels(String str){
        int count=0;
        for(int j=0;j<str.length();j++){
            char c=str.charAt(j);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        System.out.println("number of lowercase vowel in given string is "+count);

    }

    public static void check_anagrams(String str1,String str2){
        int count=0;
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        if(count==str1.length()){
            System.out.println("strings are anagrams");
        }
        else{
            System.out.println("not anagrams");
        } 

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        lowercase_vowels(str);
        System.out.println("enter the string");
        String str1=sc.nextLine();
        System.out.println("enter the string");
        String str2=sc.nextLine();
        check_anagrams(str1, str2);
    }
}
