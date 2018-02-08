public class Week2 {

    public static void main(String[] args) {

    //Create Tables
        Table table1 = new Table(1, 4, true);
        Table table2 = new Table(2, 2, true );

    //Create Bookings
        Booking booking1 = new Booking("Aaron", 2, true){};
        Booking booking2 = new Booking("Dan", 4, false);
        Booking booking3 = new Booking("James", 2, false);
        Booking booking4 = new Booking("Kevin", 3, true);

    //Create Staff.getName()
        Staff waiter1 = new Staff("Sarah");
        Staff waiter2 = new Staff("Kevin");

    //Allocate staff to table
        table1.allocStaff(table1, waiter1);
        table2.allocStaff(table2, waiter2);

    //Book Tables
        table1.bookTable(table1, booking1);


    //print Table1 details
    System.out.println("Table number: " + table1.getTableNum());
    System.out.println("Capacity: " + table1.getNumSeats());
    System.out.println("Outside: " + table1.isOutside());
    System.out.println("Staff: " + table1.getStaff().getName());
    System.out.println("Booking: " + table1.booking.getName());
    }
}
