import java.util.Arrays;

public class Sjjg_4_23 {
    public int[] elem;
    public int usedSize;
    public static final int intCapacity = 10;

    public Sjjg_4_23() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }


    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(this.elem[i] + " ");
        }
        System.out.println();
    }//dayin
    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }
    private void checkPos(int pos) {
        if(pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
    }
    public void add(int pos,int data) {
        checkPos(pos) ;
        if(isFull()) {
            this.elem =
                    Arrays.copyOf(this.elem,2*this.elem.length);
            for (int i = this.usedSize-1; i >= pos; i--) {
                    this.elem[i+1] = this.elem[i];
                }
                this.elem[pos] = data;
                this.usedSize++;
            }
        }
        //zengjia
        public boolean contain(int toFind) {
            for (int i = 0; i < this.usedSize; i++) {
               if(this.elem[i] == toFind) {
                   return true;
               }
            }
            return false;
        }//panduanyoumeiyou
        public int search(int toFind) {
            for (int i = 0; i < this.usedSize; i++) {
                if(this.elem[i] == toFind) {
                    return i;
                }
            }
            return -1;
        }//huoquweizhi
    public boolean isEmpty() {
        return this.usedSize == 0;
    }
        public int getPos(int pos) {
            if(isEmpty()) {
                throw new RuntimeException("顺序表为空") ;
            }
            if(pos < 0 || pos >= this.usedSize) {
                throw new RuntimeException("pos位置不合法！");
            }
            return this.elem[pos];
        }//gei pos weizhi she wei value
    public int size() {
        return this.usedSize;
    }
    public void remove(int toRemove) {
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("无");
        }
        this.usedSize--;
    }
        public void setPos(int pos,int value) {

        if(pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("不合法");
        }
        this.elem[pos] = value;
        }
        public void clear(){
            this.usedSize = 0;
        }


}
