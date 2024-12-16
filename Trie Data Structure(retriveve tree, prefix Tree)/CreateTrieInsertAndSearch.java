public class CreateTrieInsertAndSearch {

    public static class Node {
        public Node[] children = new Node[26];
        Boolean endOfWord= false;
        

        public Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
        public static Node root= new Node();
        
        
        public static void insert(String Word){
            Node curr= root;
            
            for(int level=0;level<Word.length();level++){
                int idx= Word.charAt(level)-'a';
                if(curr.children[idx]==null){
                    curr.children[idx]= new Node();
                   
                }
                    curr= curr.children[idx];
                   
            }
            curr.endOfWord=true;
        }

        public static boolean serach(String key){
            Node curr= root;
            for(int level=0;level<key.length();level++){
                int idx= key.charAt(level)-'a';
                if(curr.children[idx]==null){
                    return false;
                }
                    curr= curr.children[idx];
            }
            return curr.endOfWord=true;
        }

        
  
    public static void main(String[] args) {
        String Words[]={"the","a","there","their","any","thee"};
        for(int i=0;i<Words.length;i++){
             insert(Words[i]);
        }

        System.out.println(serach("thee")); //true
        System.out.println(serach("thor"));  // false
      
      

    }
   
    
}
