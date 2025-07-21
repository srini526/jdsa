import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    
    }

public static int factorial(int n) {
    if(n==1) return 1;
    return n*factorial(n-1);
}
}