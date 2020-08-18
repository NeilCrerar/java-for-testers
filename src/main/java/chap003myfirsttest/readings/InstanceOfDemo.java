/*
User: user
Date: 08/08/2020
Type Comparison Operators demonstration from Chapter 3 additional readings on operators
The instanceof operator compares an object to a specified type.
You can use it to test if an object is an instance of a class, an instance of a subclass, or an instance
of a class that implements a particular interface.
*/

package chap003myfirsttest.readings;

public class InstanceOfDemo {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instanceof Parent: "
                + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
                + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
                + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
                + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));
    }
}

class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}

