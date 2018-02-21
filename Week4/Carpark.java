// Define carpark object to store Cars

public class Carpark {
    //Attributes
    private Car[] cars;
    private int name;


    //Constructor
    public Carpark () {
        this.cars = new Car[15];
    }

    //add Car
    public void addCar (String regPlateIn) {
        for (int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                Car newCar = new Car(regPlateIn);
                cars[i] = newCar;
                break;
            }
        }
    }

    //remove Car from car park
    public void removeCar (String regPlateIn) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                if (cars[i].getRegPlate().equals(regPlateIn)) {
                    cars[i] = null;
                    System.out.println("Car Removed");
                }
            }
        }
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
