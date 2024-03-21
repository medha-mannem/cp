/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(0,nums.length-1,nums);
    }
    public TreeNode buildTree(int start,int end,int[] nums){
        if(start>end){
            return null;
        }
        int maxIdx=-1;
        int max = Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            if(nums[i]>max){
                maxIdx=i;
                max=nums[i];
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = buildTree(start,maxIdx-1,nums);
        root.right = buildTree(maxIdx+1,end,nums);
        return root;
    }
}
