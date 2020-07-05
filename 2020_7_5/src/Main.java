import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int n = scanner.nextInt();
            BigInteger[] array = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextBigInteger();
            }
            Arrays.sort(array);
            for (BigInteger a:
                 array) {
                System.out.println(a);
            }
        }

    }
}
