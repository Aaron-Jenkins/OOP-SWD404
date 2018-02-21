public class Manager extends Employee {

    private int Bonus;

    //Constructor
    public Manager (String name, int salary, int contractedHours, int holidayEnt, int BonusIn) {
        super(name, salary, contractedHours, holidayEnt);
        Bonus = BonusIn;
    }

    //View Details
    public void viewEmployeeDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + (getSalary() + Bonus)); // Change to percentage
        System.out.println("Contracted Hours: " + getContractedHours());
        System.out.println("Holiday Entitlement: " + getHolidayEnt());
        System.out.println("Bonus: " + Bonus + "\n");
    }

    //calculate bonus - (Salary / 100) * Bonus
    //public float calcBonus

    //Setters
    public void setBonus(int bonus) {
        if (bonus > 0 && bonus <= 100) {
            Bonus = bonus;
        }
        else {
            System.out.println("Invalid input");
        }

    }
}
