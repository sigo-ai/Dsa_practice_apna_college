public class selection_sort {
    public static void sortBySelection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
           int min=i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[min]){
                 min=j;
               }
            }
            int empty=arr[min];
            arr[min]=arr[i];
            arr[i]=empty;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void sortBySelection_descending(int arr[]){
        for(int i=0;i<arr.length-1;i++){
           int max=i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]>arr[max]){
                 max=j;
               }
            }
            int empty=arr[max];
            arr[max]=arr[i];
            arr[i]=empty;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        sortBySelection(arr);
        sortBySelection_descending(arr);

    }
}
