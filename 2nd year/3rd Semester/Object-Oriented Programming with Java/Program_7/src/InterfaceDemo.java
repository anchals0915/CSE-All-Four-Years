package Interfaces;

/* Interfaces */

// 1.   What is an interface?
// 2.   Multiple Inheritance which not allowed by the way   vs	Interfaces
// 3.   Example of Interface
// 4.   Do's and Dont's for Interface

// Purpose of abstract Class :  is to achieve polymorphism and inheritance


/*
In Java, 
    an interface is a blueprint for a class that defines a set of public methods that a class implementing the interface must implement. 

    An interface provides a way to achieve abstraction in Java by defining a set of methods without specifying their implementation.

An interface is defined using the interface keyword, 
    followed by the interface name and a set of method signatures (without the method bodies) separated by semicolons. 

For example, consider the following interface:
public interface Animal 
{
    public void makeSound();
    public void move();
}

This interface defines two methods: makeSound() and move(). 
Any class that implements the Animal interface must provide an implementation for these methods.

To implement an interface, 
    a class must use the implements keyword followed by the interface name. 

For example, consider the following class that implements the Animal interface:
public class Dog implements Animal 
{
    public void makeSound() 
    {
        System.out.println("Bark!");
    }
    
    public void move() 
    {
        System.out.println("Running on four legs");
    }
}

This class provides an implementation for the makeSound() and move() methods, as required by the Animal interface.

One of the main benefits of interfaces in Java is that they allow for polymorphism. 
Because a class can implement multiple interfaces, 
    objects of that class can be treated as instances of any of the interfaces they implement. 
This allows for greater flexibility and reusability in your code.

Overall, interfaces are an important part of the Java programming language and are used extensively in many 
Java applications and frameworks to achieve abstraction, polymorphism, and code reuse.
*/


/*
abstract class Test1 {
	abstract public void meth1();
    abstract public void meth2();
}

class Test2 extends Test1   {
    public void meth1() {
    
    }
    public void meth2() {

    }
}

class AbstractClassDemo	{
	public static void main(String[] args) {
		Test1 t = new Test2();
    }
}
*/

interface Test1	{
	void meth1();
    void meth2();
}

// The type Test2 must implement the inherited abstract method
class Test2 implements Test1    //interface are implemented 
{
    public void meth1() 
    {
    	System.out.println("Meth 1 of class Test2 ");
    }
    public void meth2() 
    {
    	System.out.println("Meth 2 of class Test2 ");
    }
    public void meth3() 
    {
    	System.out.println("Meth 3 of class Test2 ");
    }
}


public class InterfaceDemo 
{
	public static void main(String[] args) 
    {
		Test1 t;
        // t = new Test1();//    Cannot instantiate the type Test1 since it is interface 
        t = new Test2();
        t.meth1();
        t.meth2();    
    }  
}
// Purpose of Interface : to ment for runtime polymorphism 

/*
    Interface 

    Phone          Camera          Music Player 
      ^             ^                   ^
      |             |                   |
      |_____________|___________________|
                    |
                SmartPhone
SmartPhone is a Phone having features of Camera and Music Player


 */

//  Important :
//  Interface methods must be implemented as public. 
//Because, interface methods are public by default and 
//you should not reduce the visibility of any methods while overriding.



