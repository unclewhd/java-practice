public class Sort {
    public static void insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j = i - 1;
            for (; j >=0&&array[j]>v; j--) {
                array[j+1] = array[j];
            }
            array[j+1]=v;
        }
    }
    public static void shellSort(int[] array){
        int gap = array.length;
        while(gap>1){
            insertSortGap(array,gap);
            gap = gap/2;
        }
        insertSortGap(array,1);
    }

    private static void insertSortGap(int[] array, int gap) {
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j = i-1;
            for (; j>=0&&array[j]>v; j-=gap) {
                array[j+1] = array[j];
            }
            array[j+1]=v;
        }
    }
    public static void selectSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int max = 0;
            for (int j = 1; j < array.length - i; j++) {
                if(array[j]>array[max]){
                    max = j;
                }
            }
            int t = array[max];
            array[max] = array[array.length-1-i];
            array[array.length-1-i] = t;
        }
    }
    public static void heapSort(int[] array) {
        createHeap(array);
        for (int i = 0; i < array.length-1; i++) {
            int t= array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = t;
            shiftDown(array,array.length-i-1,0);
        }
    }

    private static void createHeap(int[] array) {
        for (int i = (array.length-1)/2; i >= 0; i--) {
            shiftDown(array,array.length,i);
        }
    }

    private static void shiftDown(int[] array, int size, int index) {
        int left = 2*index +1;
        while(left<size){
            int max = left;
            int right = 2*index+2;
            if(right<size){
                if(array[right]>array[left]){
                    max = right;
                }
            }
            if(array[index] > max){
                break;
            }
            int t = array[index];
            array[index] = array[max];
            array[max] = t;

            index = max;
            left = 2*index+1;
        }
    }
}

