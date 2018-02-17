public class Main3 {
    public static void main(String[] args) {

        //Create new bus
        Bus Bus1 = new Bus(1);

        //Create new passenger
        Passenger Passenger1 = new Passenger(15, "Aaron", 1);

        //Add first passenger to bus
        Bus1.addPassenger(Passenger1);

        //Print Passengers on bus
        Bus1.getPassengers();

    }
}
