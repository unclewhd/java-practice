import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextInt();
        long a = m*(m-1)+1;
        for (int i = 0; i < m-1; i++) {
            System.out.print(a+(2*i)+" ");
            if(i == m-2){
                System.out.println(a+(2*(i+1)));
            }
        }
    }
}
