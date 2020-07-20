/*import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] array = new int[n];
            for(int i = 0;i<n;i++){
                array[i] = scanner.nextInt();
            }
            int sum = 0;
            int max = 0;
            for(int i = 0;i < n;i++){
                sum += array[i];
                if(max < sum){
                    max = sum;
                }
                if(sum < 0){
                    sum = 0;
                }
            }
            System.out.println(max);
        }
    }
}*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str1 = scanner.nextLine();
            int left = 0;
            int right = 0;
            String[] str = str1.split(";");
            for(int i = 0;i< str.length;i++){
                if(str[i].substring(0,1).equals("A")){
                    left -= Integer.parseInt(str[i].substring(1,str[i].length()));
                }else if(str[i].substring(0,1).equals("S")){
                    right -= Integer.parseInt(str[i].substring(1,str[i].length()));
                }else if(str[i].substring(0,1).equals("W")){
                    right += Integer.parseInt(str[i].substring(1,str[i].length()));
                }else if(str[i].substring(0,1).equals("D")){
                    left += Integer.parseInt(str[i].substring(1,str[i].length()));
                }
            }
            System.out.println(left + "," + right);
        }
    }
}