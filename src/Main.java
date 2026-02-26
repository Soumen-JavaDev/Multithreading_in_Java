import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
    System.out.println("Multithreading in Java");

     /*   Thread  Life Cycle */
        LifeCycle lifeCycle=new LifeCycle(); //NEW State
        System.out.println(lifeCycle.getState());
        lifeCycle.start(); // RUNNABLE OR RUNING
        System.out.println(lifeCycle.getState());

        Thread.sleep(100);
        System.out.println(lifeCycle.getState());//TIMED_WAITING

        lifeCycle.join();
        System.out.println(lifeCycle.getState()); //TERMINATED
    }
}