package tree;

import java.util.HashSet;

public class TwoSumBST {
        class TreeNode{
     int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) {
          val = x;
          left=null;
          right=null;
         }
     }

    HashSet<Integer> hs=new HashSet<>();
    Boolean flag=false;

    public int t2Sum(TreeNode A, int B) {
       printInOrder(A,B);
       if(flag)return 1;
       return 0;
    }

      public void printInOrder(TreeNode node,int B){
        if(node==null)return;
        if(hs.contains(B-node.val)){
                flag=true;
                return;
        }else{
            hs.add(node.val);
        }

        printInOrder(node.left,B);
        printInOrder(node.right,B);
    }

    public static void main(String[] args) {
        TwoSumBST obj=new TwoSumBST();

        TreeNode nn=obj.new TreeNode(10);

        nn.left=obj.new TreeNode(5);
        nn.right=obj.new TreeNode(20);

        System.out.println(obj.t2Sum(nn, 30));
        

    }
}
