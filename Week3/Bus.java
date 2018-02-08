public class Bus {
    //Attributes
    private Passenger[] Passengers =  new Passenger[15];

    //Add Passenger
    public boolean addPassenger(Passenger passengerIn){
        for(int i = 0; i > Passengers.length; i++){
            if(Passengers[i] == null){
                Passengers[i] = passengerIn;
                return true;
            }
        }
        return false;
    }
    //Remove Passenger
    public boolean removePassenger(Passenger passengerID){
        for(int i = 0; i > Passengers.length; i++){
            if(Passengers[i].getID() == passengerID) {
            }
        }
    }
}
