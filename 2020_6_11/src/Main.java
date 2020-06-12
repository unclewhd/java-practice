import java.util.Scanner;
import java.util.*;
public class Main {
    public int a = 0;
    public int b = 0;
    public int z = 0;
    public class Robot {

        public int countWays(int x, int y) {
            if(a < x) {
                a++;
                z = z+1;
                return countWays(x,y);
            }
            if(b < y) {
                b++;
                z = z+1;
                return countWays(x,y);
            }
            return 2*z;
        }
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1,b = 1;

        while(b <= n){
            int tmp = b;
            b = b+a;
            a = tmp;
        }

        System.out.println(Math.min(b-n,n-a));
    }
}
