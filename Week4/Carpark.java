// Define carpark object to store Cars

public class Carpark {
    //Attributes
    private Car[] cars;

    //Constructor
    public Carpark () {
        this.cars = new Car[15];
    }

    //add Car
    public boolean addCar (String regPlateIn) {
        for (int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                Car newCar = new Car(regPlateIn);
                cars[i] = newCar;
                return true;
            }
        }
    return false;
    }

    //remove Car from car park
    public boolean removeCar (String regPlateIn) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                if (cars[i].getRegPlate().equals(regPlateIn)) {
                    cars[i] = null;
                    return true;
                }
            }
        }
    return false;
    }

    //Calculate number of cars in carpark and as a result number of free spaces
    public int viewSpaces() {
        int carCount = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                carCount++;
            }
        }
        return carCount;
    }

}
