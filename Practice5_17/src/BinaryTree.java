import java.util.ArrayList;
import java.util.List;

class Node{
    public int val;
    public Node left;
    public Node right;
    public Node(char val) {
        this.val = val;
    }
}

public class BinaryTree {

    public Node buildTree(){
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        return A;

    }

    public List<Integer> preOrderTraversal(Node root){
        if(root == null) {
            return null;;
        }
        List<Integer> list = new ArrayList<>();
        System.out.println(root.val + " ");
        list.add(root.val);
        List<Integer> left = preOrderTraversal(root.left);
        list.addAll(left);
        preOrderTraversal(root.right);
        List<Integer> right = preOrderTraversal(root.right);
        list.addAll(right);
        return list;
    }

    void inOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val + " ");
        inOrderTraversal(root.right);
    }

    void postOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.println(root.val + " ");
    }
}
