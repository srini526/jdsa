import java.util.Arrays;

public class reversingArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9};
        int[] ans = revarray(arr);
        System.out.println(""+ Arrays.toString(ans));

    }
    public static int[] revarray(int []arr){
        int n = arr.length,i,j=n-1;
        for(i=0;i< n/2;i++){
            swap(arr,i,j);
            j--;
        }
        return arr;
    }
    public static void swap(int [] arr,int i , int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
