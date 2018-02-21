public class AdminStaff extends Employee{

    private Manager manager;

    //Constructor
    public AdminStaff(String name, int salary, int contractedHours, int holidayEnt, Manager ManagerIn) {
        super(name, salary, contractedHours, holidayEnt);
        manager = ManagerIn;
    }

    @Override
    public void viewEmployeeDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Contracted Hours: " + getContractedHours());
        System.out.println("Holiday Entitlement: " + getHolidayEnt());
        System.out.println("Manager: " + manager.getName() + "\n");
    }

}
