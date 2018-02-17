public class Bus {
    //Attributes
    private Passenger[] passengers;
    private int busID;


    //Constructor
    public Bus(int busID ) {
        this.busID = busID;
        this.passengers = new Passenger[15];
    }

    //Add Passenger
    public boolean addPassenger(Passenger newPassenger) {
        for (int i =0; i < passengers.length; i++) {
            if ( passengers[i] == null) {
                passengers[i] = newPassenger;
                return true;
            }
        }
    return false;
    }

    public boolean removePassenger(int PassengerID) {
        for (int i = 0; i < passengers.length; i++) {
            if(passengers[i].getID() == PassengerID) {
                passengers[i] = null;
                return true;
            }
        }
        return false;
    }

    //Print Passengers on bus
    public void getPassengers() {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                System.out.println(passengers[i].getName());
            }
        }
    }

}


