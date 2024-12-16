public class DiameterApporachTwo {

    static class Node {
        int data;
        Node left, rigth;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.rigth = null;
        }

    }

    static class Info{
        int daim;
        int ht;

        public Info(int data, int ht ){
            this.daim = data;
            this.ht=ht;
        }
    }

    public static Info diameter(Node root){
        if(root==null) return new Info (0,0);

        Info lInfo=diameter(root.left);
        Info rInfo=diameter(root.rigth);

        int diam=Math.max(Math.max(lInfo.daim, rInfo.daim), (lInfo.ht +rInfo.ht+1));
        int ht=Math.max(lInfo.ht, rInfo.ht) +1 ;

        return new Info(diam, ht);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.rigth = new Node(3);
        root.left.left = new Node(4);
        root.left.rigth = new Node(5);
        root.left.rigth.rigth = new Node(6);
        root.left.rigth.rigth.rigth = new Node(7);

        System.out.println("The Diametre of tree is  = " + diameter(root).daim);
        System.out.println("The Height of tree is  = " + diameter(root).ht);
    }

    
}
