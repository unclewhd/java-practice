import java.util.Arrays;

public class Practice4_18 {
    public static void toString(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[arr.length - 1]) {
                System.out.print(arr[i] + "]");
                break;
            }
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
        int[] array223 = {1,2,3};
        toString(array223);
    }
    public static int[] copyOf(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    public static void main45(String[] args) {
        int[] array2 ={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(copyOf(array2)));
    }
    public static int find(int[] arr,int n) {
        int left = 0;
        int right = arr.length - 1;
        int avg = 0 ;
        while(left < right) {
           avg = (left + right) / 2;
           if(n > arr[avg]) {
               left = avg + 1;
           }
           if (n < arr[avg]){
               right = avg - 1;
           }
           else{
               return arr[avg];
           }
        }
            return -1;
    }
    public static void judge(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if(arr[i] > arr[j+1]) {
                    flag = false;
                }
            }
            if(flag == false) {
                System.out.println("wuxu");
                break;
            }
        }
    }
    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(find(array, 2));
    }
    public static void sortBubble(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            boolean flg = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1] ;
                    arr[j+1] = tmp ;
                    flg = false;
                }
            }
            if (flg) {
                break;
            }
        }
    }
    public static void main1(String[] args) {
        int[] array = {6,2,3,4,5};
        sortBubble(array);
        System.out.println(Arrays.toString(array));
    }
}
