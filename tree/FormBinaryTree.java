package tree;

public class FormBinaryTree {
    class TreeNode{
        String val;
        TreeNode left;
        TreeNode right;

        TreeNode(String data){
            this.val=data;
            left=null;
            right=null;
        }

    }

    public static void main(String[] args) {
        FormBinaryTree x=new FormBinaryTree();
        TreeNode node=x.new TreeNode("+");
        TreeNode node2=x.new TreeNode("a");
        TreeNode node3=x.new TreeNode("b");
        node.left=node2;
        node.right=node3;
        x.printInOrder(node);
        x.printPreOrder(node);
        x.printPostOrder(node);
    }

    public void printInOrder(TreeNode node){
        if(node==null)return;
        printInOrder(node.left);
        System.out.println(node.val);
        printInOrder(node.right);
    }
    
    public void printPostOrder(TreeNode node){
        if(node==null)return;
        printInOrder(node.left);
        printInOrder(node.right);
        System.out.println(node.val);
    }

    public void printPreOrder(TreeNode node){
        if(node==null)return;
        System.out.println(node.val);
        printInOrder(node.left);
        printInOrder(node.right);
        
    }
    
}
