package Strings;
import java.util.HashMap;
public class O205_IsomorphicStrings {
    public static void main(String[] args){
        String s = "f11";
        String t = "b23";

        HashMap<Character, Character> IS = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(IS.containsKey(s.charAt(i)))
                if(IS.get(s.charAt(i)) != t.charAt(i)){
                     System.out.println(false);
                     return;
                }
            else if(IS.containsValue(t.charAt(i))){
                System.out.println(false);
                return;
            }
            IS.put(s.charAt(i), t.charAt(i));
        }
        System.out.println(true);

    }
}
