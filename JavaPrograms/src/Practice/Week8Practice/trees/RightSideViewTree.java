package Practice.Week8Practice.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewTree {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode last = null;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                last = node;
                if (node.left != null)q.add(node.left);
                if (node.right != null)q.add(node.right);
            }
            result.add(last.value);
        }
        return result;
    }
    static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left = new TreeNode(3);
        node.right.left = new TreeNode(4);
        RightSideViewTree rr = new RightSideViewTree();
        System.out.println(rr.rightSideView(node));
    }
}
