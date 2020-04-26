import java.util.List;
public class Practice4_24 {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
       /* myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(6);*/
       myLinkedList.addLast(44);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(44));
        System.out.println(myLinkedList.size());
    }
}
