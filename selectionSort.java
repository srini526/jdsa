import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int [] arr ={2,4,3,8,6,9,1,10};
        int n = arr.length;
        System.out.println("array before sorting "+Arrays.toString(arr));
        sort(arr, n);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        
    }
    public static void sort(int arr[], int n){
        for (int i = 0 ; i < n-1; i++){
            int mini = i;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[mini]) mini = j;
            }
            int temp = arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        // for(int i =0; i<n;i++){
        //     System.out.println("Array after sorting "+arr[i]);
        // }
        // System.out.println();
    }
}
