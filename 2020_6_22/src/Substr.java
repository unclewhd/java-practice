import java.util.*;

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] a = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.contains(p[i]);
        }
        return a;
    }
}