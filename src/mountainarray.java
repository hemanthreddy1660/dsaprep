public class mountainarray {
    public static void main(String[] args) {

    }
    static int ans(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int middle=start+(end-start)/2;
            if(arr[middle]>arr[middle+1]){
                end=middle;
            } else  {
                start = middle+1;
            }
        }
        return start;
    }
}
