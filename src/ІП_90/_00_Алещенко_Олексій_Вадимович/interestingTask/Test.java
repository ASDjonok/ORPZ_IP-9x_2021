package ІП_90._00_Алещенко_Олексій_Вадимович.interestingTask;

public class Test {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
// крутится в цикле пока ready ' = true;
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }


    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }

}
