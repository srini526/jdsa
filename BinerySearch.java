// public class BinerySearch {
//     public static void main(String[] args) {
//         int [] a ={2,3,5,7,9,10};
//         int low = 0 , high = a.length-1;
//         int key = 10;
//             while(low<=high){
//             int mid = (low + high)/2;
//             if (a[mid] == key){
//                 System.out.println("The element Found at index: "+mid);
//                 return;
//             } else if(a[mid]<key){
//                 low = mid+1;
//             }else{
//                 high = mid-1;
//             }
//         }
//        System.out.println(" The Element is not found!!");
//     }
// }
public class BinerySearch {

    public static int BinarySearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;

        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty");
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid])
                return mid;
            else if (target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {};
        int target = 6;
        int ans = BinarySearch(arr, target);
        System.out.println("The target element is present at index" + ans);
    }
}
