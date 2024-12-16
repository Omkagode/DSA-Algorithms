

public class TrsnformToSumTree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    
        
    }

    public static Node preorder(Node root){
        if(root == null) return null;
        System.out.print(root.data + " ");
        root.left = preorder(root.left);
        root.right = preorder(root.right);
        return root;
    }

    public static int tranform(Node root){
        // base case 
        if (root==null) {
            return 0;            
        }
        int leftChild= tranform(root.left);
        int rightChild= tranform(root.right);
        
        int data =root.data;
        int left= root.left==null ? 0: root.left.data;
        int right= root.right==null ? 0: root.right.data;
        root.data= left + leftChild +right+rightChild;

        return data;
    }

    public static void main(String[] args) {
        Node root= new Node(1);
        root.left = new Node(2);
        root.right= new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        tranform(root);
        preorder(root);
    }


    
}
