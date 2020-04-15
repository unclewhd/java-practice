import sun.security.util.Length;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static sun.misc.Version.print;
public class Practice4_15 {
    public static void printArray(int[] arr) {

        int len = arr.length ;
        for (int i = 0; i < 100; i++) {
          arr[i] = i ;
        }
    }
    public static void main(String[] args) {
        int[] array1 = new int[100];
//        transform(array1);
        printArray(array1);
//        System.out.println(Arrays.toString(array1));
    }
    public static double sum(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum;
    }
    public static void main16(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(sum(array));
    }
    public static double avg(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum/arr.length ;
    }
    public static void main15(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(avg(array));
    }

    public static void cal2() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 0; i < 32; i++) {
            System.out.print(n&1);
            int a = n&1;
            n = n >> 2 ;

            }
        n = scan.nextInt();
        n = n >> 1;
        for (int i = 0; i < 32; i++) {
            System.out.print(n&1);
            int a = n&1;
            n = n >> 2 ;
        }

    }
    public static void main14(String[] args) {
        cal2();
    }
    public static void maxCom() {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        int b = scan.nextInt();
        int c = b;
        while(a%b != 0) {
            c = a%b;
            a = b;
            b = c;
        }
        System.out.println(c);

    }
    public static void main12(String[] args) {
        maxCom();
    }
    public static void multi() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
    public static void main11(String[] args) {
        multi();
        }
    public static void output() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int len = 0;
        int a = n;
        while (a != 0) {
            a /= 10;
            len++;
        }
        for (int i = 1; i < n; i++) {
            System.out.println(n % ((int) Math.pow(10, len - i)));
            break;
        }

    }
    public static void main10(String[] args) {
        output();
    }
    public static void sign() {
        Scanner scan = new Scanner(System.in) ;
        int count = 3;
        System.out.println("qing shu ru");
        String password = scan.nextLine();
        if(password.equals("123456")) {
            System.out.println("zhengque");
        } else {
            System.out.println("cuowu");
            count--;
            System.out.println("haiyou"+ count + "cijihui");
        }
    }
    public static void main9(String[] args) {
        sign();
    }
    public static void sum() {
        double sum = 0;
        int flg = 1;

        for(int i = 1;i <= 100;i++){
            sum = sum + 1.0/i *flg;
            flg = -flg;
        }
        System.out.println(sum);
    }
    public static void main8(String[] args) {
        sum();
    }
    public static void nar() {
        for (int n = 1;n <= 999;n++) {

            int count = 0;
            int tmp = n;
            while(tmp != 0) {
                tmp = tmp/10;
                count++;
            }
            tmp = n;
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp%10,count);
                tmp = tmp/10;
            }
            if(sum == n) {
                System.out.println(sum + "is my result!");

            }
        }
    }
    public static void main7(String[] args) {
        nar();
    }
    public static void guess() {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int randNum = random.nextInt(100);

        System.out.println(randNum);

        while (true) {
            int num = scan.nextInt();
            if (num == randNum) {
                System.out.println("dui le ");
                break;
            }
        }
    }
        public static void main6 (String[]args){
            guess();
        }

    public static void cal(int n) {
        if(n < 18) {
            System.out.println("sn");
        }
        else if (n >= 18 && n < 29) {
            System.out.println("qn");
        }
        else if (n >= 29 && n < 56) {
            System.out.println("zn");
        }
        else{
            System.out.println("ln");
        }
    }
    public static void main5(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    cal(n);

}
    public static void primeNumber1() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("不是素数");
                break;
            }
        }
    }
    public static void primeNumber() {

        for (int n = 1; n <= 100; n++) {
            for (int i = 2; i <= (int)Math.sqrt(n); i++) {
                if (n % i == 0) {
                    break;
                }
                System.out.print (n+" ");
                break;
            }
        }
    }
    public static void main3(String[] args) {
        primeNumber();
        primeNumber1();

    }
    public static void leapYear(int n) {

        for (int i = 1000; i < n; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main2(String[] args) {
        leapYear(2000);
    }
    public static int goBack9(){
        int count = 0;
        for (int i = 0; i <100; i++) {
            if(i % 10 == 9 || (i / 10 == 9)) {
                count++;
            }
        }
        return count;
    }

    public static void main1(String[] args) {
      int ret = goBack9 ();
        System.out.println(ret);
    }
}
