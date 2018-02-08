public class Heart {
    //Attributes
    private int BPM;
    private int restingRate;

    //Constructor
    public Heart(int restingRateIn) {
        restingRate = restingRateIn;
    }

    //Methods
    public boolean increaseBpm(int increaseRate) {
        if (BPM < restingRate+100) {
            BPM = BPM + increaseRate;
            return true;
        }
        return false;
    }

    public void rest() {
        BPM = restingRate;
    }

    public int getBPM() {
        return BPM;
    }
}

