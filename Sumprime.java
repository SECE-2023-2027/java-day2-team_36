import java.util.*;

public class Sumprime {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int num = 2;
        while (count < 100) {
            if (check(num)) {
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println(sum);
    }

    public static boolean check(int n) {
      
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}