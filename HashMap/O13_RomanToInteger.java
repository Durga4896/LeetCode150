package HashMap;
import java.util.HashMap;
public class O13_RomanToInteger {
    public static void main(String[] dspy){
        String s = "MCMXCIV";
        
        HashMap<Character, Integer> ri = new HashMap<>();
        ri.put('I',1);
        ri.put('V',5);
        ri.put('X',10);
        ri.put('L',50);
        ri.put('C',100);
        ri.put('D',500);
        ri.put('M',1000);

        int sum = 0;

        for(int i=0; i < s.length() - 1; i++){
            if(ri.get(s.charAt(i)) > ri.get(s.charAt(i + 1))){
                sum += ri.get(s.charAt(i));
            }
            else{
                sum -= ri.get(s.charAt(i));
            }
        }
        System.out.println(sum + ri.get(s.charAt(s.length() - 1)));
    }
}
