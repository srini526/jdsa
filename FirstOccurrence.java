public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr ={10,20,30,20,40};
        int target = 20;
        int ans = firstoccur(arr, target);
        System.out.println("The target element is present at index " + ans);
    }
    public static int firstoccur(int[]arr,int target){
        int low = 0, high = arr.length-1;
        
        while (low<=high) {
            int mid = (low+ high)/2;
            if(target == arr[mid]) return mid;
             else if (target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
