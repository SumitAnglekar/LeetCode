import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PostOrderTraversalBinaryTree {

    public static List<Integer> postorderTraversal(TreeNode root) {
        LinkedList <TreeNode> stack = new LinkedList<>();
        LinkedList <Integer> result = new LinkedList<>();

        if(root==null) return result;

        stack.add(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            result.add(node.val);

            if(node.left !=null){
                stack.add(node.left);
            }
            if(node.right !=null){
                stack.add(node.right);
            }

        }
        return result;
    }


    public static void main(String args[]){
        List<Integer> arr = new ArrayList<Integer>();

        TreeNode tree = new TreeNode();
        tree = new TreeNode(1);
        tree.left= new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);

        postorderTraversal(tree);
    }
}
