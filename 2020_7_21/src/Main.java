import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.nextLine();
            String[] arr = a.split("_");
            System.out.print(arr[0]);
            for(int i = 1;i < arr.length;i++){
                System.out.print(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1));
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.nextLine();
            char[] arr1 = a.toCharArray();
            int count = 0;
            char[] arr2 = new char[arr1.length];
            int b = 0;
            for(int i = 0;i<arr1.length;i++){
                if(arr1[i] != '_'){
                    arr2[count] = arr1[i];
                    count++;
                }else{
                    b++;
                }
            }
            for(int i = 0;i<arr1.length - b - 1;i++){
                System.out.print(arr2[i]);
            }
            System.out.println(arr2[arr1.length-b]);
        }
    }
}
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = scanner.nextInt();
            }
            Stack<Integer> stack = new Stack<>();
            int j = 0;
            for(int i = 0;i<n;i++){
                int left = Integer.MIN_VALUE;
                int right = Integer.MIN_VALUE;
                while(j<i){
                    j++;
                    stack.push(arr[j]);
                    if(arr[j]<arr[i]){
                        left = arr[j];
                    }
                }
                if(left ==Integer.MIN_VALUE){
                    left = -1;
                }
                j = i;
                while(j < n){
                    stack.push(arr[j]);
                    j++;
                }
                while(j != i){
                    j--;
                    if(stack.peek()<arr[i])
                        right = stack.pop();
                }
                if(right == Integer.MIN_VALUE) right = -1;
                System.out.println(left+" "+right);
            }
        }
    }
}
*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = scanner.nextInt();
            }
            int count = 0;
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n; j++){
                    count++;
                    if(arr[i]==arr[j]&&i != j){
                        count--;
                    }
                    if(count == n){
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    }
}*/

