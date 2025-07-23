public class minmax {
    public static void main(String[] args) {
        int [] arr ={5,-1,999,3,7};
        minmax(arr);


    }
    public static void minmax(int [] arr ){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr){
            if(i>max) max=i;
            if(i<min) min=i;
        }
        System.out.println("Minimum is "+min);
        System.out.println("Maximum is "+max);
    }
}
