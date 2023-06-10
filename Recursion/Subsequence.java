package Recursion;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        System.out.println(subseqRet("", "12"));
    }

    static ArrayList<String>  subseqRet(String p, String up){
      if(up.isEmpty()) {
         ArrayList<String> list = new ArrayList<>();
         list.add(p);
         return list;
      }  
      char ch = up.charAt(0);
      ArrayList<String> left = subseqRet( p + ch, up.substring(1));
      ArrayList<String> right = subseqRet(p, up.substring(1));

      left.addAll(right);
       return left;
    }

    static void subseqAscii(String p, String up){
      if(up.isEmpty()){
        System.out.println(p);
        return;
      }  
       char ch = up.charAt(0);
       subseqAscii(p + ch, up.substring(1));
       subseqAscii(p, up.substring(1));
       subseqAscii(p + (ch + 0), up.substring(1));
    }
}
