// Main class
public class Main {
    public static void main(String[] args) {

        // Create first Student object using default constructor
        Student s1 = new Student();

        // Print default details of s1
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getGender());

        // Create second Student object
        Student s2 = new Student();
        System.out.println(); // Just prints an empty line for separation

        // Change the name of s2 using setter
        s2.setName("Lakshan");

        // Print details of s2 (only the name is changed)
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getGender());
    }
}
