public class Main {
    public static void main(String[] args) {

        // Create a new Student object called s1
        // This allows us to access the Student class methods (setters, getters, calcTotalMarks)
        Student s1 = new Student();

        // Calling the calcTotalMarks() method with three subject marks
        // The method will return the sum of 56, 46, and 87
        // The returned result is stored inside the variable 'totalMarks'
        int totalMarks = s1.calcTotalMarks(56, 46, 87);

        // Set the student's name using the setter method
        s1.setName("Pathum");

        // Set the student's age using the setter method
        s1.setAge(21);

        // Print the student's name using the getter method
        System.out.println("Name : " + s1.getName());

        // Print the student's age using the getter method
        System.out.println("Age : " + s1.getAge());

        // Print the total marks calculated by calcTotalMarks()
        System.out.println("Total Marks : " + totalMarks);
    }
}
