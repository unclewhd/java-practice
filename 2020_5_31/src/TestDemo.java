import java.util.Arrays;
import java.util.Objects;

class HashBuck {

    static class Node {
        public int key;
        public int val;
        public Node next;
        public Node(int key,int val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node[] array = new Node[10];
    public int usedSize;

    public void put(int key,int val) {

        int index = key % array.length;
        for (Node cur = array[index];cur != null;cur = cur.next) {
            if(cur.key == key) {
                //key相同 更新val值
                cur.val = val;
                return;
            }
        }
        Node node = new Node(key,val);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;

        if(loadFactor() > 0.75) {
            resize();
        }

    }

    public void resize() {
        Node[] newArray = new Node[2*this.array.length];
        for (int i = 0; i < array.length; i++) {
            Node cur = array[i];
            while (cur != null) {
                Node curNext = cur.next;
                int index = cur.key%newArray.length;
                cur.next = newArray[index];
                newArray[index] = cur;
                cur = curNext;
            }
        }
        array = newArray;
    }

    public double loadFactor(){
        return this.usedSize*1.0 / this.array.length;
    }

    public V get (K key) {
        //1
        for (int i = 0; i < array.length; i++) {

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashBuck hashBuck = (HashBuck) o;
        return usedSize == hashBuck.usedSize &&
                Arrays.equals(array, hashBuck.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(usedSize);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}