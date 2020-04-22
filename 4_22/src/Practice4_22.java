import java.util.Arrays;

public class Practice4_22 {
    public static void func1(int[] arr) {
        int j = arr.length - 1;
        int i = 0;
       while(i < j) {

            if(arr[i]%2 == 0) {
                i++;
            }else if(arr[j] % 2 == 1){
                j--;
            }else{
                int tmp;
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        func1(array);
        System.out.println(Arrays.toString(array));
    }
}
