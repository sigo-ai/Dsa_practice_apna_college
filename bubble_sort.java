public class bubble_sort {
    public static void sortByBubble(int arr[]){
      for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int empty=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=empty;
            }
        }
      }  
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void sortByBubble_descending(int arr[]){
        for(int i=0;i<arr.length-1;i++){
          for(int j=arr.length-1;j>0;j--){
              if(arr[j]>arr[j-1]){
                  int empty=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=empty;
              }
          }
        }  
          for(int i=0;i<arr.length;i++){
              System.out.print(arr[i]);
          }
      }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        sortByBubble(arr);
        sortByBubble_descending(arr);

    }
}
