package Practice.Week8Practice.trees;

class TreeNode{
    int value;
    TreeNode left, right;
    TreeNode(int x){value=x;}
}
public class maxDepth {
    static int maxDepth(TreeNode root){
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left,right);
    }

    static void main() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.right = new TreeNode(4);
        node.left.right = new TreeNode(2);
        node.left.left = new TreeNode(1);
        System.out.println(maxDepth(node));
    }
}
