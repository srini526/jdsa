import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int [] arr ={1,4,3,6,7,9,2,8};
        bubble(arr);
    }
    public static void bubble(int[] arr){
    int n = arr.length, i;
    int j;
    for ( i=0;i<n-1;i++){
        System.out.println("The  "+(i+1)+ " Iteration is " +Arrays.toString(arr));
        for (j=0;j<n-i-1;j++){
            if (arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    for(int a = 0; a < n; a++)
{
    System.out.print(arr[a]+" ");
}}
}
