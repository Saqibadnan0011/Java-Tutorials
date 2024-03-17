# Variables and DataTypes in Java Programming Language ☕

<li><p>Java have its own rules to write the code in java language, which is called syntax. And those rules just like any other programming language and simple English language (like Grammer and Vocabulary ). So Java have it's own Grammer and Vocabulary in shape of Variables and Datatypes.</p></li>

<h2>Variables</h2>

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

 public static void main(String args[]) {
   Test test = new Test();
   test.myAge();

```

```java

output

Saqib age is: 22

```














