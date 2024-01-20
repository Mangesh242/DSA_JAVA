package tree;
import java.util.*;



public class FormBinaryTreePre_InorderArr {
    static HashMap<Integer,Integer> hm=new HashMap<>();
    public static void main(String[] args) {
        int[] Inorder={4,2,5,1,6,3,7};
        int[] PreOrder={1,2,4,5,3,6,7};
        int i=0;
        for(int ele:Inorder){
            hm.put(ele,i);
            i++;
        }

        TreeNode root = fbt(Inorder,PreOrder,0,Inorder.length-1,0,PreOrder.length-1);
        System.out.println("");

        printInOrder(root);
    }
    static void printInOrder(TreeNode node){
        if(node==null)return;
        printInOrder(node.left);
        System.out.println(node.val);
        printInOrder(node.right);
    }

    private static TreeNode fbt(int[] inorder, int[] preOrder,int is,int ie,int ps,int pe) {
        if(is > ie)
        return null;

        int rootVal=preOrder[ps];
        int indexPositionInorder=hm.get(rootVal);
        int cnt=indexPositionInorder - is;
        TreeNode nn=new TreeNode(rootVal);
        nn.left=fbt(inorder,preOrder,is,indexPositionInorder-1,ps+1,ps+cnt);
        nn.right=fbt(inorder,preOrder,indexPositionInorder+1,ie,ps+cnt+1,pe);
        return nn;
    }    
}
