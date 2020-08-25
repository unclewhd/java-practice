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
        if(root == null){
            root = new Node(key);
            return true;
        }

        Node cur = root;
        Node parent = null;
        while(cur != null){
            if(key == cur.key){
                return false;
            } else if(key < cur.key){
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }

        Node node = new Node(key);
        if(key < parent.key){
            parent.left = node
        }else {
            parent.right = node;
        }
        return true;
    }

    public boolean remove(int key) {
        Node cur = root;
        Node parent = null;
        while(cur != null) {
            if(key == cur.key){
                removeNode(parent,cur);
            }
        }
    }

    private void removeNode(Node parent, Node cur) {
        if(cur.left == null) {
            if(cur == root){
                root = cur.right;
            }else if(cur == parent.left){
                parent.left = cur.right;
            }else{
                parent.right = cur.right;
            }
        }else if(cur.right == null){
            if(cur == root){
                root = cur.left;
            }else if(cur == parent.left){
                parent.left = cur.left;
            }else{
                parent.right = cur.left;
            }
        }else{
            Node goatParent = cur;
            Node goat = cur.right;
            while(goat.left!=null){

            }
        }
    }
}
public class Tree {
    public static void main(String[] args) {

    }
}
