package Strings;

public class O151_ReverseWordsInAString {
    public static void main(String[] args){
        String s = "the sky is blue   hello world a good   example";

        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
