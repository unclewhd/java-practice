import java.util.Scanner;

import static java.lang.Integer.sum;

public class Practice4_13 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int ret = sum(a , b);
    }

    public static int maxNum(int num1,int num2){
        return num1 > num2 ? num1 : num2;
    }
    public static int maxThreeNum(int num1,int num2,int num3) {
        int max = maxNum(num1,num2);
        return maxNum(max,num3);
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 10;
        int n2 = 20;
        int n3 = 8;
        System.out.println(maxThreeNum(n1, n2, n3));
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 31;i >= 1;i -= 2) {
            System.out.print((((n >> i) & 1) + " "));
        }
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for(int i = 0;i < 32;i++){
            if(((n>>i) & 1) == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
