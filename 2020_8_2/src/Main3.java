import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] ch = sc.nextLine().toCharArray();
            String str = sc.nextLine();
            for (char c : ch) {
                if (!str.contains(String.valueOf(c))) {
                    System.out.println(c);
                }
            }
        }
    }
}
