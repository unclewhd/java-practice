class Node {
    int val;
    public Node next;

    public  Node(int val){
        this.val = val;
    }
}
public class Queue {

    public Node front;
    public Node rear;
    public int useSize;

    public boolean offer(int val){
        Node node = new Node(val);
        if(this.rear == null){
            this.front = node;
            this.rear = node;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
        this.useSize++;
        return true;
    }

    public int poll(){
        if(isEmpty()){
            throw new RuntimeException("kong")
        }
        int data = this.front.val;
        this.front = this.front.next;
        return data;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("kong")
        }
        return this.front.val;
    }
    
    public boolean isEmpty(){
        return this.useSize == 0;
    }

}
