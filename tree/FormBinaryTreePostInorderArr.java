package tree;
import java.util.*;



public class FormBinaryTreePostInorderArr {
    static HashMap<Integer,Integer> hm=new HashMap<>();
    public static void main(String[] args) {
        int[] Inorder={4,2,5,1,6,3,7};
        int[] PostOrder={4,5,2,6,7,3,1};
        int i=0;
        for(int ele:Inorder){
            hm.put(ele,i);
            i++;
        }

        TreeNode root = fbt(Inorder,PostOrder,0,Inorder.length-1,0,PostOrder.length-1);
        System.out.println("");

        printInOrder(root);
    }
    static void printInOrder(TreeNode node){
        if(node==null)return;
        printInOrder(node.left);
        System.out.println(node.val);
        printInOrder(node.right);
    }

    private static TreeNode fbt(int[] inorder, int[] postOrder,int is,int ie,int ps,int pe) {
        if(is > ie)
        return null;

        int rootVal=postOrder[pe];
        int indexPositionInorder=hm.get(rootVal);
        int cnt=indexPositionInorder - is;
        TreeNode nn=new TreeNode(rootVal);
        nn.left=fbt(inorder,postOrder,is,indexPositionInorder-1,ps,ps+cnt-1);
        nn.right=fbt(inorder,postOrder,indexPositionInorder+1,ie,ps+indexPositionInorder,pe-1);
        return nn;
    }    
}
