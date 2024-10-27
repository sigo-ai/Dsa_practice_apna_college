public class lexicographic {
    public static void largest_string(String arr[]){
        String largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest.compareToIgnoreCase(arr[i])<0){
                largest=arr[i];
            }
        }
        System.out.println("largest string is "+largest);
    }
    public static void main(String[] args) {
        String arr[]={"appple","mango","banana"};
        largest_string(arr);
    }
}
