package Practice.Week8Practice.trees;

import java.util.HashMap;

public class BuildTreePreIn {
    static class Solution{
        int preIndex = 0;
        HashMap<Integer, Integer> inMap = new HashMap<>();
        public TreeNode buildTree(int[] preorder, int[] inorder){
            for (int i = 0; i < inorder.length; i++) {
                inMap.put(inorder[i], i);
            }
            return build(preorder, 0, inorder.length-1);
        }
        private TreeNode build(int[] preorder, int start, int end){
            if (start>end) return null;
            int rootVal = preorder[preIndex++];
            TreeNode root = new TreeNode(rootVal);
            int mid = inMap.get(rootVal);
            root.left = build(preorder, start, mid-1);
            root.right = build(preorder, mid+1, end);
            return root;
        }
    }

    static void main(String[] args) {
        Solution sol = new Solution();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = sol.buildTree(preorder,inorder);
        System.out.println(root.value);
        System.out.println(root.left.value);
        System.out.println(root.right.value);
    }
}
