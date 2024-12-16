

public class SortedArrayToBalancedBST {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }

    }

    public static Node createBST(int arr[], int st, int end){
        if(st>end){
            return null;
        }
        int mid= (st+ end)/2;

        Node root= new Node(arr[mid]);

        root.left =createBST(arr, st, mid-1);
        root.right= createBST(arr, mid+1, end);
        return root;

    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int arr[] = {8,5,3,6,11,10,12};

       Node root= createBST(arr, 0, arr.length-1);
        inorder(root);

        
    }

    
    
}
