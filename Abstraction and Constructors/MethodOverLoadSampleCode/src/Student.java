public class Student {

    // Instance variable to store the student's name
    private String Name;

    // Instance variable to store the student's age
    private int Age;

    // Setter method to assign a value to the Name variable
    public void setName(String name){
        this.Name = name;   // 'this' refers to the current object's Name
    }

    // Setter method to assign a value to the Age variable
    public void setAge(int age){
        this.Age = age;     // 'this' refers to the current object's Age
    }

    // Getter method to return the value of Name
    public String getName(){
        return Name;
    }

    // Getter method to return the value of Age
    public int getAge(){
        return Age;
    }

    public int calcTotalMarks(int m1, int m2){
        return m1 + m2;
    }

    public int calcTotalMarks(int m1, int m2, int m3){
        return m1 + m2 + m3;
    }

}
