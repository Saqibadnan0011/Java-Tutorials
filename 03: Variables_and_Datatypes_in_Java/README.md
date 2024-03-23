# Variables and DataTypes in Java Programming Language ☕

<li><p>Java have its own rules to write the code in java language, which is called syntax. And those rules just like any other programming language and simple English language (like Grammer and Vocabulary ). So Java have it's own Grammer and Vocabulary in shape of Variables and Datatypes.</p></li>

<h1>Variables ↗️</h1>

<ul>
  <li><p>In Java variable must be declared before using it.</p></li>
  <li><p>Every variable in java assigned a data type</p></li>
  <li><p>The value stored in variable can be changed when program start executing.</p></li>
</ul>

<h2>Initialize the Variables in Java?</h2>

<ul>
  <li><p><strong>Datatypes:</strong> Any type of data can be stored in this datatype.</p></li>
  <li><p><strong>Variable_name:</strong> Name give to the specific variable.</p></li>
  <li><p><strong>Value:</strong> This is initial value which stored in variables.</p></li>
</ul>

<img width="746" alt="Screenshot 2024-03-17 at 3 30 08 PM" src="https://github.com/Saqibadnan0011/Java-Tutorials/assets/79377722/be32bba2-692e-4337-8b2c-7740ff7e41d2">

<h2>Types of Variables in Java</h2>

```java

01: Local Variables
02: Instance Variables
03: Static Variables

```

<h3>01: Local Variables:</h3>

<ul>
  <li>
    <p>Local Variables are declared in 
    <mark style = "background-color: green; color: white;"> methods</mark>
      <mark style= "background-color: green; color: white;">, Constructions</mark>
      <mark style= "background-color: green; color: white;"> or blocks.</mark>
    </p>
  </li>
  <li><p>There is no default value for local variables, before using the local variable we need to initialize and declared the value and it should be assigned.</p></li>
</ul>

```java

Initialize the value first before working on local variables

public class Test {
  public void myAge() {
    int age = 0;
    age = age + 22;
    System.out.println("Saqib age is : " + age);
  }

 public static void main(String[] args) {
   Test test = new Test();
   test.myAge();
  }
}

```

```java

output:

Saqib age is: 22

```

<h3>02: Instance Variables:</h3>

<ul>
  <li><p>Instance variable are declared in a class, but outside a method, constructor or any block.</p></li>
  <li><p>Access modifiers can be give for instance variables.</p></li>
</ul>

```java

public class Employee {
  public String name;

  //salary variables is visible in employee class
  private double salary;

  //name assigned in constructor
  public Employee(String employeeName) {
    name = employeeName;
  }

  //Salary is assigned a value
  public void setSalary(double employeeSalary) {
    salary = employeeSalay;
  }

  //Method for printing the employee details
  public void printEmployee() {
    System.out.println("Employee Name : " + name);
    System.out.println("Employee Salary: " + salary);
  }

  //main
  public static void main(Stirng[] args) {
    Employee employeeOne = new Employee("Saqib");
    employeeOne.setSalary(50000);
    employeeOne.printEmployee();

```

```java

output:

Employee Name : Saqib Adnan
Employee Salary : 50000.0

```

<h3>03: Static Variables:</h3>

<ul>
  <li><p>Class variables also known as static variables are declared with the static keywords in a class, but outside the  method, contructor or block.</p></li>
  <li><p>Static variables are rarely used other than being declared as constants.</p></li>
  <li><p>Static variables stored in staic memory. It is rare to use static variables rather than declaring the final and used public and private constants.</p></li>
</ul>

```java

public class Employee {

  //declare salary variable in private static variable
  private static double salary;

  //Domain in constants
  public static final String DOMAIN = "Java Developer ";

  //Main
  public static void main(String[] args) {
  salary = 130000;
  System.out.println(DOMAIN + "average salary:" + salary);
  
  }
}

```
```java

output:

iOS Developer average salary: 130000

```

<p>You can see different code examples related to variables in Java in attached file.</p>

<h1>Data Types ↗️</h1>

<p>Data types in Java are following two categories</p>

<ul>
  <li>Primitive Data Types</li>
  <li>Non-Primitive Data Types</li>
</ul>

<h3>Primitive Data Types</h3>

<li>Java supports 8 primitive data types and in Java variables must be declared before using the data types.</li>

<img width="1004" alt="Screenshot 2024-03-18 at 12 03 49 AM" src="https://github.com/Saqibadnan0011/Java-Tutorials/assets/79377722/0f6f6f03-0b27-46ee-84d1-05027363c278">

<h3>01: Boolean DataType</h3>


```java

syntax:

boolean variable_name = value (true,false);

```

```java

public class BooleanData {
  public static void main (String[] args) {

   // b1 and b2 initialize the same value
    Boolean b1 = new Boolean(false);
    Boolean b2 = new Boolean(false);

  // So, if the equal method, value get the same execuation this will print the output ( is equal) otherwise ( isn't equal)

  if (b1.equal(b2)) {
     System.out.println("b1 is equal to b2");
  } else {
     System.out.println("b1 is not equal to b2");
      }
   }
}

```

```java

output:

b1 is equal to b2

```

<h3>02: Char DataType</h3>

```java

syntax:

char variable_name = 'variable_value';

```

```java

public class charData {
  public static void main (String[] args) {

    // Since ASCII value for the A and C are 65 and 67
    char c1, c2, c3;
    c1 = 65;
    c2 = 'B';
    c3 = 67;
    System.out,println("Character are: " + c1 + c2 + c3);

   }
}

```

```java

output:

Character are: ABC

```

<h3>03: Integer DataType</h3>

```java

syntax:

int number = [numbericalValue];

```

```java

public class charData {
  public static void main (String[] args) {
     int min = -2147483648;
     int max = 2147483647;
     System.out.println("min value of integer is: " + min);
     System.out.println("max value of integer is: " + max);

   }
}

```

```java

output:

min value of integer is: -2147483648
max value of integer is: 2147483647


```

<h3>04: Short DataType</h3>

```java

syntax:

short variable_name = value;

```

```java

public class charData {
  public static void main (String[] args) {

     short a = -32768;
     short b = 32767;
     System.out.println("a: " + a);
     System.out.println("b: " + b);

   }
}

```

```java

output:

a: -32768
b: 32767

```

<h3>Non-Primitive Data Types</h3>

<p>Non-Primitive data types are not predefined in java. We can add them manually and non-primitive data types are also called "Reference Variables" or "Object Reference"</p>

<ul>
  <li>String Data Type</li>
  <li>Array Data Type</li>
  <li>Classes Data Type</li>
</ul>

<p>You can see different code examples related to variables in Java in attached file.</p>


<h1>Java CheatSheet <a href = "https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-1/UltimateJavaCheatSheet.pdf">Click To See</a></h1>









