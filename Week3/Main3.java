public class Main3 {
    public static void main(String[] args) {

        //Create new bus
        Bus Bus1 = new Bus(1);

        //Create new passenger
        Passenger Passenger1 = new Passenger(15, "Aaron", 1);
        Passenger Passenger2 = new Passenger(24,"James", 2);


        //Add some passengers to bus
        Bus1.addPassenger(Passenger1);
        Bus1.addPassenger(Passenger2);


        //Print details of every passenger on bus
        Bus1.getPassengers();

        //Print number of customers on bus
        System.out.println(Bus1.getNumPassengers());

        //Remove passenger from bus
        Bus1.removePassenger(1);


    }
}
