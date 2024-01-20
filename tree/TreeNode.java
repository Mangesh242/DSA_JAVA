package tree;
public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.val=data;
        left=null;
        right=null;
    }
    public static void printInOrder(TreeNode node){
        if(node==null)return;
        printInOrder(node.left);
        System.out.println(node.val);
        printInOrder(node.right);
    }
    
}
