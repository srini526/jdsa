public class countoccurance {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,2,4};
        int target = 2;
        int count = 0;
        int ans = countoccurance(arr, target, count);
        System.out.println("the targeted element is Occured " +ans+ " times");

    }
    public static int countoccurance (int[] arr, int target,int count){
        for(int i = 0 ; i<arr.length-1;i++){
            if (arr[i]==target){
                // return i;
                count++;
            }

        }
        return count;
    }
}
