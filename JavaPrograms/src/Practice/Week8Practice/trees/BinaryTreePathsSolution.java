package Practice.Week8Practice.trees;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathsSolution {
    public List<String> binaryTreePath(TreeNode root){
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        dfs(root, String.valueOf(root.value), res);
        return res;
    }
    private void dfs(TreeNode node, String path, List<String> res){
        if (node.left == null && node.right == null) {
            res.add(path);
            return;
        }
        if (node.left != null) {
            dfs(node.left, path+"->"+node.left.value, res);
        }
        if (node.right != null) {
            dfs(node.right, path+"->"+node.right.value, res);
        }
    }
    static void main(String[] args) {
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.right = new TreeNode(3);
        n.left.left = new TreeNode(4);
        n.left.right = new TreeNode(5);
        BinaryTreePathsSolution bt = new BinaryTreePathsSolution();
        System.out.println(bt.binaryTreePath(n));
    }
}
