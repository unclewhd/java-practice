import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] arr = str2.toCharArray();
        for (int i = 0; i < str2.length(); i++) {
            if(str1.contains(str2.substring(i,i+1))){
                str1 = str1.replace(arr[i],'~');
            }
        }
        String[] arr2 = str1.split("~");
        for(String a:arr2){
            System.out.print(a);
        }
    }
}
