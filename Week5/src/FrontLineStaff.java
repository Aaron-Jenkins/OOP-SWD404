public class FrontLineStaff extends Employee {

    //constructor
    public FrontLineStaff(String name, int salary, int contractedHours, int holidayEnt) {
        super(name, salary, contractedHours, holidayEnt);
    }

    //View Details
    public void viewEmployeeDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + (getSalary() * ContractedHours));
        System.out.println("Contracted Hours: " + getContractedHours());
        System.out.println("Holiday Entitlement: " + getHolidayEnt() + "\n");
    }

}
