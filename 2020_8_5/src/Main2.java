public class Main2 {
    public static int lcm(int m ,int n){
        return m*n/gcd(m,n);
    }

    private static int gcd(int m, int n) {
        if(n == 0) return m;
        return gcd(n,m%n);
    }

    public static void main(String[] args) {

    }
}
