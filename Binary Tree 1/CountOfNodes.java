public class CountOfNodes {
    static class Node {
        int data;
        Node left, rigth;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.rigth = null;
        }

    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int lc=count(root.left);
        int rc=count(root.rigth);

        int TreeCount = lc + rc+ 1;

        return TreeCount;

    }

    public static void main(String[] args) {
        Node root= new Node(1);
        root.left = new Node(2);
        root.rigth=new Node(3);
        root.left.left = new Node(4);
        root.left.rigth = new Node(5);
        root.left.rigth.rigth = new Node(6);
        root.left.rigth.rigth .rigth= new Node(7);
        

        System.out.println("Count of Nodes is = "+count(root));

       


    }

    
}
