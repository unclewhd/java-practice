class Node{
    public int data;
    public Node next;
    public Node prev;

    public Node(int data){
        this.data = data;
    }
}

public class MyLinkedList {

    public Node head;
    public Node tail;
    public void addFirst(int data) {
        Node node = new Node(data);

        if(this.head == null) {
            this.head = node;
            this.tail = node;
        }else{
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        }else{
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }
        public boolean contains(int key) {
            Node cur = this.head;
            while (cur != null) {
                if(cur.data != key){
                    cur = cur.next;
                }else{
                    return true;
                }
            }
            return false;
        }
        public int size() {
        int count = 1;
        if(this.head == null){
            return 0;
        }
        while(this.head.next != null){
            this.head = this.head.next;
            count++;
        }
        return count;
        }
        private void checkIndex(int index){
        if (index < 0 || index > size()){

            throw new RuntimeException("wrong")
        }

        }
        private Node searchIndex(int index){
        Node cur = this.head;
        while(index != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
        }
        public void addIndex(int index,int data) {
        checkIndex(index);
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()){
            addLast(data);
            return;
        }
        Node cur = searchIndex(index);
        Node node = new Node(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
        }
        public int remove(int key){
        Node cur = this.head;
        while(cur != null){
            if(cur.data == key) {
                int oldData = cur.data;
                if(cur == this.head){
                    this.head = this.head.next;
                    this.head.prev = null;
                }else{
                    cur.prev.next = cur.next;
                    if(cur.next == null){
                        this.tail = cur.prev;
                    }else{
                        cur.next.prev = cur.prev;
                    }
                }
                return oldData;
            }
            }
        return -1;
        }
        public void removeAllKey(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
               if(cur == this.head) {
                   this.head = this.head.next;
                   if(this.head != null) {
                       this.head.prev = null;
                   }
               }else{
                   cur.prev.next = cur.next;
                   if(cur.next != null) {
                       cur.next.prev = null;
                   }else{
                       this.tail = cur.prev;
               }
                   }
                }
            }cur = cur.next;
        }
        public void clear() {
        while(this.head != null){
            Node cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.tail = null;
        }

        }

