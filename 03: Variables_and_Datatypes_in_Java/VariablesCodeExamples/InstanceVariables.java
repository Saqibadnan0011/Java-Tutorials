package Variables;

public class InstanceVariables {
    // Instance variables declared within the class but outside the method
    // Instance have defaults values like
    // --boolean has false value
    // --default has 0 value
    // --object reference has null value
    private int count; //declared instance variable with name count and type int.

    // Within the class here we have 2 methods
    // 01: Increment() method
    // This method increments the value of count instance by 1.
    public void increments() {
        count++;
    }
    // 02: displayCount() method
    // This method print the output or increment value in count instance variable.
    public void displayCount() {
        System.out.println("This count is: " + count);
    }
    public static void main (String[] args) {
        // In this method, we declared 2 objects in main class.
        // Each object has its own copy of instance variable
        // we call increment() or displayCount() method to increment the value and display the output
        InstanceVariables obj0 = new InstanceVariables();
        InstanceVariables obj1 = new InstanceVariables();
        obj1.increments();
        obj1.displayCount();
        obj0.increments();
        obj0.displayCount();
    }
}
