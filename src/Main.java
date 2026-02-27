import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
    System.out.println("Multithreading in Java");

  /*   Thread  Life Cycle */

//        LifeCycle lifeCycle=new LifeCycle("soumen"); //NEW State
//        System.out.println(lifeCycle.getState());
//        lifeCycle.start(); // RUNNABLE OR RUNNING
//        System.out.println(lifeCycle.getState());
//
//        Thread.sleep(100);
//        System.out.println(lifeCycle.getState());//TIMED_WAITING
//
//        lifeCycle.join(); // waiting the main to completed lifeCycle
//        System.out.println(lifeCycle.getState()); //TERMINATED


 /* Thread Priority */

//        LifeCycle t1 =new LifeCycle("Thread 1");
//        LifeCycle t2 =new LifeCycle("Thread 2");
//        LifeCycle t3 =new LifeCycle("Thread 3");
//        t1.setPriority(Thread.NORM_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);

/* Interrupt()   yield()  */

        /* interrupt() is used to stop or signal a thread that it should stop working.It does NOT forcefully stop the thread.
        It just sends a signal. */

//        LifeCycle t = new LifeCycle("Interrupt");
//        t.start();
//        t.interrupt();

//        yield() tells the scheduler: "I am ready to pause. You can give chance to another thread."

        LifeCycle t1 = new LifeCycle();
        LifeCycle t2 = new LifeCycle();

        t1.start();
        t2.start();




    }
}