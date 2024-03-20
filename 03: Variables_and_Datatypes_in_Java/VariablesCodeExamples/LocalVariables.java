package Variables;

public class LocalVariables {
    // Local Variable is accessible only within the method
    // or block in which it is declared.

    // Syntax of local variable
    // methodName() {
    // <DataType> localVariableName;
    // }
    public void javaProgramming() {
        double age = 0;
        age = age + 28.7;
        System.out.println("Age of Java Programming: " + age);
    }
    public static void main(String[] args) {
        LocalVariables s = new LocalVariables();
        s.javaProgramming();
    }


public static class LocalVariables2 {
        public static void main(String [] args) {
            // Initialize the i for outside value
            int i;
            // Local variables using for loop
            for (i = 0; i < 10; i++) {
                System.out.println("The value of i is: " + i);
            }
            System.out.println("Outside value of i: " + i);
        }
    }
}


