
class Generic<T extends Comparable<T>>{
    public void max(T[] array){
        T max = array[0];
        for (int i = 0; i < array.length; i++) {

            if(array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
    }
}

 class Practice {
     public static void main(String[] args) {
         Generic <Integer> generic = new generic<>;
     }
    public static int partition(int[] array,int low,int high){
        int tmp = array[low];
        while(low < high){
            while(low < high && array[high] >= tmp){
                high--;
            }
            array[low] = array[high];
            while(low < high && array[low] <= tmp){
                low++;
            }
            array[high] = array[low];
        }
        array[low] = tmp;
        return low;
    }

    public static void quick(int[] array,int left,int right){
        if(left >= right) {
            return;
        }

        int par = partition(array,left,right);
        quick(array,left,par-1);
        quick(array,par+1,right);
    }

    public static void quickSort1(int[] array){
        quick(array,0,array.length-1);
    }
}
