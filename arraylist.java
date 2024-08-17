import java.util.*;

public class arraylist {
    //reverse of an arraylist
    public static void reverseAL(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        // //arraylist creation by java collection framework
        // ArrayList<Integer> list1=new ArrayList<>();
        // ArrayList<Integer> list2=new ArrayList<>();
        // ArrayList<Integer> list3=new ArrayList<>();

        // //some operations on arraylist
        // //add element(time complexity o(1))
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // System.out.println(list1);
        // //get element(timr complexity o(1))
        // int value1=list1.get(0);
        // System.out.println(value1);
        // int value2=list1.get(1);
        // System.out.println(value2);
        // //remove element(time complexity o(n))
        // list1.remove(0);
        // list1.remove(1);
        // System.out.println(list1);
        // //set/replace element(time complexity o(n))
        // list1.set(0, 1);
        // System.out.println(list1);
        // list1.set(0, 10);
        // System.out.println(list1);
        // //check element(time complexity o(n))
        // System.out.println(list1.contains(1));
        // //add element at any index(time complexity o(n))
        // list1.add(1,2);
        // list1.add(1,3);
        // System.out.println(list1);

        // //size of arraylist
        // int len=list1.size();
        // System.out.println(len);

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        reverseAL(list1);
    }
}
