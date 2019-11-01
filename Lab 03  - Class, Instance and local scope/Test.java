// Program to analyse class, instance and local variables
public class Test {
    static int count = 10; // static variable (owned by class)
    int objCount = 20; // instance variable (owned by object)

    public void increaseCount() {
        count += 10;
        objCount += 20;
    }

    public void showCount() {
        System.out.println("Class count : " + count);
        System.out.println("Instance count : " + objCount);
    }

    public void localCount() {
        int locCount = 10; // local variable (owned by method only, not accessible to class or object)
        System.out.println("Local count : " + locCount);
    }

    public static void main(String args[]) {

        System.out.println("For object A:");
        System.out.println("=============");
        // Creating first object
        Test ob1 = new Test();
        ob1.increaseCount(); // Increases the class count
        ob1.showCount();    // Increases the object count
        ob1.localCount();  // Accessing variables in local scope

        System.out.println("\nFor object B:");
        System.out.println("=============");
        Test ob2 = new Test();
        ob2.increaseCount(); // Class count increases from the previous increment
        ob2.showCount(); // Object count increases from the new Object
        ob2.localCount();
        
        System.out.println("\nFor object C:");
        System.out.println("=============");
        // Same happens with the new object
        Test ob3 = new Test();
        ob3.increaseCount();
        ob3.showCount();
        ob3.localCount();
    }
}
