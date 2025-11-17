public class Student {

    // Private attributes (encapsulated properties)
    private String Name;   // Stores student's name
    private int Age;       // Stores student's age
    private String Gender; // Stores student's gender

    // Constructor to initialize Student objects
    public Student(String name, int age, String gender) {
        this.Name = name;     // Assign name to the Name attribute
        this.Age = age;       // Assign age to the Age attribute
        this.Gender = gender; // Assign gender to the Gender attribute
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
}
