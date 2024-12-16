public class DiameterApporachOne {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        int totalHeight = Math.max(lh, rh) + 1;

        return totalHeight;

    }

    public static int diameter(Node root){
        if(root == null) return 0;

        int ld= diameter(root.left);
        int rd=diameter(root.right);

        int lh = height(root.left);
        int rh = height(root.right);

        int selfDiam= lh + rh +1;
        int totalDiameter = Math.max(Math.max(ld, rd), selfDiam);
        return totalDiameter;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.left.right.right = new Node(6);
        // root.left.right.right.right = new Node(7);

        System.out.println("Count of Nodes is = " + diameter(root));
    }

}
