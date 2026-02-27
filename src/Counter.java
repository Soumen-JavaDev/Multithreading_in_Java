public class Counter {
   private int count=0;


    public synchronized void increment(){//critical Section
         count++;
    }
    public int getCount(){
        return count;
    }
}
