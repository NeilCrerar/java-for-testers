/*
User: user
Date: 08/08/2020
Demo implementation of the Bicycle class from the chapter 3 additional readings on classes
*/

package chap003myfirsttest.readings;

public class BicycleDemo {
    public static void main(String[] args) {

        // Create two different bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on the two objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(30);
        bike2.printStates();
    }
}
