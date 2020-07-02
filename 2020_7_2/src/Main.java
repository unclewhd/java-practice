import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = 10;
        n = n<<8;
        System.out.println(n);



       /* Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = scanner.nextInt();
            }
            int findNum = scanner.nextInt();
            int outNum = -1;
            for (int i = 0; i < n; i++) {
                if(findNum == arr1[i]){
                    outNum = i;
                }
            }
            System.out.println(outNum);
        }*/
    }
}
