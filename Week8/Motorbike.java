public class Motorbike extends Vehicle {

    public Motorbike(int regNumIn, int weightIn)
    {
        super(regNumIn, weightIn);
    }

    @Override
    public double CalculateFee() {
        return 3.00;
    }



}
