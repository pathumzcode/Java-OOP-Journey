// Student class represents a student with basic details
public class Student {

    // Private attributes (encapsulation)
    private String Name;
    private int Age;
    private String Gender;

    // Default constructor – initializes the object with preset values
    public Student() {
        this.Name = "Pathum";   // Default name
        this.Age = 21;          // Default age
        this.Gender = "Male";   // Default gender
    }

    // Getter method to return the student's name
    public String getName() {
        return Name;
    }

    // Getter method to return the student's age
    public int getAge() {
        return Age;
    }

    // Getter method to return the student's gender
    public String getGender() {
        return Gender;
    }

    // Setter method to update the student's name
    public void setName(String name) {
        Name = name;
    }
}
