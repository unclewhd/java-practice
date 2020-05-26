
public class TestSort {

    public static  void insertSort(int[] array){
        int tmp = 0;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            int j = 0;
            for ( j = i - 1; j >= 0 ; j--) {
                if(array[i] < array[j]) {
                    array[j + 1] = array[j];
                }else{
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }
    public static void shell(int[] array,int gap){
        int tmp;
        for (int i = gap; i < array.length; i++) {
            tmp = array[i];
            for (int j = i - gap; j >= 0 ; j -= gap) {
                if(tmp < array[j]) {
                    array[j + gap] = array[j];
                }else{
                    break;
                }
            }
        }
    }
    public static void shellSort(int[] array) {
        int[] drr = {1,2,4};
        for (int value : drr) {
            shell(array, value);
        }
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    
    
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = array[j];
                    flg = true;
                }
            }
            if(flg){
                break;
            }
        }
    }

    public static  int partition(int[] array,int low,int high){
        int tmp = array[low];
        while(low < high){
            while(low < high && array[high]>tmp){
            high--;
            }
            array[low] = array[high];
            while(low < high && array[low] < tmp){
            low++;
            }
            array[low] = tmp;
        }
    }
    public static void quick(int[] array,int left,int right){
        if(left >= right){
            return;
        }
        int par = partition(array,left,right);
        quick(array,left,par-1);
        quick(array, par+1, right);
    }
    public static  void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

}
