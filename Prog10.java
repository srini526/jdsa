// import java.util.*;
// public class Prog10 {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the base no.: ");
//     int p= sc.nextInt();
//     System.out.println("Enter the power no.: ");
//     int q= sc.nextInt();
//         int result=1;
//         for (int i = 0; i < q; i++) {
//            result *=p;
//         } 
//         System.out.println(p+ " Raised to power of " +q+ "is :" +result);
//     }
// }


import java.util.*;
public class Prog10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base no.: ");
    int p= sc.nextInt();
    System.out.println("Enter the power no.: ");
    int q= sc.nextInt();
    int ans = pow(p,q);
    System.out.println(ans);
    }
    public static int pow (int p,int q){
        if(q<=1) return p;
        return p*pow(p,q-1); //O(n)
    }
}

