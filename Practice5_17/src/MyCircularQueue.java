public class MyCircularQueue {

    public int[] elem;
    public int front;
    public int rear;

    public MyCircularQueue(int k){
        this.elem = new int[k];
    }

    public boolean enQueue(int value){
        if(isFull()){
            return false;
        }
        this.elem[this.rear] = value;
        this.rear = (this.rear + 1) % this.elem.length;
        return true;
    }

    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        this.front = (this.front + 1)% this.elem.length;
        return  true;
    }

    public boolean isEmpty(){
        return this.rear == this.front;
    }

    public boolean isFull(){
        return (this.rear+1) % this.elem.length == front;
    }
}
