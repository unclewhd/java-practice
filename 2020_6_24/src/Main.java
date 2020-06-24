import java.util.*;

public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        HashSet<Integer> set = new HashSet<>();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            set.add(gifts[i]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(set.contains(gifts[i])){
                a[i]++;
            }
        }

    }
}

public class Main {
}
