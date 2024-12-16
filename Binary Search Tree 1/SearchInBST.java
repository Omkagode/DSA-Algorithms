public class SearchInBST {
    static class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static Node insert(Node root, int val) {
        // base case
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            //left serach
            root.left = insert(root.left, val);
        } else {
            //right search
            root.right = insert(root.right, val);
        }

        return root;
    }


    public static boolean search(Node root, int key){
       // base condition
        if(root==null){
            return false;
        }

        if(root.data==key){
            return true;
        }

        if(root.data>key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }

        
    }

    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

       if( search(root, 7)){
        System.out.println("Key is found ");
       }else{
        System.out.println("key not found ");
       }

    }

}
