public class RemoveDuplicate {

    public static void RemoveDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate charater present
            RemoveDuplicates(str, idx + 1, newStr, map);
        } else {
            //if that char is not-present(false) mark that as true 
            // unique character present
            map[currChar - 'a'] = true;
            RemoveDuplicates(str, idx + 1, newStr.append(currChar), map);

        }

    }

    public static void main(String[] args) {
        String str = "aappnnabhai";
        boolean[] map = new boolean[26];
        RemoveDuplicates(str, 0, new StringBuilder(""), map);

    }

}
