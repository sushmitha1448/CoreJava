package LeetCode;
import java.util.*;



public class Multiplication {
    static int numbers[] = {1,2,3,4,5,6};
    static int multipliedList[];
    static int multiplicatonCount;
    public static void main(String args[]){

        int multiplicationList[];
        int multiplicationCount = 1;
        for (int i = 0; i< numbers.length; i++){
            multiplicationCount=multiplicationCount*numbers[i];
           // int avoidThis=numbers[i];
            //Multiplication.calculate(avoidThis,i);
       }
        System.out.println(multiplicationCount);
        for (int j=0;j< numbers.length;j++){
            numbers[j]=multiplicationCount/numbers[j];
            System.out.println(numbers[j]);
            // int avoidThis=numbers[i];
            //Multiplication.calculate(avoidThis,i);

        }


    }



    }


