public class Booking {
    //Attributes
    private String Name;
    private int numGuests;
    private boolean Outside;

    //Constructor
    public Booking(String name, int numGuests, boolean outside) {
        Name = name;
        this.numGuests = numGuests;
        Outside = outside;
    }

    //Getter methods
    public String getName() {
        return Name;
    }

    public int getNumGuests() {
        return numGuests;
    }

    public boolean isOutside() {
        return Outside;
    }
}
