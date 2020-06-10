import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            HashSet<String> set = new HashSet<String>();

            while(scanner.hasNext()){
                String str = scanner.nextLine();
                String[] array = str.split(" ");
                set.addAll(Arrays.asList(array));
                System.out.println(set.size());
                }
        }

        public static void main5(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n=scanner.nextInt();
            int a=0,b=1;
            while(b<=n){
                int tmp=b+a;
                a=b;
                b=tmp;
            }
            System.out.print(Math.min((b - n), (n - a)));
        }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (n!=0) {
            arrayList.add(n%10);
            n = n/10;
        }
        for (int i:arrayList) {
            System.out.print(i);
        }

    }
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt(), count = 0;
            for (int i = 5; i <= n; i *= 5) {
                count += n / i;
            }
            System.out.println(count);
        }
    }
}