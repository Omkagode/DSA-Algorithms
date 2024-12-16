import java .util.*;
public class RootToleafPath {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void print(ArrayList<Integer> path ){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
       System.out.println();
    }

    public static void printPath(Node root,ArrayList<Integer> path ){
        
        if(root==null) return;

        path.add(root.data);

        if(root.left==null && root.right== null){
            print(path);
        }

        printPath(root.left, path);

        printPath(root.right, path);

        path.remove(path.size()-1);

    }

    public static void main(String[] args) {
        Node root= new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left= new Node(3);
        root.left.right= new Node(6);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);


        printPath(root, new ArrayList<>());


    }
    
}
