package Variables;

// Initializing the static variables isn't mandatory
// Value can be assigned either during declaration or with the constructor.
// static variables store in static memories
// static variables default value
// boolean has default value
// String has null value
// numbers hase 0 value
// object reference has null value
public class StaticVariables {
    public class Department {
        public static int numberOfWorker = 0; // Static variables
        public String name;

        public Department (String name) {
            this.name = name;
            numberOfWorker++;
        } // Static method
    }
    public void main(String[] args) {
        Department dprtment1 = new Department("Admin");
        System.out.println(Department.numberOfWorker);
        Department department2 = new Department("Software Engineer");
        System.out.println(Department.numberOfWorker);
    }
}

// When variable is declared as static, single copy of the variable
// is created and shared among all objects at a class level.