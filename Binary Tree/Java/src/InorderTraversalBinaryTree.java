import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InorderTraversalBinaryTree {
    public static List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();


        TreeNode node = root;

        while (node!=null || !stack.isEmpty()){
            while (node!=null){
                stack.add(node);
                node= node.left;
            }
            node = stack.pop();
            result.add(node.val);
            node= node.right;

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


        inorderTraversal(tree);
    }
}
