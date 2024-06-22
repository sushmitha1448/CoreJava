package Programs;
import java.util.*;

public class Multiples {

    public static void main (String args[]){
        Map<Character,Integer> sorted = new HashMap<Character,Integer>();
         String text = new String("susmitha");
         for (int i=0;i<text.length();i++){
             if(sorted.containsKey(text.charAt(i)))
                 sorted.put(text.charAt(i),sorted.get(text.charAt(i))+1);
             else
                 sorted.put(text.charAt(i),1);
         }


    }
}
