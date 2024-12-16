import java.util.*;
import java.util.LinkedList;

public class Levelorder {
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

    static int h=0;
    public static void levelorder(Node root){
      

        if(root==null){
            return;
        }

        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                h++;
                System.out.println();

                if (q.isEmpty()) {
                    break;
                    
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                

                if(curr.left!=null){
                    q.add(curr.left);
                }

                if (curr.rigth!=null) {
                    q.add(curr.rigth);
                    
                }
            }

            
        }


    }

    public static void main(String[] args) {
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int nodes[]={1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        Node root = buildTree(nodes);
        levelorder(root);

        System.out.println("height "+h);
    }
    
}
