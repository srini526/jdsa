import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {1,9,5,7,3,7,5,7,4};
        int [] ans =insertionSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j = i;
            while (j>0 && arr[j-1]>arr[j]) {
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }
}
