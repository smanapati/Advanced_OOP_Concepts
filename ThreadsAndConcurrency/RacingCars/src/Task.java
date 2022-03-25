public class Task {
    public static void main(String[] args){
        // create car instances
        Car c1 = new Car("Kona",250);
        Car c2 = new Car("Ioniq",220);

        // create racers
        Runnable racer1 = new Racer(c1);
        Runnable racer2 = new Racer(c2);

        // create threads
        Thread thread1 = new Thread(racer1);
        Thread thread2 = new Thread(racer2);

        thread1.start();
        thread2.start();
    }
}