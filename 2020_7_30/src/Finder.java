import java.util.*;
public class Finder {
    public int findKth(int[] a,int n,int K){
        Arrays.sort(a);
        return a[a.length - K];
    }
}
