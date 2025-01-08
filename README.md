# Java
Java

# Arrays

Methods:

Array.toString(): to convert in string format

Array.sort(): method doesn't allows to sort in descending order

# Scanner
is used/declared to take input from user at runtime.  eg: Scanner sc = new Scanner(System.in);

# OOPS
class -> variables & methods
methods -> variables
class name and constructor name should be same.

Method overloading is an example of polymorphism

Polymorphims means one thing with multiple forms.

Polymorphis: 4 rules (method overloading: Method/Constructor overloading)
1)	Method name should be same.
2)	Number of parameters should be different.
3)	Data type of parameters should be different
4)	Order of parameters should be different.


Encapsulation:
Wrapping up of data and methods into single unit/class. 
Getter and Setter.

The get method returns the variable value, and the set method sets the value.

Eg: 
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}

Encapsulation Rules:
1) All variables should be private.
2) For every variable there should be 2 methods(get & set).
3) Variables can be operated only through methods.

# this and static keyword
this Keyword - this keyword always represents class/object

2 types of variables
1) class varibles/instance variables
2) local variables

Static Keyword -  static keyword can be applied for variables & methods.

static variables
static methods

non-static variables
non-static methods


