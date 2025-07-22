public class Prog4 {
    public static void main(String[] args){
        int n = 5;
        int result = fibonacciRecursion(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
    static int fibonacciRecursion(int n) {
        if (n <= 1) return n; 
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}
