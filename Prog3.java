public class Prog3 {
    public static void main(String[] args) {
        fibo(10);
    }
    public static void fibo(int n){
        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }
    }

}
