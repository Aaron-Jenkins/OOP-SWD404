public class Lorry extends Vehicle {

    public Lorry(int regNumIn, int weightIn) {
        super(regNumIn, weightIn);
    }

    @Override
    public double CalculateFee() {
        if (weight > 8000) {
            return 15.00;
        } else {
            return 10.00;
        }
    }
}
