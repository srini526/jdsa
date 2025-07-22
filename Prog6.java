import java.util.*;
public class Prog6 {
    static int SOD(int n){
        int rem,sum=0;
    while(n!=0){
        rem=n%10;
        n/=10;
        sum+=rem;
    }
    return sum;
    }    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("The sum of didgits is: "+SOD(n));

    }
}
