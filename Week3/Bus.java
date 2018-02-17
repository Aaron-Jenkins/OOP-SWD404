public class Bus {
    //Attributes
    private Passenger[] passengers;
    private int busID;


    //Constructor
    public Bus(int busID ) {
        this.busID = busID;
        this.passengers = new Passenger[15];
    }

    //Add Passenger to Bus
    public boolean addPassenger(Passenger newPassenger) {
        for (int i =0; i < passengers.length; i++) {
            if ( passengers[i] == null) {
                passengers[i] = newPassenger;
                return true;
            }
        }
    return false;
    }

    //Remove Passenger from Bus
    public boolean removePassenger(int PassengerID) {
        for (int i = 0; i < passengers.length; i++) {
            if(passengers[i].getID() == PassengerID) {
                passengers[i] = null;
                return true;
            }
        }
        return false;
    }

    //Print details for passengers on Bus
    public void getPassengers() {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                System.out.println("Display details for passenger in seat " + (i + 1) + "...");
                System.out.println("Name:\t" + passengers[i].getName());
                System.out.println("Age:\t" + passengers[i].getAge());
                System.out.println("ID:\t\t" + passengers[i].getID());
                System.out.println("-------------------------------------------------------");
            }
            else {
                System.out.println("Display details for passenger in seat " + (i + 1) + "...");
                System.out.println("Seat is empty");
                System.out.println("-------------------------------------------------------");
            }
        }
    }

    public int getNumPassengers() {
        int count = 0;
        for (int i = 0; i < passengers.length; i++) {
            if(passengers[i] != null) {
              count++;
            }
        }
        return count;
    }

}


