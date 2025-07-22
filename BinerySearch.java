public class BinerySearch {
    public static void main(String[] args) {
        int [] a ={2,3,5,7,9,10};
        int low = 0 , high = a.length-1;
        int key = 10;
            while(low<=high){
            int mid = (low + high)/2;
            if (a[mid] == key){
                System.out.println("The element Found at index: "+mid);
                return;
            } else if(a[mid]<key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
       System.out.println("Element found!!");
    }
}
