package Strings;
public class O28_IndexofFirstOccurance {
    public static void main(String[] dspy){
        String haystack = "DurgaSaiPrasad";
        String needle = "sai";

        if(haystack.contains(needle)){
            System.out.println(haystack.indexOf(needle));
        }else{
            System.out.println(-1);
        }
    }
}
