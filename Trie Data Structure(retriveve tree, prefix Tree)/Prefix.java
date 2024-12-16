
public class Prefix {

    public static class Node {
        public Node[] children = new Node[26];
        Boolean endOfWord= false;
        int freq;

        public Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            freq=1;
        }
    }

    public static Node root= new Node();
        

    public static void insert(String Word){
        Node curr= root;
        
        for(int level=0;level<Word.length();level++){
            int idx= Word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]= new Node();
               
            }else{
                curr.children[idx].freq++;
            }
                curr= curr.children[idx];
               
        }
        curr.endOfWord=true;
    }

    public static void findPrefix(Node root, String ans){
        //base case
        if(root==null){
            return;
        }

        if(root.freq==1){
            System.out.print(ans+" ");
            return;
        }
        
        for(int i=0;i<root.children.length;i++){
           if(root.children[i]!=null){
            char ch = (char)('a' + i);
            findPrefix(root.children[i],ans + ch);
           }

        }
    }

    public static void main(String[] args) {
        String [] arr={"zebra","dog","duck","dove"};

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        
        root.freq=-1;

        findPrefix(root, "");
    }


    
}
