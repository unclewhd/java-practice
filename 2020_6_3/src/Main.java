import java.util.Arrays;
import java.util.Scanner;
class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        int a = 0;//zuo
        int b = 0;//you
        for (int i = 0; i < n; i++) {
            if(A.charAt(i) != '(' || A.charAt(i)!=')'){
                return false;
            }
            if(A.charAt(i) == '('){
                a++;
            }
            if( A.charAt(i) ==')'){
                b++;
            }
        }
        return a != b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();
        char[] arr1 =func1(str.toCharArray(),null,0,0,len);
        System.out.println(Arrays.toString(arr1));
    }

    public static char[] func1(char[] arr,char[] arr2,int bI,int eI,int len){
        if(arr.length > arr2.length&&eI != len){
            if(bI!=arr.length-1){
                for (int i = 0; i < eI; i++) {
                    arr2[i] = arr[bI+i];
                }
            }else {
                return arr;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[eI] != arr[eI] + 1){
                char[] arr1 = {1};
                bI = eI +1;
                eI = eI +1;
                func1(arr,arr2,bI,eI);
            }else{
                eI = eI+1;
            }
        }
    }
}
