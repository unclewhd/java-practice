import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    private int[] elem;
    private int usedSize;
    public Test(){
        this.elem = new int[10];
    }

    public void adjustDown(int root,int len){
        int child = 2* root +1;
        while(child<len){
            if(child+1 < len && elem[child]<elem[child+1]){
                child++;
            }
            if(elem[child]>elem[root]){
                int tmp = elem[child];
                elem[child] = elem[root];
                elem[root] = tmp;
            }else{
                break;
            }
        }
    }
    public void createHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }

        for (int i = ((this.usedSize)-1-1)/2; i >= 0; i--) {
            adjustDown(i,usedSize);
        }
    }
    public void push(int val){
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[usedSize++] = val;
        this.usedSize++;
        adjustUp(this.usedSize-1);
    }

    public void adjustUp(int child){
        int parent = (child-1)/2;
        while(child>0){
            if(this.elem[child]>this.elem[parent]){
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else{
                break;
            }
        }
    }

    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    public void pop(){
        if(isEmpty()){
            return;
        }
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize-1];
        this.elem[this.usedSize-1] = tmp;
        this.usedSize--;
        adjustDown(0,usedSize);
    }

    private boolean isEmpty() {
        return usedSize == 0;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return this.elem[0];
    }
    public void heapSort(){
        int end = this.usedSize-1;
        while(end>0){
            int tmp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = tmp;
            adjustDown(0,end);
            end--;
        }
    }
}
