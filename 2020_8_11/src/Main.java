import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.nextLine();
            String b = sc.nextLine();
            BigInteger a1 = new BigInteger(a);
            BigInteger b1 = new BigInteger(b);
            System.out.println(a1.add(b1));
        }
    }
}
