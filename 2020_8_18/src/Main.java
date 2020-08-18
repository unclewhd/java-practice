import java.util.ArrayList;
import java.util.List;



class TreeNode {
     int val;
     TreeNode left;
    TreeNode right;
      TreeNode(int x) { val = x; }
 }

class Solution {
    ArrayList<Integer> a = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root!=null){
            a.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return a;
    }
    ArrayList<Integer> b = new ArrayList<>();
    public ArrayList<Integer> inorderTraversal(TreeNode root){
        if(root!=null){
            inorderTraversal(root.left);
            b.add(root.val);
            inorderTraversal(root.right);
        }
        return b;
    }
    ArrayList<Integer> c = new ArrayList<>();
    public ArrayList<Integer> postoderTraversal(TreeNode root){
        if(root != null){
            postoderTraversal(root.left);
            postoderTraversal(root.right);
            c.add(root.val);
        }
        return c;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q== null){
            return true;
        }else if (p.val!=q.val){
            return false;
        }else {
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();

        if(root == null){
            return lists;
        }
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            int size = nodes.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode remove = nodes.remove(0);
                list.add(remove.val);
                if(remove.left != null){
                    nodes.add(remove.left);
                }
                if(remove.right != null){
                    nodes.add(remove.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}