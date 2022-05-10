package alori;

public class Tree {
    //树的最大深度
    public int maxDeath(TreeNode root){
        if(root == null) return 0;
        int left = maxDeath(root.left);
        int right = maxDeath(root.right);
        return Math.max(left,right) + 1;
    }

    //判断二叉平衡树
    public boolean isBalanced(TreeNode root){
        return maxDeathForBalanced(root) != -1;
    }

    public int maxDeathForBalanced(TreeNode root){
        if(root == null) return 0;

        int left = maxDeathForBalanced(root.left);
        int right = maxDeathForBalanced(root.right);

        if(left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        }

        return Math.max(left,right) + 1;
    }
}
