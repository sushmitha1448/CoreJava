import MultiThreading.ThreadCreation1;
import MultiThreading.ThreadCreation2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        //thread creation using a class
       /* ThreadCreation1 tc1= new ThreadCreation1();
        tc1.start();
        ThreadCreation1 tc2= new ThreadCreation1();
        tc2.start();*/
        //thread creating by Implementing Runnable
        Thread t = new Thread(new ThreadCreation2());
        t.start();
        Thread t1 = new Thread(new ThreadCreation2());
        t1.start();
    }
}