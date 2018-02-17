public class Passenger {

    //Attributes
    private int Age;
    private String Name;
    private int ID;

    //Constructor
    public Passenger(int age, String name, int ID) {
        Age = age;
        Name = name;
        this.ID = ID;
    }


    //getter
    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }


}
