package Strings;
public class O392_IsSubsequence {
    public static void main(String[] args){
        String s = "", t = "";

        int sp = 0, tp = 0;
        int i = 0;
        while(sp < s.length() && tp < t.length()){
            if(s.charAt(sp) == t.charAt(tp)){
                sp++;
            }else{
                tp++;
            }
        }
        System.out.println(sp == s.length());
    }
}
