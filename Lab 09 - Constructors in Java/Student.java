/**
 * Student
 */
public class Student {

    int roll, age;
    
    Student() { // parameterless constructor implementation
        roll = 5;
        age = 25;
    }

    Student (int x, int y) { // paramterized constructor implementation
        roll = x;
        age = y;
    }

    void display() {
        System.out.println("\nRoll no : " + roll + "\nAge : " + age);
    }

    public static void main(String[] args) {
        Student ob1 = new Student(); // instantiated with paramterless constructor
        ob1.display();
        Student ob2 = new Student(6, 21); // instantiated with parameterized constructor
        ob2.display();
    }
}