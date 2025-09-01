import java.util.Arrays;

public class merge_Sort {

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];

        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    static void merge_Sorts(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            merge_Sorts(arr, l, mid);
            merge_Sorts(arr, mid + 1, r);
            merge(arr, l, mid, r); // <- CALL MERGE HERE!
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 3, 9, 6, 2, 7 };
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        merge_Sorts(arr, 0, arr.length - 1);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}

