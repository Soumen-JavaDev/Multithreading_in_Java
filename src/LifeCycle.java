public class LifeCycle extends Thread{
    public  LifeCycle(String name){//Provide the thread Name
        super(name);
    }
    public LifeCycle(){

    }
//    @Override
//    public void run() {
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Override
//    public void run() { // Interrupt()
//        try {
//            System.out.println("Thread is sleeping...");
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            System.out.println("Thread was interrupted!");
//        }
//    }
    public void run() {//    yield()
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            Thread.yield();
        }
    }
}
