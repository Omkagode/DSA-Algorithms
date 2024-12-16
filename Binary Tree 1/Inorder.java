public class Inorder {

    static class Node{
        int data;
        Node left, rigth;
        Node(int data){
            this.data=data;
            this.left=null;
            this.rigth=null;
        }
    }
    
    static int idx=-1;

    public static Node buildTree(int nodes[]){
        idx++;

        if(nodes[idx]==-1){
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.rigth= buildTree(nodes);

        return newNode;


    }


    public static void inorder(Node root){

        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.rigth);
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(nodes);
        inorder(root);
    }


    
}
