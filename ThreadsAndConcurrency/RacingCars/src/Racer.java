public class Racer implements Runnable {
    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.

    /* TODO: Create a constructor that receives a Car objec and initializes c. */
    public Racer(Car c) {
        this.c = c;
    }

    @Override
    /*
     * TODO Override one method. This is the task the thread will perform...
     * You have to determine which method this is. Check the method description.
     */
    public void run() {
        // As long as the car's odometer has not reached
        // the distance this racer is supposed to race,
        while (c.odometer < distance) {
            // move car by one mile
            c.move(1);
            // check if car ran out of fuel
            if (c.miles == 0) {
                // charge the car
                c.charge();
                // print charging
                System.out.println("Charging");
                // sleep as many milliseconds as miles were charged.
                try {
                    Thread.sleep((long)c.miles);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
