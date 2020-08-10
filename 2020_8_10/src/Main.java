public class Main {
    public static int n = 1,m =2;
    public static int[] a = {n,m};

    public static void main(String[] args) {
        a[0] = a[0]^a[1];
        a[1] = a[0]^a[1];
        a[0] = a[0]^a[1];
        System.out.println(a[0]);
        System.out.println(a[1]);

    }
}
