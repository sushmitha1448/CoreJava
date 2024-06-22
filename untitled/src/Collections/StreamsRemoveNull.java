package Collections;
import java.util.*;
public class StreamsRemoveNull {
    public static void main(String args[]){
        List<String> cities = new ArrayList<String>();
        cities= Arrays.asList("ads","sdds","dfdsfd",null,"susmi","tha");
        cities.stream().filter(name->(null!=name)).forEach(System.out::println);

        Map<Character,Integer> sorted = new HashMap<Character,Integer>();
        String text = new String("susmitha");
        for (int i=0;i<text.length();i++){
            if(sorted.containsKey(text.charAt(i)))
                sorted.put(text.charAt(i),sorted.get(text.charAt(i))+1);
            else
                sorted.put(text.charAt(i),1);
        }

        sorted.entrySet().stream().filter(x->x.getValue()>1).forEach(System.out::println);
      //  for(Map.Entry<Character,Integer> elements:sorted.entrySet())

    }



    class HelloWorld {
        public static void main(String[] args) {
            String newString = new String("aaaaaaaaaaaaaaa");
            //Map<Character,Integer> newMap= new HashMap<Character,Integer>();
            int count=0;
            for(int i=0;i<newString.length()-2;i++){
                if(newString.charAt(i)==newString.charAt(i+1) && newString.charAt(i+1)==newString.charAt(i+2)){
                    count++;
                    i=i+2;
                }

            }
            System.out.println(count);
        }
    }

}
