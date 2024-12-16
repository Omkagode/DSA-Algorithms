
public class Tree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree {
        static int idx = -1;

        public  Node buildTree(int preorder[]) {
            idx++;
            if (preorder[idx] == -1) {
                return null;
            }

            Node newNode = new Node(preorder[idx]);
            newNode.left = buildTree(preorder);
            newNode.right = buildTree(preorder);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int preorder[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,9,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(preorder);
        System.out.println(root.data);
    }

}
