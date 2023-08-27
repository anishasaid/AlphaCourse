package strings;

public class CheckPalindrom {

    public static boolean isPalinfrom(String str){
        int n = str.length();

        for(int i=0 ;i< str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrom
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Anisha";
        System.out.println(isPalinfrom(str));
    }
}
