import java.util.*;

class Node{
    public int val;
    public Node left;
    public Node right;
    public Node(char val) {
        this.val = val;
    }
}

public class BinaryTree {

    public Node buildTree() {
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

    public List<Integer> preOrderTraversal(Node root) {
        if (root == null) {
            return null;
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
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val + " ");
        inOrderTraversal(root.right);
    }

    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.println(root.val + " ");
    }

    int getKLevelSize(Node root, int k) {
        if (root == null) {
            return 0;
        } else if (k == 1) {
            return 1;
        } else {
            return getKLevelSize(root.left, k - 1) +
                    getKLevelSize(root.right, k - 1);
        }
    }

    int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return leftHeight > rightHeight ?
                getHeight(root.left) + 1 : getHeight(root.right) + 1;
    }

    Node find(Node root, char val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }

        Node left = find(root.left, val);
        if (root.left != null) {
            return left;
        }
        Node right = find(root.right, val);
        if (root.right != null) {
            return right;
        }
        return null;
    }

    public boolean isSameTree(Node p, Node q) {
        if ((p == null && q != null) || (q == null && p != null)) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }

    public boolean isSubtree(Node s, Node t) {
        if (s == null || t == null) {
            return false;
        }
        if (isSameTree(s, t)) {
            return true;
        }
        if (isSubtree(s.left, t)) {
            return true;
        }
        return isSubtree(s.right, t);
    }

    public boolean isBalance(Node root) {
        if (root == null) {
            return true;
        }
        if (getHeight(root.left) - getHeight(root.right) > 1) {
            return false;
        }
        if (getHeight(root.left) - getHeight(root.right) <= 1) {
            return isBalance(root.left) && isBalance(root.right);
        }
        return Math.abs((getHeight(root.left) - getHeight(root.right)
        )) < 2 && isBalance(root.left) && isBalance(root.right);
    }

    public boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }
        return isSymmetricChild(root.left, root.right);
    }

    public boolean isSymmetricChild(Node leftTree, Node rightTree) {
        if ((leftTree != null && rightTree == null) ||
                (leftTree == null && rightTree != null)) {
            return false;
        }

        if (leftTree == null && rightTree == null) {
            return true;
        }
        if (leftTree.val == rightTree.val) {
            return isSymmetricChild(leftTree.left, rightTree.right) &&
                    isSymmetricChild(leftTree.right, rightTree.left);
        }
        return false;
    }

    void levelOrderTraversal(Node root) {
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.print(cur.val+ " ");
            if(cur.left != null){
                queue.offer(root.left);
            }
            if(cur.right != null) {
                queue.offer(root.right);
            }
        }
    }

    void preOrderTraversalNor(Node root) {
        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while(cur != null|| !stack.empty()){
            while(cur != null) {
                stack.push(cur);
                System.out.println(cur.val);
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }
    }

    void postOrderTraversalNor(Node root) {
        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        Node prev = null;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if(cur.right == null || cur.right == prev){
                System.out.println(cur.val + " ");
                stack.pop();
                prev = cur;
                cur = null;
            }else {
                cur = cur.right;
            }
        }
    }
    public int preIndex = 0;
    public Node buildTreeChild(int[] preorder,int[] inorder,int inbegin,int inend) {
        if (inbegin > inend) return null;
        Node root = new Node(preorder[preIndex]);
        int rootIndex = findIndexOfInorder(inorder, inbegin, inend, preorder[preIndex]);
        preIndex++;
        if(rootIndex == -1) return null;
        root.left = buildTreeChild(preorder,inorder,inbegin,rootIndex - 1);
        root.right = buildTreeChild(preorder,inorder,rootIndex+1,inend);

        return root;
    }
    public int findIndexOfInorder(int[] inorder,int inbegin,int inend,int val) {
        for (int i = inbegin; i < inend; i++) {
            if(inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }
    public Node buildTree(int[] preorder,int[]
                          inorder) {
        if(preorder == null || inorder == null)
            return null;
        if(preorder.length <= 0 || inorder.length
        <= 0) return null;
        return buildTreeChild();
    }


    public void tree2strChild(Node t,StringBuffer sb) {
        if(t == null) return;
        sb.append(t.val);
        if(t.left == null) {
            if(t.right == null) {
                return;
            }else{
                sb.append("()");
            }
        }else{
            sb.append("(");
            tree2strChild(t.left,sb);
            sb.append(")");
        }
        if(t.right == null) {
            return;
        }else{
            sb.append("(");
            tree2strChild(t.right,sb);
            sb.append(")");
        }
    }

    public String tree2str(Node t) {
        StringBuffer sb = new StringBuffer();
        tree2strChild(t,sb);
        return sb.toString();
    }
}
