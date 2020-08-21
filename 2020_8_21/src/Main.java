public class Main {
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    swap(array,j,j+1);
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }

    private static void swap(int[] array, int j, int i) {
        int t = array[j];
        array[j] = array[i];
        array[i] = t;
    }

    public static void quickSort(int[] array,int low,int high){
        int i,j;
        if(low > high){
            return;
        }
        i = low;
        j = high;
        array[low] = array[low];

        while(i<j){
            while(array[low] <= array[j]&&i<j){
                j--;
            }
            while(array[low]>= array[i] &&i<j){
                i++;
            }
            if(i<j){
                int sp = array[i];
                array[i] = array[j];
                array[j] = sp;
            }
        }
        int temp = array[low];
        array[low] = array[i];
        array[i] = temp;

        quickSort(array,low,j-1);
        quickSort(array,j+1,high);
    }

    public static void main(String[] args) {
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int[] array,int low,int high){
        if(low >= high - 1){
            return;
        }

        int mid = (low + high) /2;
        mergeSort(array,low,mid);
        mergeSort(array,mid,high);

        merge(array,low,mid,high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int i = low;
        int j = mid;
        int length = high-low;
        int[] extra = new int[length];
        int k = 0;

        while(i < mid && j < high){
            if(array[i] <= array[j]){
                extra[k++] = array[i++];
            }else{
                extra[k++] = array[j++];
            }
        }
        while(i<mid){
            extra[k++] = array[i++];
        }
        while(j<high){
            extra[k++] = array[j++];
        }

        System.arraycopy(extra, 0, array, low, length);
    }
}
