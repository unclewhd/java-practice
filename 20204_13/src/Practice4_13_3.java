public class Practice4_13_3 {
    public static int fac(int n) {
        if(n == 1) {
            return 1;
        }
        int tmp = n * fac(n - 1);
        return tmp;
    }
    public static void func1(int n) {
        if (n > 9) {
            System.out.println(n%10);
        }
    }
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
    public static int func2(int n) {
        if(n < 10) {
            return n;
        }
        return n%10 + func2(n/10);
    }
    public static int fab2(int n ) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fab2(n - 1) + fab2(n - 2);
    }

    public static int fab(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 2;
        for(int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        System.out.println(fab(40));
    }
}
