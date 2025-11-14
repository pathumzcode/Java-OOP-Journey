public class Main {
    public static void main(String[] args) {

        // Create a new Student object called s1
        Student s1 = new Student();

        // Call the calcTotalMarks() method and store the result in totalMarks
        // Passing three subject marks: 56, 46, and 87
        int totalMarks = s1.calcTotalMarks(56, 46, 87);

        // Set the student's name
        s1.setName("Pathum");

        // Set the student's age
        s1.setAge(21);

        // Print the student's name to the console
        System.out.println("Name : " + s1.getName());

        // Print the student's age to the console
        System.out.println("Age : " + s1.getAge());

        // Print the total marks returned by calcTotalMarks()
        System.out.println("Total Marks : " + totalMarks);
    }
}
