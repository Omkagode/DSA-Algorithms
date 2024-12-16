
public class BuildTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }   
    }
   
  
    public static Node buildTree(Node root, int val){
      
        if(root == null){
            root= new Node(val);
            return root;
        }
       
    
       
        if(root.data>val){
            //left sub-tree
            root.left= buildTree(root.left,val);
        }else{
            // rigth sub-tree
            root.right = buildTree(root.right, val);
        }

        return root;

    }

    public static void inorder(Node root){
        // base case
        if(root == null){
            return ;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root= null;

        for(int i=0; i< values.length;i++){
            root = buildTree(root, values[i]);
        }

        inorder(root);
        System.out.println();
    }

    
}
