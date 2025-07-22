import java.util.*;
public class prog11 {
    // public static void main(String[] args) {
    //      int n = 5;
    //      int sum = 0;
    //      for (int i = 1;i<=n;i++){
    //          if (i%2!=0) {
    //              sum += i;
    //              // System.out.println(sum);
    //          }else{
    //              sum -= i;  
    //          } // System.out.println(sum);
    //      }
    //     System.out.print("The sum: "+sum);

    // }
    static int AlternatingSumofNumber(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2 !=0) sum+=i;
            else sum -= i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no.");
        int n = sc.nextInt();
        System.out.println("Alternating sum og no. is: " +AlternatingSumofNumber(n));
    }

}
