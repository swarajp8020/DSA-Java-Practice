package Practice.Week8Practice.trees;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.value != q.value) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    static void main(String[] args) {
    TreeNode a = new TreeNode(5);
    a.left = new TreeNode(4);
    a.right = new TreeNode(3);

    TreeNode b = new TreeNode(5);
    b.left = new TreeNode(4);
    b.right = new TreeNode(3);
    SameTree ss = new SameTree();
        System.out.println(ss.isSameTree(a,b));
    }
}
