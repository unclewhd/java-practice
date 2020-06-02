import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int c = scanner.nextInt();
            int a, b, sum = 0;
            while (c > 2) {
                a = c / 3;
                b = c % 3;
                sum = sum + a;
                c = a + b;
            }
            if (c == 2) {
                System.out.println(sum + 1);
            } else {
                System.out.println(sum);
            }
        }

        public int count(int[] A,int n){
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if(A[i] > A[j]){
                        cou++;
                    }
                }
            }
            return cou;
        }

    }
}
