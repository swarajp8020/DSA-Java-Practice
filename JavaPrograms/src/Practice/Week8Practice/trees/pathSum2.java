package Practice.Week8Practice.trees;
import java.util.ArrayList;
import java.util.List;
/// explaination -
/// PATH SUM II (THIS IS THE REAL TEST)
/// Problem
/// Return all root-to-leaf paths where the sum equals targetSum.
/// Now we need:
/// Multiple paths
/// Actual path values
/// Backtracking
/// NEW QUESTION TO ASK
/// “What extra state do I need now?”
/// Answer:
/// A path list
/// A result list
/// CRITICAL RULE (DO NOT BREAK THIS)
/// Whenever you add something before recursion,
/// you must remove it after recursion.
/// That’s backtracking.
///  For Path Sum II:
/// “I use DFS with backtracking.
/// I keep a current path list, add the node before recursion, and remove it after.
/// When I reach a leaf with remaining sum zero, I store a copy of the path.”
public class pathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, path, res);
        return res;
    }
    private void dfs(TreeNode node, int target, List<Integer> path, List<List<Integer>>res){
        if (node == null) return;
        path.add(node.value);
        if (node.left == null && node.right == null && node.value == target){
            res.add(new ArrayList<>(path));
        }
        dfs(node.left, target-node.value, path, res);
        dfs(node.right, target-node.value, path,res);
        path.remove(path.size()-1);
    }
    static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        pathSum2 sol = new pathSum2();
        System.out.println(sol.pathSum(root, 22));
    }
}
