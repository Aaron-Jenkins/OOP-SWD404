public class Carr extends Vehicle {

    public Carr(int regNumIn, int weightIn) {
        super(regNumIn, weightIn);
    }

    @Override
    public double CalculateFee() {
        if (weight > 1590) {
            return (weight - 1590) / 10 + 5.00;
        } else {
            return 5.00;
        }
    }
}
