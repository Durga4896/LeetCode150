package Strings;

public class O242_ValidAnagram {
    public static void main(String[] dspy){
        String s = "anagram";
        String t = "bangara";
        
        if(s.length() != t.length()){
            System.out.println(false);
        }else{
            int[] count = new int[26];
            for(int i=0; i<s.length();i++){
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }
            for(int i=0; i<count.length; i++){
                if(count[i] != 0){
                    System.out.println(false);
                    return;
                }
            }
            System.out.println(true);
        }
    }
}