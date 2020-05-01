import java.util.Arrays;

public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int intCapacity = 10;

    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }
    
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(this.elem[i] + " ");
            System.out.println();
        }
    }

    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    private void checkPos(int pos) {
        if(pos < 0 || pos > this.usedSize){
            throw new RuntimeException("wrong");
        }
    }

    public void add(int pos,int data){
        checkPos(pos);

        if(isFull()){
            this.elem =
                    Arrays.copyOf(this.elem,2*this.elem.length);
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    public boolean contain(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }

    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    public int getPos(int pos) {
        if(isEmpty()){
            throw new RuntimeException("wrong");
        }
        if(pos < 0 || pos >= this.usedSize){
            throw new RuntimeException("wrong");
        }
        return elem[pos];
    }

    public int size() {
        return this.usedSize;
    }

    public void remove(int toRemove){
        int index = search(toRemove);
        if(index == -1){
            System.out.println("没这个数字");
        }
        for (int i = index; i < this.usedSize-1; i++) {
            elem[i] = elem[i+1];
        }
        this.usedSize--;
    }

    public void clear(){
        this.usedSize = 0;
    }

    public void setPos(int pos,int value){
        if(pos < 0 || pos >= this.usedSize){
            throw new RuntimeException("wrong");
        }
        this.elem[pos] = this.elem[value];
    }
}
