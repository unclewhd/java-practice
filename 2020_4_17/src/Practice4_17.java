import java.util.Arrays;

public class Practice4_17 {
    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return (n - 1)* n;
    }
    public static int sum4(int n) {
        if ( n == 0) {
            return 0;
        }
        return sum4(n - 1) + n;
    }
    public static int func3(int n) {
        if(n < 10) {
            return n;
        }
        System.out.println(n%10);
        return func3(n / 10);
    }
    public static int func2(int n) {

        if (n < 10){
            return n;
        }
        return n%10 + func2(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(Factorial(3));
    }
    public static int  fibo(int n) {
        if (n == 1) {
            return 1;
        }
        if(n == 2) {
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n - 2) ;
        }
    }

    public static void main8(String[] args) {
        System.out.println(fibo(3));

    }
    public static void move(char pose1,char pose2) {
        System.out.println(pose1 + "->" + pose2);
    }
    public static void hanoi(char A,char B,char C,int n) {
    if(n == 1){
        move(A,C);
    }else{
        hanoi(A,C,B,n-1);
        move(A,C);
        hanoi(B,A,C,n-1);
    }
    }
    public static void main7(String[] args) {
        hanoi('A','B','C',3);
    }
    public int JumpFloor(int target) {
        if(target ==1) {
            return 1;
        }else if (target == 2) {
            return 2;
        }else {
            return JumpFloor(target - 1) + JumpFloor((target - 2));
        }
    }

    public static void max4(int a,int b) {

    }
    public static void max4(double a,double b) {

    }
    public static void max4(double a,double b,int c){

    }
    public static int sum2(int a,int b) {
        int sum = a + b;
        return sum;
    }
    public static double sum2(double a,double b,double c) {
        double sum = a + b + c;
        return sum;
    }
    public static void main6 (String[] args) {
        System.out.println(sum2(1, 2));
        System.out.println(sum2(1.2, 1.2, 1.0));
    }
    public static int max3(int a,int b,int c){

        int max = max2(c,max2(a,b));
        return max;
    }
    public static int max2(int a ,int b) {
        int max = 0;
        if (a < b) {
            max = b;
        }else{
            max = a;
        }
        return max;
    }
    public static void main5(String[] args) {
        System.out.println(max2(1, 2));
        System.out.println(max3(1, 2, 3));

    }
    public static int[] sortNum(int[] arr) {
    int left = 0;
    int right = arr.length-1;
        while(left < right) {
            while (left < right && arr[left] % 2 != 0) {
                left ++;
            }
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }
            if(left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        return arr;
    }
    public static void main4(String[] args) {
        int[] array2 = {1,5,2,4,7,2,1};
        sortNum(array2);
        System.out.println(Arrays.toString(array2));
    }
    public static void sum1(int n) {
        int ret = 1;
        int sum = 0;

            for (int i = 1; i <= n ; i++) {
                ret = i*ret;
                sum += ret ;
            }
        System.out.println(sum);
    }
    public static void main3(String[] args) {
        sum1(3);
    }
    public static void fibo1(int n) {
        int sum = 0;
        int a1 = 1;
        int a2 = 1;
        int a3 = 0;
        for (int i = 3; i < n+1; i++) {
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
        System.out.println(a3);
    }
    public static void main2(String[] args) {
        fibo1(10);
    }
    public static int find(int[] arr) {
        int count ;
        int i = 0;
        for (; i < arr.length ; i++) {
            count = 0;
            for (int j = 0; j < arr.length ; j++) {
                if ((arr[i] == arr[j])){
                  count++;
                }
            }if(count == 1) {
                break;
            }
        }
        return i;
    }
    public static void main1(String[] args) {
        int[] array1 = {1,2,2,5,1,6,6};
        int ret = array1[find(array1)] ;
        System.out.println(ret);

    }
}
