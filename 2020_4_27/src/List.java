class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class List {
    public Node head;

    public void a(int data) {
        Node node = new Node(data);
    }
    public Node partation(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;

        while(cur != null) {
            if(cur.data < x) {
                if(bs == null) {
                    bs = cur;
                    be = cur;
                }else{
                    be.next =cur;
                    be = be.next;
                }
            }else{
                if(as == null){
                    as = cur;
                    ae = cur;
                }else{
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if(bs == null) {
            return as;
        }
        be.next = as;
        if(ae.next != null){
            ae.next = null;
        }
        return bs;
    }

    public Node deleteDuplication() {
        Node cur = this.head;
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while(cur != null) {
            if(cur.next != null && cur.data != cur.next.data) {
                while(cur.next != null && cur.data != cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;
            }else{
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }
    public boolean chkPalindrome() {
        if(this.head == null) {
            return false;
        }
        if(this.head.next == null) {
            return true;
        }
        Node fast = this.head;
        Node slow = this.head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node cur = slow.next;
        while(cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while(slow != this.head) {
            if(slow.data != this.head.data) {
                return false;
            }
            if(this.head.next == slow){
                return true;
            }
            slow = slow.next;
            this.head =this.head.next;
            }
        return true;
        }
    }

