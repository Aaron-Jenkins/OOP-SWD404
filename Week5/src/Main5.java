public class Main5 {


    public static void main(String[] args) {
        //Create Objects
        Employee newEmployee = new Employee("Aaron", 19, 37, 25);
        FrontLineStaff newFrontLineStaff = new FrontLineStaff("James", 10, 40, 20);
        Manager newManager = new Manager("Boss", 75, 35, 30, 5);
        AdminStaff newAdminStaff = new AdminStaff("Joe", 15, 40, 25, newManager);

        newEmployee.viewEmployeeDetails();;
        newFrontLineStaff.viewEmployeeDetails();
        newManager.viewEmployeeDetails();
        newAdminStaff.viewEmployeeDetails();

    }
}
