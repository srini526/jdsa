import java.util.*;
class Prog1{
    public static void main(String[] args) {
        recursion(5);
        
    }
    // public static void recursion(int n){
    //     if(n==0){
    //         return;
    //     }
    //     recursion(n-1);
    //     System.out.println(n);
    // }
    public static void recursion(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        recursion(n-1);
    }

}