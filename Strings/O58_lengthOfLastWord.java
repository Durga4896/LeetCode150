package Strings;
import java.util.Scanner;
public class O58_lengthOfLastWord {
   public static void main(String[] dspy){
     Scanner scnr = new Scanner(System.in);
    String s = scnr.nextLine();
    int count = 0;
    String str = s.trim();
    for(int i = str.length() - 1; i>= 0; i--){
        if(str.charAt(i) != ' '){
            count++;
        }
        else{
            break;
        }
    }
    System.out.println(count);
   }
}