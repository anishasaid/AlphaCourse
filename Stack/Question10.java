package Stack;

import java.util.*;

//Simplify Path
/* 
We hava an absolute path for a file (Unix-style), simplify it.
Note that absolute path always begin with ‘/’ (root directory),
a dot in path represent current directory and double dot 
represents parent directory.

Sample Input 1 : /apnacollege/
Sample Output 1 : /apnacollege

Sample Input 1 : /a/..
Sample Output 1 : /
*/
public class Question10 {
    static String simplify(String str){

        Stack<String> st = new Stack<String>();
        
        String res = "";
        res += "/";
        int len_str = str.length();

        for (int i = 0; i < len_str; i++){
            String dir = "";

            while (i < len_str && str.charAt(i) == '/'){
                i++;
            }
            while (i < len_str && str.charAt(i) != '/'){
                dir += str.charAt(i);
                i++;
            }

            if (dir.equals("..") == true){
                if (!st.empty())
                st.pop();
            }else if (dir.equals(".") == true){
                continue;
            }else if (dir.length() != 0){
                st.push(dir);
            }

            Stack<String> st1 = new Stack<String>();

            while (!st.empty()){
                st1.push(st.pop());
            }

            while (!st1.empty()){
                if (st1.size() != 1)
                    res += (st1.pop() + "/");
                else
                    res += st1.pop();
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = new String("/a/./b/../../c/");
        String res = simplify(str);
        System.out.println(res);
    }
}

