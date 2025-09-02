import java.util.*;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        
        if (amount <= 0) {
            System.out.println("Amount should be greater than 0");
            return;
        }

        int[] denominations = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int totalNotes = 0;

        for (int denom : denominations) {
            if (amount >= denom) {
                int count=0;
                count = amount / denom;
                amount = amount % denom;
                totalNotes += count;
                System.out.println(denom + " : " + count);
            }
        }

        System.out.println(totalNotes);
    }
}

