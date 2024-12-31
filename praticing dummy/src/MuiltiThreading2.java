public class MuiltiThreading2 implements Runnable {
    private int threadID;

    public MuiltiThreading2(int threadID) {
        this.threadID = threadID;
    }

    @Override
    public void run() {
        for (int count = 0; count <= 10; count++) {
            System.out.println(count + "from thread threadId " + threadID);
//            if(threadID % 2 == 0) {
//                throw new RuntimeException();
//            }

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {

            }
        }


    }
}