package tree.BST;
import java.util.ArrayList;
public class MIT {
       public ArrayList<Integer> solve(TreeNode A) {
            ArrayList<Integer> ans=new ArrayList<>();
            MorrisInOrderTraversal(A,ans);
            return ans;
    }

     class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) {
              val = x;
              left=null;
              right=null;
             }
         }
    public void MorrisInOrderTraversal(TreeNode A, ArrayList<Integer> ans){
        while(A!=null){
            if(A.left == null){
                ans.add(A.val);
                A=A.right;
            }else{
            TreeNode temp=A.left;
            while(temp.right !=null && temp.right!=A){
                temp=temp.right;
            }
            if(temp.right==null)
            {
                temp.right=A;
                A=A.left;
            }else if(temp.right==A){
                ans.add(A.val);
                A=A.right;
                temp.right=null;
            }
        }
        }
    }
    
}
