package Collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream1 {
    public static void main(String[] args) {
        int[] elementsArray = {1, 2, 3, 4, 5};
        List<Integer> listOfObjects = Arrays.stream(elementsArray).boxed().toList();
        List<Empoyee> employeesList = new ArrayList<Empoyee>() {
            {
            add(new Empoyee(1,"susmitha","eluri",200000,"lionova"));

            add(new Empoyee(2,"susm","eluri",500000,"onova"));
                add(new Empoyee(2,"susm","eluri",500000,"onova"));

        }


    };
        //employeesList.stream().filter(distinctByKey(p->p.getN)).forEach(System.out::println);


            List persons = new ArrayList();
            persons.add("Max");
            persons.add("John");
            persons.add("John");
            persons.add("Greg");
         //   persons.stream().filter(p->Collections.frequency(persons,p)==1).forEach(System.out::println);

    //Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.
        List<Integer> numbersList= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        numbersList.stream().filter(n->n%2==0).forEach(System.out::println);
        numbersList.stream().filter(n->!(n%2==0)).forEach(System.out::println);
       // Remove duplicate elements from a list using Java 8 streams
        List<Integer> duplicateList= new ArrayList<>(Arrays.asList(1,2,3,4,4,3));
       List<Integer> distincts= duplicateList.stream().distinct().toList();
       System.out.println(distincts);
       //Write a Java 8 program to find the frequency of each character in a given string using the stream API and collectors.
        List<Character> freq = new ArrayList<Character>(Arrays.asList('A','B','c','c','A'));
        Map<Character,Long> fre =freq.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(fre);

        Map<String,List<Empoyee>> ll = employeesList.stream().collect(Collectors.groupingBy(Empoyee::getfName));
        System.out.println(ll);
        Map<String,Set<Empoyee>> sortedList = employeesList.stream().collect(Collectors.groupingBy(Empoyee::getfName,Collectors.toSet()));
        System.out.println(sortedList);
        Map<String,Set<String>> sortedwithName = employeesList.stream().collect(Collectors.groupingBy(Empoyee::getfName,Collectors.mapping(Empoyee::getlName,Collectors.toSet())));
        System.out.println(sortedwithName);

        //Find the frequency of each element in an array or a list
        List<Integer> freqOfArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,6));
        Map<Integer,Long> mappedValue=freqOfArray.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(mappedValue);
        //Sort a given list of decimals in reverse order

        List<Float> listOfDec= new ArrayList<Float>(Arrays.asList(0.001f,0.002f,0.003f,0.005f));
        listOfDec.stream().sorted().forEach(System.out::println);

        //reverse order
        List<Float> listOfDecInRevers= new ArrayList<Float>(Arrays.asList(0.001f,0.002f,0.003f,0.005f));
        listOfDecInRevers.stream().sorted((x,y)->Float.compare(y,x)).forEach(System.out::println);

        //Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter

        List<String> stringsList = new ArrayList<String>(Arrays.asList("sus","mitha","elu","ddg"));
        String str=stringsList.stream().collect(Collectors.joining(",","[","}"));
        System.out.println(str);
        //Print the numbers from a given list of integers that are multiples of 5

        List<Integer> five = new ArrayList<Integer>(Arrays.asList(1,5,6,7,10));
        List<Integer> fiveMultiples = five.stream().filter(x->x%5==0).collect(Collectors.toList());
        System.out.println(fiveMultiples);
       // Find the maximum and minimum of a list of integers

        IntSummaryStatistics max = five.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(max.getMax());

        //Merge two unsorted arrays into a single sorted array using Java 8 streams



    }
}
