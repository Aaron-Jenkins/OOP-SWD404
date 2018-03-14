public abstract class Vehicle {

    protected int regNum;
    protected int weight;

    public Vehicle(int regNumIn, int weightIn) {
        regNum = regNumIn;
        weight = weightIn;
    }

    public int getRegNum() {
        return regNum;
    }

    public int getWeight() {
        return weight;
    }

    public abstract double CalculateFee();


}
