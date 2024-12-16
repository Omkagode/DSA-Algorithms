public class HeightOfTree {

    static class Node {
        int data;
        Node left, rigth;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.rigth = null;
        }

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.rigth);

        return Math.max(lh, rh)+1;

    }

    public static void main(String[] args) {
        Node root= new Node(1);
        root.left = new Node(2);
        root.rigth=new Node(3);
        root.left.left = new Node(4);
        root.left.rigth = new Node(5);
        root.left.rigth.rigth = new Node(6);
        root.left.rigth.rigth .rigth= new Node(7);
        

        System.out.println("Height of tree(Nodes) is = "+height(root));

        System.out.println();

        System.out.println("Height of tree(Edges) is =  "+(height(root)-1));


    }

}
