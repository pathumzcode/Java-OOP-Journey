public class Main {
    public static void main(String[] args) {

        // Print an empty line for spacing
        System.out.println();

        // Create first Student object with name, age, and gender
        Student s1 = new Student("Pathum", 21, "Male");

        // Display details of Student s1
        System.out.println("s1 Details");
        System.out.println(s1.getName());   // Print s1's name
        System.out.println(s1.getAge());    // Print s1's age
        System.out.println(s1.getGender()); // Print s1's gender

        // Print an empty line for spacing
        System.out.println();

        // Create second Student object with name, age, and gender
        Student s2 = new Student("Kamala", 26, "Female");

        // Display details of Student s2
        System.out.println("s2 Details");
        System.out.println(s2.getName());   // Print s2's name
        System.out.println(s2.getAge());    // Print s2's age
        System.out.println(s2.getGender()); // Print s2's gender
    }
}
