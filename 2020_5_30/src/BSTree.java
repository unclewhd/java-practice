public class BSTree {
    public static class Node{
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node root = null;

    public boolean insert(int val) {
        Node node = new Node(val);
        if(root == null){
            root = node;
            return true;
        }
        Node cur = root;
        Node parent = null;

        while(cur != null){
            if(cur.val == val){
                return false;
            }else if(cur.val < val){
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }
        if(val > parent.val){
            node = parent.left;
        }else{
            node = parent.right;
        }
        return true;
    }
    public void preOrder(Node root) {
        if(root == null) return;
        System.out.println(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public boolean remove(int key) {
        Node cur = root;
        Node parent = null;
        while(cur != null) {
            if(cur.val == key) {

            }else if(key < cur.val) {
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }
    }
}
