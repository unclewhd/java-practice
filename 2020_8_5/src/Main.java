import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int ot = (m / 4) * 2 + (m % 4 < 2 ? m % 4 : 2);
        int tf = ((m - 2) / 4) * 2 + ((m - 2) % 4 < 2 ? (m - 2) % 4 : 2);
        int ans = n / 4 * (ot + tf) * 2;
        if(n % 4 > 0) ans += ot;
        if(n % 4 > 1) ans += ot;
        if(n % 4 > 2) ans += tf;
        System.out.println(ans);
    }
}