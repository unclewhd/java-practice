import java.util.Stack;

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

    public static void three_num_mid(int[] array,
                                     int left,
                                     int right){
        int mid = right/2;
        int high = right;
        int low = left;
        if(array[mid]<=array[low]){
            if(array[low]<=array[high]){
                return;
            }else{
                int tmp = array[high];
                array[high] = array[low];
                array[low] = tmp;
            }

        }
        if(array[mid]>array[low]){
            if(array[low]<=array[high])
        }
    }

    public static void quick_Sort(int[] array) {
        Stack<Integer> stack = new Stack<>();

        int left = 0;
        int right = array.length-1;

        int par = partition(array,left,right);
        if(par > left+1) {
            stack.push(left);
            stack.push(par-1);
        }
        if(par < right-1) {
            stack.push(par+1);
            stack.push(right);
        }
        while(!stack.empty()){
            if(par > left+1) {
                stack.push(left);
                stack.push(par-1);
            }
            if(par < right-1) {
                stack.push(par+1);
                stack.push(right);
            }

            left = stack.pop();
            right = stack.pop();
            par = left;
        }
    }
    public static void mergeNor(int[] array,int gap) {
        int[] ret = new int[array.length];
        int k = 0;//ret的下标
        int s1 = 0;
        int e1 = s1+gap-1;
        int s2 = e1+1;
        int e2 = s2+gap-1 < array.length ? s2+gap-1 :  array.length-1;

        //1、肯定是有两个归并段的
        while (s2 < array.length) {
            //2、对应的s1位置和s2位置进行比较
            if(array[s1] <= array[s2]){
                ret[k++] = array[s1++];

            }else{
                ret[k++] = array[s2++];
            }
            //3、上述第2步在比较的过程当中，肯定会有一个下标先走完一个归并段
            if(s1>e1&&s2<=e2){
                ret[k++] = array[s2++];
            }
            if(s2>e2&&s1<=e1) {
                ret[k++] = array[s1++];
            }
            //4、判断是谁没走完，把剩下的数据拷贝到结果数组当中

            //5、接着确定新的s1,e1,s2,e2
        }


    }

    public static void merge(int[] array,int low,int mid,int high){
        int s1 = low;
        int s2 = mid+1;
        int len = high-low+1;
        int[] ret = new int[len];
        int i = 0;

        while(s1 <= mid && s2 <= high){
            if(array[s1]<=array[s2]){
                ret[i++] = array[s1++];
            }else{
                ret[i++] = array[s2++];
            }
        }
        while(s1 <= mid) {
            ret[i++] = array[s1++];
        }
        while(s2 <= high){
            ret[i++] = array[s2++];
        }
        for (int j = 0; j < ret.length; j++) {
            array[j+low] = ret[j];
        }
    }
    public static void mergeSortInternal(int[] array,int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)>>>1;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        merge(array,low,mid,high);
    }

    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }

}
