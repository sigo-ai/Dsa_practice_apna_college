import java.util.*;
import java.util.stream.IntStream;

public class arraylist {
    // reverse of an arraylist(time complexity o(n))
    public static void reverseAL(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    // maximum element in arraylist(time complexity o(n))
    public static int maxelementAL(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        return max;
    }

    // swapping two numbers by given indexes
    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    // container with most water
    // <<<<brute force approach(time complexity o(n^2))>>>>
    public static void container_With_MostWater_brute(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                max = Math.max(max, height * width);
            }
        }
        System.out.println("max value is " + max);
    }

    // <2 pointer approach(time complexity o(n))>
    // iteratively
    public static void container_With_MostWater_iterat(ArrayList<Integer> list) {
        int leftpointer = 0;
        int rightpointer = list.size() - 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int height = Math.min(list.get(leftpointer), list.get(rightpointer));
            int width = rightpointer - leftpointer;
            max = Math.max(max, height * width);
            if (leftpointer < rightpointer) {
                leftpointer++;
            } else {
                rightpointer--;
            }
        }
        System.out.println("max value is " + max);
    }

    // <2 pointer approach(time complexity o(n))>
    // recursively
    public static int container_With_MostWater_recur(ArrayList<Integer> list, int leftp, int rightp, int max) {
        if (leftp == rightp) {
            return max;
        }
        int height = Math.min(list.get(leftp), list.get(rightp));
        int width = rightp - leftp;
        max = Math.max(max, height * width);
        if (leftp < rightp) {
            return container_With_MostWater_recur(list, leftp + 1, rightp, max);
        } else {
            return container_With_MostWater_recur(list, leftp, rightp - 1, max);
        }
    }

    // pair sum
    // <brute force approach(time complexity o(n^2))>
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // <2 pointer approach(time complexity o(n))>
    // iteratively
    public static boolean pairsum_iter(ArrayList<Integer> list, int target) {
        int leftp = 0;
        int rightp = list.size() - 1;

        while (leftp != rightp) {
            int sum = list.get(leftp) + list.get(rightp);
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                leftp++;
                continue;
            } else {
                rightp--;
                continue;
            }
        }
        return false;
    }

    // pair sum 2(for sorted and rotated array)
    // time complexity o(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int sum = 0;
        int leftp = findPivot(list) + 1;
        int rightp = findPivot(list);
        while (leftp != rightp) {
            sum = list.get(leftp) + list.get(rightp);
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                leftp = (leftp + 1) % list.size();
            } else {
                rightp = (list.size() + rightp - 1) % list.size();
            }
        }
        return false;
    }

    public static int findPivot(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                return i;
            }
        }
        return -1;
    }

    // Arraylist questions

    // monotonic arraylist
    // brute force approach
    public static boolean check_Monotonic(ArrayList<Integer> list) {
        if (check_monotonicInc(list) || check_monotonicDec(list)) {
            return true;
        }
        return false;
    }

    public static boolean check_monotonicInc(ArrayList<Integer> list) {
        boolean value = false;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) <= list.get(i + 1)) {
                value = true;
            } else {
                value = false;
                break;
            }
        }
        return value;
    }

    public static boolean check_monotonicDec(ArrayList<Integer> list) {
        boolean value = false;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                value = true;
            } else {
                value = false;
                break;
            }
        }
        return value;
    }

    // <<< or >>>>>
    public static boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) > A.get(i + 1)) {
                inc = false;
            }
            if (A.get(i) < A.get(i + 1)) {
                dec = false;
            }
        }
        return inc || dec;
    }

    // lonely numbers
    public static void lonelyNumbers(ArrayList<Integer> list, int i) {
        if (i == list.size()) {
            return;
        }
        int num = list.get(i);
        for (int j = 0, k = 0; j < list.size(); j++) {
            if (num == list.get(j)) {
                k++;
                if (k >= 2) {
                    list.remove(i);
                    list.remove(j - 1);
                    break;
                }
            }
            if (num + 1 == list.get(j) || num - 1 == list.get(j)) {
                list.remove(i);
                list.remove(j - 1);
                break;
            }
        }
        lonelyNumbers(list, i + 1);
    }

    public static void lonelyNumbers2(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size() - 1));
            }
        }
    }

    // most frequent numbers following key
    public static void frequentNumbers(ArrayList<Integer> list, int key) {
        int arr[] = new int[1000];
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == key) {
                arr[list.get(i + 1) - 1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ans = i + 1;
            }
        }
        System.out.println(ans);
    }

    // Beautiful ArrayList(self)
    public static void beautifulArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        beautyPermutation(list);
        System.out.println(list);
    }
    public static void beautyPermutation(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 2; i++) {
            for (int k = i + 1; k > i && k + 1 < list.size(); k++) {
                if (2 * list.get(k) == (list.get(i) + list.get(k + 1))) {
                    if (k == list.size() - 2) {
                        int temp = list.get(k+1);
                        list.set(k+1, list.get(k));
                        list.set(k, temp);
                        break;
                    }
                    int temp = list.get(i);
                    list.set(i, list.get(k));
                    list.set(k, temp);
                }
            }
        }
    }
    //iterative
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        for(int i=2;i<=n;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(Integer e:ans){ 
                if(2*e<=n){
                    temp.add(e*2);
                }
             }
            for(Integer e:ans){
                if(2*e-1<=n){
                    temp.add(e*2-1);
                }
            }
            ans=temp;
        }return ans;
    }
    //recursive
    public static void beautifulArrayrec(int n){
        ArrayList<Integer> list=new ArrayList<>();
        divide_conqer(1,1,list,n);
        System.out.println(list);
    }
    public static void divide_conqer(int start,int increment,ArrayList<Integer> list,int n){
        if(start+increment>n){
            list.add(start);
            return;
        }
        divide_conqer(start, 2*increment, list, n);
        divide_conqer(start+increment, 2*increment, list, n);
    };

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

        // ArrayList<Integer> list1=new ArrayList<>();
        // list1.add(1);
        // list1.add(8);
        // list1.add(6);
        // list1.add(2);
        // list1.add(5);
        // list1.add(4);
        // list1.add(8);
        // list1.add(3);
        // list1.add(7);

        // reverseAL(list1);
        // System.out.println(maxelementAL(list1));
        // System.out.println(list1);
        // swap(list1,1,4);
        // System.out.println(list1);

        // sort in <<<<<<<ascending order>>>>>>>>>
        // Collections.sort(list1);
        // System.out.println(list1);

        // sort in <<<<<<<desending order>>>>>>>>>
        // Collections.sort(list1,Collections.reverseOrder());
        // System.out.println(list1);
        // or
        // Collections.reverse(list1);
        // System.out.println(list1);

        // multidimensional arraylist
        // ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        // ArrayList<Integer> list2=new ArrayList<>();
        // list2.add(2);
        // list2.add(4);
        // list2.add(3);
        // list2.add(1);
        // list2.add(0);
        // mainlist.add(list1);
        // mainlist.add(list2);
        // System.out.println(mainlist);
        // for(int i=0;i<mainlist.size();i++){
        // ArrayList<Integer> curr=mainlist.get(i);
        // for(int j=0;j<curr.size();j++){
        // System.out.print(curr.get(j)+" ");
        // }
        // System.out.println();
        // }

        // container_With_MostWater_brute(list1);
        // container_With_MostWater_iterat(list1);
        // System.out.print("max value is ");
        // System.out.println(container_With_MostWater_recur(list1, 0, list1.size()-1,
        // Integer.MIN_VALUE));

        ArrayList<Integer> list = new ArrayList<>();
        // list.add(11);
        // list.add(15);
        // list.add(6);
        // list.add(8);
        // list.add(9);
        // list.add(10);

        // System.out.println(pairSum(list, 13));
        // System.out.println(pairsum_iter(list,13 ));
        // System.out.println(pairSum2(list,19));

        // list.add(3);
        // list.add(3);
        // list.add(2);
        // list.add(3);
        // list.add(200);
        // list.add(1);
        // list.add(100);
        // System.out.println(check_Monotonic(list));
        // System.out.println(isMonotonic(list));
        // lonelyNumbers(list, 0);
        // System.out.println(list);
        // lonelyNumbers2(list);
        // System.out.println(list);
        // frequentNumbers(list, 2)

        // beautifulArrayList(4);
        // System.out.println(beautifulArray(4));
        // beautifulArrayrec(4);

        linkedlist ll=new linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.printll(ll);
        linkedlist l2=new linkedlist();
        l2.addFirst(3);
        l2.printll(l2);

        ll.addFirst(3);
        l2.addLast(4);
        ll.printll(ll);
        ll.printll(l2);

    }
}
