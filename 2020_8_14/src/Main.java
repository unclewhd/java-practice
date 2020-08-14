import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0){
                return;
            }
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int t = sc.nextInt();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(t == arr[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
