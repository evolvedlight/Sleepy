package uk.stephenbrown;

public class Main {

    public static void main(String[] args) {
        int secondsToSleep = Integer.parseInt(args[1]);
        System.out.println(String.format("I am sleeping for {0} seconds", secondsToSleep));
        try {
            Thread.sleep(1000*secondsToSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Exiting");
        }
    }
}
