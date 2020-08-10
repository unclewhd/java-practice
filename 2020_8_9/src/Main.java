import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        System.out.println(a.get(4));

        char n = '9';
        int b = n -'3';
        System.out.println(b);
    }
}
