package tree;

public class MirrorTree {
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
        public static void main(String[] args) {
            MirrorTree obj=new MirrorTree();
            TreeNode nn=obj.new TreeNode(10);

            nn.left=obj.new TreeNode(5);
            nn.right=obj.new TreeNode(20);
            display(nn);
            invertTree(nn);
            display(nn); 
    }

     private static void display(TreeNode nn) {
        if(nn==null)return;    
        System.out.println(nn.val);
        display(nn.left);
        display(nn.right);

        }
    private static void invertTree(TreeNode nn) {
                if(nn==null)return;

                TreeNode temp=nn.left;
                nn.left=nn.right;
                nn.right=temp;

                invertTree(nn.left);
                invertTree(nn.right);
        }
}
