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
public class Car {
    //Attributes
    private int currentSpeed;
    private int maxSpeed;
    private int fuelLevel;

    //Constructors
    public Car()
    {
        currentSpeed = 0;
        maxSpeed = 150;
        fuelLevel = 100;
    }
    public Car(int currentSpeedIn, int maxSpeedIn, int fuelLevelIn)
    {
        currentSpeed = currentSpeedIn;
        maxSpeed = maxSpeedIn;
        fuelLevel = fuelLevelIn;
    }

    //Getter Methods
    public int getCurrentSpeed()
    {
        return currentSpeed;
    }
    public int getMaxSpeed()
    {
        return maxSpeed;
    }
    public int getFuelLevel()
    {
        return fuelLevel;
    }

    //Setter Methods
    public void setCurrentSpeed(int currentSpeedIn)
    {
        currentSpeed = currentSpeedIn;
    }
    public void setMaxSpeed(int maxSpeedIn)
    {
        maxSpeed = maxSpeedIn;
    }
    public void setFuelLevel(int fuelLevelIn)
    {
        fuelLevel = fuelLevelIn;
    }

    //methods
    public void accelerate(int n)
    {
        if (currentSpeed + n < maxSpeed) {
            currentSpeed += n;
            fuelLevel--;
        }

    }
    public void brake(int n)
    {
        if (currentSpeed - n >= 0) {
            currentSpeed -= n;
        }
    }
    public void refuel()
    {
        fuelLevel = 100;
    }
}
