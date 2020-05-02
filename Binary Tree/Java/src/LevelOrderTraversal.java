import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root !=null) q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> sub = new LinkedList<>();

            TreeNode curr;

            for(int i=0; i<size;i++){
                curr= q.poll();
                sub.add(curr.val);

                if(curr.left !=null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            ans.add(sub);
        }

    return ans;
    }

    public static void main(String args[]){
        List<Integer> arr = new ArrayList<Integer>();

        TreeNode tree = new TreeNode();
        tree = new TreeNode(1);
        tree.left= new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);


        levelOrder(tree);
    }
}
