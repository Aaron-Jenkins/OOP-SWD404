/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author 3JENKA17
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create new car objects
        Car car1 = new Car();
        Car car2 = new Car(0, 175, 75);

        //set car1 attributes
        car1.setCurrentSpeed(100);
        car1.setMaxSpeed(100);
        car1.setFuelLevel(100);
        /* set car2 attributes
        car2.setCurrentSpeed(50);
        car2.setMaxSpeed(175);
        car2.setFuelLevel(75);
        */

        //print details for car1
        System.out.println("--------Car1--------");
        System.out.println("Current Speed: \t" + car1.getCurrentSpeed());
        System.out.println("Max Speed: \t" + car1.getMaxSpeed());
        System.out.println("Fuel Level: \t" + car1.getFuelLevel());

        //print details for car2
        System.out.println("--------Car2--------");
        System.out.println("Current Speed: \t" + car2.getCurrentSpeed());
        System.out.println("Max Speed: \t" + car2.getMaxSpeed());
        System.out.println("Fuel Level: \t" + car2.getFuelLevel() + "\n");


        //Test Car1 Methods
        car1.accelerate(5); // increment speed, decrement fuel

        //Test Car2 Methods
        car2.brake(5); //decrement speed

        //print details for car1
        System.out.println("--------Car1--------");
        System.out.println("Current Speed: \t" + car1.getCurrentSpeed());
        System.out.println("Max Speed: \t" + car1.getMaxSpeed());
        System.out.println("Fuel Level: \t" + car1.getFuelLevel());

        //print details for car2
        System.out.println("--------Car2--------");
        System.out.println("Current Speed: \t" + car2.getCurrentSpeed());
        System.out.println("Max Speed: \t" + car2.getMaxSpeed());
        System.out.println("Fuel Level: \t" + car2.getFuelLevel());
    }

}


