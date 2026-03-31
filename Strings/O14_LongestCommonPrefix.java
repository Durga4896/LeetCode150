package Strings;
import java.util.Arrays;

public class O14_LongestCommonPrefix {
    public static void main(String[] dspy){
       // String[]  strs = {"dog","racecar","car"};
        String[]  strs = {"flower","flow","flight"};
        Arrays.sort(strs);

        String str1 = strs[0];
        String str2 = strs[strs.length-1];

        int index = 0;

        while(index < str1.length() - 1 && str1.charAt(index) == str2.charAt(index)){
            index++;
        }
        System.out.println(str1.substring(0, index));
    }
}