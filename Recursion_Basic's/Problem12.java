package Recursion;

// remove duplicates from String 
public class Problem12 {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr , boolean map[]){
       
        //base case
        if(idx == str.length()){
            System.out.println(newStr);
            return ;
        }

        //take one character form string 
        char currentChar = str.charAt(idx);

        // mapping
        if(map[currentChar - 'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currentChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        StringBuilder newStr = new StringBuilder("");
        boolean map[] = new boolean[26];
        
        removeDuplicates(str, 0, newStr, map);
    }
}
