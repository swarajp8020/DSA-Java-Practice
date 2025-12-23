package Practice.Week8Practice.trees;

public class InvertTree {
    public TreeNode invertTree(TreeNode root){
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(1);

        InvertTree inv = new InvertTree();
        TreeNode res = inv.invertTree(node);

        System.out.println(res.left.value);
        System.out.println(res.right.value);
    }
}
