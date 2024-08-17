import java.util.*;
import java.math.*;
import java.beans.IntrospectionException;
import java.lang.String;

public class recursion {

    public static void decreasing(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
            decreasing(n - 1);
        }
    }

    public static int i = 1;

    public static void increasing1(int n) {
        if (i == n) {
            System.out.println(n);
        } else {
            System.out.println(i);
            i++;
            increasing1(n);
        }
    }

    public static void increasing2(int n) {
        if (n == 1) {
            System.out.println(n);
        } else {
            increasing2(n - 1);
            System.out.println(n);
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int sumOfNatural(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfNatural(n - 1);
        }
    }

    public static int fibonacchi(int nth) {
        if (nth == 0) {
            return 0;
        } else if (nth == 1) {
            return 1;
        } else {
            return fibonacchi(nth - 1) + fibonacchi(nth - 2);
        }
    }

    public static void issorted(int arr[], int i) {
        if (arr[i] < arr[i + 1]) {
            i++;
            if (i < arr.length - 1) {
                issorted(arr, i);
            } else {
                System.out.println("array is sorted");
                return;
            }
        } else {
            System.out.println("not an sorted array");
            return;
        }
    }

    public static int fistOccurence(int arr[], int key, int i) {
        if (arr[i] == key) {
            System.out.println(i);
            return i;
        } else if (i == arr.length - 1) {
            System.out.println("key not found");
            return -1;
        } else {
            return fistOccurence(arr, key, i + 1);
        }
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (arr[i] == key) {
            System.out.println(i);
            return i;
        } else if (i == -1) {
            System.out.println("key not found");
            return -1;
        } else {
            return lastOccurence(arr, key, i - 1);
        }
    }

    public static int xPower_n(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * xPower_n(x, n - 1);
    }

    public static int xPower_nOptimised(int x, int n) {
        if (n % 2 == 0 && n > 0) {
            return xPower_nOptimised(x, n / 2) * xPower_nOptimised(x, n / 2);
        }
        if (n % 2 != 0 & n > 0) {
            return x * xPower_nOptimised(x, (n - 1) / 2) * xPower_nOptimised(x, (n - 1) / 2);
        } else {
            return 1;
        }
    }

    public static int tilling_problem(int n) {
        // size of area lxb
        // size of tile 2x1
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tilling_problem(n - 1);
        int fnm2 = tilling_problem(n - 2);

        return fnm1 + fnm2;
    }

    public static StringBuilder s = new StringBuilder("");

    public static void remove_duplicates1(String str, int i) {
        boolean a = false;
        if (i < str.length()) {
            for (int j = 0; j < s.length(); j++) {
                if (str.charAt(i) == s.charAt(j)) {
                    a = true;
                    break;
                }
            }
            if (a == false) {
                s.append(str.charAt(i));
            }
            remove_duplicates1(str, i + 1);
        } else {
            System.out.println(s);
        }
    }

    public static void removeDuplicates2(String str, int i, StringBuilder newstr, boolean map[]) {
        if (i == str.length()) {
            System.out.println(newstr);
            return;
        }

        char ch = str.charAt(i);
        if (map[ch - 'a'] == true) {
            removeDuplicates2(str, i + 1, newstr, map);
        } else {
            map[ch - 'a'] = true;
            removeDuplicates2(str, i + 1, newstr.append(ch), map);
        }
    }

    public static int friends_pairing(int m) {
        if (m == 1 || m == 2) {
            return m;
        }
        int total = (factorial(m) / (factorial(m - 2) * factorial(2))) + 1;
        return total;
    }

    public static int fPP(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int tways = fPP(n - 1) + (n - 1) * fPP(n - 2);
        return tways;
    }

    public static int lp = 0;

    public static void binary_string(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        if (lastplace == 0) {
            binary_string(n - 1, 0, str + "0");
            binary_string(n - 1, 1, str + "1");
        } else {
            binary_string(n - 1, 0, str + "0");
        }

    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mi = si + (ei - si) / 2;
        mergeSort(arr, si, mi);
        mergeSort(arr, mi + 1, ei);
        merge(arr, si, mi, ei);
    }

    public static void merge(int arr[], int si, int mi, int ei) {
        int i = 0;
        int j = si;
        int mid = mi + 1;
        int temp[] = new int[ei - j + 1];
        while (j <= mi && mid <= ei) {
            if (arr[j] < arr[mid]) {
                temp[i] = arr[j];
                i++;
                j++;
            } else {
                temp[i] = arr[mid];
                i++;
                (mid)++;
            }
        }
        while (j <= mi) {
            temp[i++] = arr[j++];
        }
        while (mid <= ei) {
            temp[i++] = arr[mid++];
        }

        for (i = 0, j = si; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivInd = divideAndConqueour(arr, si, ei);
        quickSort(arr, si, pivInd - 1);
        quickSort(arr, pivInd + 1, ei);
    }

    public static int divideAndConqueour(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int j = si - 1;
        for (int i = si; i <= ei; i++) {
            if (arr[i] <= pivot) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return j;
    }

    public static void sorted_RotatedArray(int arr[], int target) {
        int si = 0;
        int ei = arr.length - 1;

        int mid = (si + ei) / 2;
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                for (int i = si; i <= mid; i++) {
                    if (arr[i] == target) {
                        System.out.println("index of target is: " + i);
                    }
                }
            } else {
                for (int i = mid + 1; i <= ei; i++) {
                    if (arr[i] == target) {
                        System.out.println("index of target is: " + i);
                    }
                }
            }
        } else {
            if (arr[mid] <= target && target <= arr[ei]) {
                for (int i = mid; i <= ei; i++) {
                    if (arr[i] == target) {
                        System.out.println("index of target is: " + i);
                    }
                }
            } else {
                for (int i = si; i <= mid; i++) {
                    if (arr[i] == target) {
                        System.out.println("index of target is: " + i);
                    }
                }
            }
        }
    }

    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        // target = mid
        if (arr[mid] == target) {
            return mid;
        }
        // target on line 1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                return search(arr, target, mid + 1, ei);
            }
        }
        // target on line 2
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    // question using merge sort
    public static void mergesort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // finding mid for break arr
        int mi = si + (ei - si) / 2;
        // left part
        mergesort(arr, si, mi);
        // right part
        mergesort(arr, mi + 1, ei);
        // call for merge individuals in ascending and descending order
        nowmerge(arr, si, mi, ei);

    }

    public static void nowmerge(String arr[], int si, int mi, int ei) {
        int k = 0;
        int i = 0;
        int j = si;
        int mid = mi + 1;
        String temp[] = new String[ei - j + 1];
        while (j <= mi && mid <= ei) {
            if (issmaller(arr[j], arr[mid])) {
                temp[i] = arr[j];
                i++;
                j++;
            } else {
                temp[i] = arr[mid];
                
                i++;
                mid++;
            }
        }
        while (j <= mi) {
            temp[i++] = arr[j++];
        }
        while (mid <= ei) {
            temp[i++] = arr[mid++];
        }
        for (i = 0, j = si; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }
    }

    public static boolean issmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;

    }

    public static void printarr(String arr[], int si) {
        for (i = si; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    public static void printarr(int arr[], int si) {
        for (i = si; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    // brute force approach of majority element problem
    public static int findmajority(int arr[]) {
        int temp[] = new int[maxvalue(arr, 0) + 1];
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            if (j != temp.length) {
                temp[j] = temp[j] + 1;
            }
        }
        int ntimes = maxvalue(temp, 0);
        if (ntimes > temp.length / 2) {
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] == ntimes) {
                    return i;
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int maxvalue(int arr[], int index) {
        if (index == arr.length) {
            return Integer.MIN_VALUE;
        }
        return Integer.max(arr[index], maxvalue(arr, index + 1));
    }

    // brute force approach code for inversion sort
    public static void inversionCount(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.println("inversion count is");
        System.out.println(count);
    }
    

    //better approach than brute force of time complexity

    public static int mergeinv(int arr[], int si, int mi, int ei) {
        int i = 0;
        int j = si;
        int mid = mi + 1;
        int invcount=0;
        int temp[] = new int[ei - j + 1];
        while (j <= mi && mid <= ei) {
            if (arr[j] < arr[mid]) {
                temp[i] = arr[j];
                i++;
                j++;
            } else {
                temp[i] = arr[mid];
                invcount+=(mi-i);
                i++;
                (mid)++;
            }
        }
        while (j <= mi) {
            temp[i++] = arr[j++];
        }
        while (mid <= ei) {
            temp[i++] = arr[mid++];
        }

        for (i = 0, j = si; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }
        return invcount;
    }

    public static int mergesortinvcount(int arr[],int si,int li){
        int invcount=0;
        if(li>si){
            int mid=si+(li-si)/2;

            invcount=mergesortinvcount(arr, si, mid);
            invcount+=mergesortinvcount(arr, mid+1, li) ;
            invcount+=mergeinv(arr, si, mid, li);
        }

        return invcount;
    }
    public static void main(String[] args) {
        // decreasing(1);
        // increasing1(1);
        // increasing2(1);
        // System.out.println(factorial(5));
        // System.out.println(sumOfNatural(5));
        // System.out.println(fibonacchi(50));
        // int arr[]={1,6,3,4,5,3,5,6,9,8};
        // issorted(arr,0);
        // lastOccurence(arr, 3, arr.length-1);
        // System.out.println(xPower_n(5, 10));
        // System.out.println(xPower_nOptimised(2, 5));
        // System.out.println(tilling_problem(3));
        // remove_duplicates1("appnacollege",0);
        // removeDuplicates2("apppnncollege",0,new StringBuilder(""),new boolean[26]);
        // System.out.println(friends_pairing(6));
        // System.out.println(fPP(6));
        // binary_string(3, 0, "");
        // int arr[] = { 3, 2, 6, 9, 7, 8 };
        // mergeSort(arr, 0, arr.length - 1);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]);
        // }
        // int arr[] = { 6, 3, 9, 8, 2, 5 };
        // quickSort(arr, 0, arr.length - 1);
        // for (int i = 0; i < arr.length; i++) {
        // Sy)stem.out.print(arr[i]);
        // }
        // int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        // sorted_RotatedArray(arr, 0);
        // int targetindex=search(arr,0, 0, arr.length-1);
        // System.out.println(targetindex);
        // String arr[]={"sun","earth","mars","mercury"};
        // printarr(arr, 0, arr.length-1);
        // System.out.println();
        // mergesort(arr, 0, 3);
        // printarr(arr, 0, 3);
        // int arr[]={2,2,1,1,1,2,2};
        // int majorityelement=findmajority(arr);
        // if(majorityelement==Integer.MIN_VALUE){
        // System.out.println("no majority element exist");
        // }else{
        // System.out.println("majority element in array");
        // System.out.println(findmajority(arr));
        // }
        int arr[] = { 2,3,5,4,9,6};
        inversionCount(arr);
        System.out.println(mergesortinvcount(arr, 0,
         arr.length-1));
    }
}
