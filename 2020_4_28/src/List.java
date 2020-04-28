import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

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
        public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return false;
        }
        return true;
        }

        public Node detectCycle() {
        Node slow = this.head;
        Node fast = this.head;
        while(fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                break;
            }
        }
        while(fast == null || fast.next == null) {
            return null;
        }
        fast = this.head;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
        }
        public Node aaaaaCycle() {
        Node a1 = pS;
        Node a2 = pL;
        int len1 = 1;
        int len2 = 1;
        while(a1 != null) {
            a1 = a1.next;
            len1 += 1;
        }
        while(a2 != null) {
            a2 = a2.next;
            len2 += 1;
        }
           int len = len1 - len2;
        if(len1 < len2) {
            len = len2 - len1;
        }
            for (int i = 0; i < len; i++) {

            }
            return null;
        }

        public Node merge(Node headA,Node headB) {
        Node newHead = new Node(-1);
            Node tmp = newHead;
        while(headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else{
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
         if(headA != null) {
             tmp.next = headA;
         }
         if(headB != null) {
             tmp.next = headB;
         }
         return newHead.next;
        }
    }

