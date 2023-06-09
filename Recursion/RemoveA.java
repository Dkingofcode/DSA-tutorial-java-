package Recursion;

public class RemoveA {
    public static void main(String[] args) {
       skip("", "baccadb"); 
    }

    static String skip(String p, String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
           return skip(p, up.substring(1)); 
        }else{
            return skip(p + ch, up.substring(1));
        }
    }
}
