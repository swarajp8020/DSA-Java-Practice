package Practice.Week8Practice.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/// explaination - Binary Tree Maximum Path Sum (MaxPathSum)
/// What it asks
/// Find the maximum sum of any path in the tree.
/// Path can start and end anywhere, but must be continuous.
/// This is NOT Path Sum
/// ❌ Not root-to-leaf
/// ❌ Not fixed target
/// ✅ Any node to any node
/// Core trick (VERY IMPORTANT)
/// At each node:
/// You can only return one side upward
/// But you can use both sides to update the answer
/// Recursive contract
/// dfs(node) returns:
/// Maximum path sum starting at this node and going down
/// Global update
/// At each node:
/// left + node + right
/// is a candidate answer
/// Why negative values are clipped
/// If a subtree contributes negative sum, ignore it:
/// Math.max(0, childSum)
/// One-line interview explanation
/// “I use bottom-up DFS. The recursion returns the best downward path, while a global variable tracks the maximum path using both children.”
public class BottomUpLevelOrder {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.value);
                if (node.left!=null)q.add(node.left);
                if (node.right!=null)q.add(node.right);
            }
            result.add(0,level);
        }
        return result;
    }

    static void main(String[] args) {
         TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(1);

        BottomUpLevelOrder sol = new BottomUpLevelOrder();
        System.out.println(sol.levelOrderBottom(node));
    }
}
