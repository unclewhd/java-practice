import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

    }

    public int[] smallest(int[] arr,int k){
        if(k > arr.length){
            return arr;
        }

        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b)->b-a);
        for (int i = 0; i < k; i++) {
            maxheap.offer(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if(arr[i]<maxheap.peek()){
                maxheap.poll();
                maxheap.offer(arr[i]);
            }
        }
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = maxheap.poll();
        }
        return array;
    }

    public int heapSort(int[] arr,int k){
        //返回第5大的数字，也就是说，找出最大的五个数字里最小的数字，
        if(arr.length < k){
            return -1;
        }

        PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b) -> a-b);
        for (int i = 0; i < k; i++) {
            minheap.offer(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if(minheap.peek()<arr[i]){
                minheap.poll();
                minheap.offer(arr[i]);
            }
        }
        return minheap.peek();
    }

    public int heapSortMin(int[] arr,int k) {
        if(arr.length < k){
            return -1;
        }
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b)->b-a);
        for (int i = 0; i < k; i++) {
            maxheap.offer(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if(arr[i]<maxheap.peek()){
                maxheap.poll();
                maxheap.offer(arr[i]);
            }
        }
        return maxheap.poll();
    }

    public  int  findKthLargest(int[] nums,int k){
        int heapSize = nums.length;
        buildMaxHeap(nums,heapSize);

        for (int i = nums.length-1; i >= nums.length-k+1 ; i++) {
            swap(nums,0,i);
            --heapSize;
            maxAdjust(nums,0,heapSize);
        }
        return nums[0];
    }

    private  void buildMaxHeap(int[] a, int heapSize) {
        for (int i = heapSize/2; i >= 0; --i) {
            maxAdjust(a,i,heapSize);
        }
    }

    private void maxAdjust(int[] a, int i, int heapSize) {
        int l = i*2+1,r = i*2+2,large = i;
        if(l <heapSize&&a[l]>a[i]){
            large = l;
        }
        if(r<heapSize&&a[r]>a[i]){
            large = r;
        }
        if(large != i){
            swap(a,i,large);
            maxAdjust(a,large,heapSize);
        }
    }

    private void swap(int[] a, int i, int large) {
        int tmp = a[i];
        a[i] = a[large];
        a[large] = tmp;
    }
}
