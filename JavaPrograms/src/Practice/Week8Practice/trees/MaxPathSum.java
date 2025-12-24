package Practice.Week8Practice.trees;

public class MaxPathSum {
    static class Solution {
        int maxSum = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root){
            dfs(root);
            return maxSum;
        }
        private int dfs(TreeNode node){
            if (node == null) return 0;
            int leftGain = Math.max(0, dfs(node.left));
            int rightGain = Math.max(0, dfs(node.right));
            int currentPath = leftGain + node.value + rightGain;
            maxSum = Math.max(maxSum,currentPath);
            return node.value + Math.max(leftGain, rightGain);
        }
    }
    static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution sol = new Solution();
        System.out.println(sol.maxPathSum(root));
    }
}
