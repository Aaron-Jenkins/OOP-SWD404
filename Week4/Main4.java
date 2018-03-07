// This is the main program - Add and remove Cars in carpark.

import java.util.Scanner;

public class Main4 {


    public static void main(String[] args) {
        //Create new carA
        Car ford = new Car("A1");
        //Create Carpark
        Carpark carpark = new Carpark();


        char quit = 'n';
        while (quit != 'y') {
            System.out.println("Please select one of the following options:");
            System.out.println(" A - Add a car\n B - Remove a car\n C - View number of free spaces\n D - Quit");
            Scanner in = new Scanner(System.in);
            String option = in.nextLine();
            if(option.equals("A")) {
                System.out.println("Please enter reg number:");
                String reg = in.nextLine();
                carpark.addCar(reg);
            }
            else if (option.equals("B")) {
                System.out.println("Please enter reg number");
                String reg = in.nextLine();
                carpark.removeCar(reg);
            }
            else if (option.equals("C")) {
                System.out.println("There are " + carpark.viewSpaces() + " cars in the car park");
                System.out.println("There are " + (15-carpark.viewSpaces()) + " free spaces");
            }
            else if (option.equals("D")) {
                quit = 'y';
            }
            else {
                System.out.println("Invalid input, try again!");
            }
        }

    }
}
