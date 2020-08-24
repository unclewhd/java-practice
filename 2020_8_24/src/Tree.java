class BinarySearchTree{
    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key){
            this.key = key;
        }
    }

    private Node root = null;

    public Node search(int key) {
        Node cur = root;
        while(cur != null){
            if(key == cur.key){
                return cur;
            }else if(key < cur.key){
                cur = cur.left;
            }else{
                cur = cur.right;
            }
        }

        return null;
    }

    public boolean insert(int key){
        if(root == null)
    }
}
public class Tree {
    public static void main(String[] args) {

    }
}
