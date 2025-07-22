public class Prog5 {
    public static void main(String[] args) {
        int  rem, n=12345, sum=0;
        while (n!=0) {
            rem=n%10;
            n/=10;
            sum+=rem;
        }
        System.out.println("The Sum of the digits are: ");
        System.out.println(sum);
    }
    
}
