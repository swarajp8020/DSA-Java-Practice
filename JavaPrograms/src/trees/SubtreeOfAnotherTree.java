package trees;
/// 💡 Pattern Name: DFS + Same Tree Check
public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if (root == null) return false;
        if (isSame(root,subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right,subRoot);
    }
    public static boolean isSame(TreeNode p, TreeNode q){
        if (p==null && q==null) return true;
        if (p==null || q==null) return false;
        if (p.val != q.val) return false;
        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        TreeNode b = new TreeNode(5);
        b.left = new TreeNode(2);
        b.right = new TreeNode(3);
        SubtreeOfAnotherTree subtree = new SubtreeOfAnotherTree();
        System.out.println(subtree.isSubtree(a,b));
    }
}
