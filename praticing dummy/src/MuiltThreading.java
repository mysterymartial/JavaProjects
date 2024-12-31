public class MuiltThreading {
    public static void main(String[] args) {
        for (int count = 0; count <= 5; count++) {
            multiThreadingThing myThing = new multiThreadingThing(count);
            //myThing.start(); this is for extend thread
            // for implement runnable code implementation
            Thread thread = new Thread(myThing);
            thread.start();
            try {
                thread.join();
                thread.isAlive();// it return a boolean that say true if the thread is still runing
            } catch (InterruptedException e) {
                e.printStackTrace();// this make the thread wait for eachother to complete
            }

        }
        //throw new RuntimeException();

        //multiThreadingThing myThing2 = new multiThreadingThing();
       // myThing2.start();
        //myThing.interrupt();
        //myThing2.interrupt();
        //myThing.run() will not do mulitithreading it will do the task on the same thread
    }
}
