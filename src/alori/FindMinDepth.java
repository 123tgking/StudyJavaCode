package alori;

import java.util.LinkedList;
import java.util.Queue;

public class FindMinDepth {

    public int minDepth(TreeNode root){
        if(root.left == null && root.right == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 1;
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode curr = queue.poll();

                if(curr.right == null && curr.left == null) return depth;

                if(curr.left != null) queue.add(curr.left);

                if (curr.right != null) queue.add(curr.right);
            }

            depth ++;
        }

        return depth;

    }
}
