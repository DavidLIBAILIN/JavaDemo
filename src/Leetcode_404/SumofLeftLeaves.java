package Leetcode_404;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class SumofLeftLeaves {
    public static void main(String[] args) {
        SumofLeftLeaves sumofLeftLeaves = new SumofLeftLeaves();
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return findSum(root, 0, false);
    }

    private int findSum(TreeNode root, int sum, boolean isLeft) {
        if (root == null) return sum;
        if (root.left == null && root.right == null && isLeft) {
            return sum + root.val;
        }
        return findSum(root.left, 0, true) + findSum(root.right, 0, false);
    }
}
