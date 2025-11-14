public class Main {
    public static void main(String[] args) {

        // Create a new Student object called s1
        Student s1 = new Student();

        int totalMarks = s1.calcTotalMarks(56,46,87);
      

        // Set values for the student's name and age
        s1.setName("Pathum");
        s1.setAge(21);

        // Print the student's name to the console
        System.out.println("Name : " +s1.getName());

        // Print the student's age to the console
        System.out.println("Age : " +s1.getAge());

        System.out.println("Total Marks : " +totalMarks);

    }
}
