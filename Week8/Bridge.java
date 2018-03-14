public class Bridge {

    Vehicle[] VehicleList = new Vehicle[20];
    int maxWeight = 30000;

    public int calcTotalWeight() {
        int total = 0;
        for (int i = 0; i < VehicleList.length; i++) {
            if (VehicleList[i] != null) {
                total = total + VehicleList[i].getWeight();
            }
        }
        return total;
        }

    public boolean addVehicle(Vehicle vehicle) {
        for (int i = 0; i < VehicleList.length; i++) {
            if (VehicleList[i] == null) {
                VehicleList[i] = vehicle;
                return true;
            }
        }
    return false;
    }


}
