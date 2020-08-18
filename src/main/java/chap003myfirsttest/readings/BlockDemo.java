/*
User: user
Date: 08/08/2020
Demo of code blocks taken from the chapter 3 additional readings on expressions
*/

package chap003myfirsttest.readings;

public class BlockDemo {
    public static void main(String[] args) {
        boolean condition = true;
        if (condition) { //begin block 1
            System.out.println("Condition is true");
        } else { //begin block 2
            System.out.println("Condition is false");
        }
    }
}
