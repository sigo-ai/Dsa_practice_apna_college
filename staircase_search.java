import java.util.*;
public class staircase_search {
    public static boolean searchByToprightcorner(int arr[][],int key){
        int i=0;
        int j=arr[0].length-1;
        while(i!=arr.length && j!=-1){
            if(arr[i][j]==key){
                System.out.println("key found at "+i+","+j);
                return true;
            }
            else if(arr[i][j]>key){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static boolean searchByBottomleftcorner(int arr[][],int key){
        int i=arr.length-1;
        int j=0;
        while(i!=-1 && j!=arr[0].length){
            if(arr[i][j]==key){
                System.out.println("key found at "+i+","+j);
                return true;
            }
            else if(arr[i][j]>key){
                i--;
            }
            else{
                j++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int sorted[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("give the values of matrix");
        for(int i=0;i<sorted.length;i++){
            for(int j=0;j<sorted[0].length;j++){
                sorted[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<sorted.length;i++){
            for(int j=0;j<sorted[0].length;j++){
                System.out.print(sorted[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("give the value of key you want to search");
        int key1=sc.nextInt();
        searchByToprightcorner(sorted, key1);
        System.out.println("give the value of key you want to search");
        int key2=sc.nextInt();
        searchByBottomleftcorner(sorted, key2);
    }
}
