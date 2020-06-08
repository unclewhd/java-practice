import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = Math.min(a,b);
        int d = Math.max(a,b);
        while(true){
            if(c % d != 0){
                c += Math.min(a,b);
            }else{
                System.out.println(c);
                break;
            }
        }
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            int count = 0;
            int[][] array = new int[w][h];
            for (int j = 0; j < (h+1) / 2; j++) {
                for (int i = 0; i < (w+1) / 2; i++) {
                    count ++;
                }
            }



        }
    }
}
