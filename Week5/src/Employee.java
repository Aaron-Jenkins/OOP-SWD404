public class Employee {

    //Attributes
    protected String Name;
    protected int Salary;
    protected int ContractedHours;
    protected int HolidayEnt;

    //constructor
    public Employee(String name, int salary, int contractedHours, int holidayEnt) {
        Name = name;
        Salary = salary;
        ContractedHours = contractedHours;
        HolidayEnt = holidayEnt;
    }

    //Getters
    public String getName() {
        return Name;
    }

    public int getSalary() {
        return Salary;
    }

    public int getContractedHours() {
        return ContractedHours;
    }

    public int getHolidayEnt() {
        return HolidayEnt;
    }

    //Setters
    public void setSalary(int salary) {
        Salary = salary;
    }

    public void setContractedHours(int hours) {
        if (hours > 40) {
            System.out.println("Hours cannot exceed 40");
        }
        else {
            ContractedHours = hours;
        }
    }

    //Methods
    public void bookHoliday(int numDaysBooked) {
        HolidayEnt -= numDaysBooked;
    }
}
