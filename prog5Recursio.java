public class prog5Recursio {
    public static void main(String[] args) {
        int n = 1234;
        int ans = rec(n);
        System.out.println(ans);
    }
    public static int rec(int n) {
        if(n <= 0) return 0;
        int sum = n % 10;
        return sum + rec(n/10);
    }
}
