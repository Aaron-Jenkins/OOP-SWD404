public class Table {

    //Attributes
    private int tableNum;
    private int numSeats;
    private boolean Outside;
    private Staff staff;
    private Booking booking;

    //Constructor

    public Table(int tableNum, int numSeats, boolean outside) {
        this.tableNum = tableNum;
        this.numSeats = numSeats;
        Outside = outside;
    }

    //Methods
    public void allocStaff( Staff staff) {
        this.staff = staff;
    }

    public void clearBooking(Booking bookingIn) {
        booking = null;
    }
    public void bookTable(Table table, Booking bookingIn) {
        if (table.numSeats <= bookingIn.getNumGuests()) {
            System.out.println("Test");
            if (bookingIn.isOutside()) {
                table.booking = bookingIn;
                System.out.println("Booking: " + table.booking.getName());
            }
        }
        //else
        //System.out.println("unsucessful");
    }
    //Getter Methods
    public int getTableNum() {
        return tableNum;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public boolean isOutside() {
        return Outside;
    }

    public Staff getStaff() {
        return staff;
    }

    public Booking getBooking() {
        return booking;
    }
}

