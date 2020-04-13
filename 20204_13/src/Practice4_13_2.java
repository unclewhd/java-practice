public class Practice4_13_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(sum(a,b));
        double d1 = 0.222;
        double d2 = 3.4;
        System.out.println(sum(d1,d2));
    }
    public static int sum(int a,int b,int c) {
        return a + b + c;
    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static int sum(int a ,int b ) {
        return a + b;
    }
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        swap(a , b);
        System.out.println(a+ " " + b + " ");
    }

    public static void swap(int x ,int y) {
        int tmp = x;
         x = y;
         y = tmp;
    }
}
