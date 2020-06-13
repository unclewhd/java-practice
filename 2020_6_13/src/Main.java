import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str1 ="hello";
        String str2 = "he" + new String("llo");
        System.out.println(str1==str2);
    }
}
public class Exchange {
    public int[] exchangeAB(int[] AB) {
        Stack<Integer> stack = new Stack<>();
        stack.push(AB[0]);
        stack.push(AB[1]);
        AB[0] = stack.pop();
        AB[1] = stack.pop();
        return AB;
    }
}

public class GrayCode {

    public String[] getGray(int n) {
        String[] arr1 = null;
        if(n == 1) {
            arr1 = new String[] {"0","1"};
        }else{
            String[] arr2 = getGray(n-1);
            arr1 = new String[arr2.length*2];
            for (int i = 0; i < arr2.length; i++) {
                arr1[i] = "0" +arr2[i];
                arr1[arr1.length-1-i] = "1" +arr2[i];
            }
        }
        return arr1;
    }
}