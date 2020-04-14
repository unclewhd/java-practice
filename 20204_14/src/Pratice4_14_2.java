import java.util.Arrays;
public class Pratice4_14_2 {

    public static String myToString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if(i != array.length - 1) {
                ret += ",";
            }
            ret += "]";
        }
        return ret;
    }
    public static void main(String[]args){
        int[] array = {12,34,1,6,2,9,21};
        System.out.println(myToString(array));
        }


    public static void func2(int[] array) {
        for(int i = 0;i < array.length; i++){
            array[i] = array[i] * 2;
        }
    }
    public static int[] func(int array[]){
        int[] tmp = new int[array.length];
        for(int i = 0;i < array.length;i++) {
            tmp[i] = array[i] * 2;
        }
        return tmp;
    }
    public static void main6(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = func(array);
        System.out.println(Arrays.toString(ret));
    }
    public static void main5(String[] args) {
        int a = 0;
        System.out.println(a);
        int[] array = null;
        System.out.println(array[0]);
    }
    public static void main4(String[] args) {
        int[] array =  {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(array));
    }
    public static void printArray(int[] arr){
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
    public static void swap(int[] arr){
       int tmp = arr[0];
       arr[0] = arr[1];
       arr[1] = tmp;
    }
    public static void main3(String[] args) {
        int[] array2 = {1,2,3,4};
        printArray(array2);
        System.out.println(array2[0]+" " + array2[1]);
        swap(array2);
        System.out.println(array2[0]+" " + array2[1]);
    }
    public static void main2(String[] args) {
        int [] array = {1,2,3,4};
        int len = array.length;
        System.out.println(len);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=============");
        for (int val: array) {
            System.out.println(val+" ");

        }
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4};
        int[] array2 = new int[] {11,22,33,44};
        int[] array3 = new int[4];// 0
        array[0] = 1;
        array[1] = 2;

    }
}
