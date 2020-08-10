public class Main1 {
    public static void main(String[] args) {
        int n = 2;
        String[] a = gre(n);
    }

    public static String[] a = null;
    private static String[] gre(int n) {
        if(n == 1){
            a = new String[]{"0", "1"};
        }else{
            a = new String[a.length*2];
            for (int i = 0; i < a.length / 2; i++) {
                a[i] = "0"+a[i];
            }
            int j = 0;
            for (int i = a.length-1; i >= a.length/2; i--) {
                a[i] = "1"+a[a.length/2+ (j++)];
            }
        }
        return a;
    }
}
