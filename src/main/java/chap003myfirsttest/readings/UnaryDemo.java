/*
User: user
Date: 08/08/2020
Unary Operators demonstration from Chapter 3 additional readings on operators

Operator    Description
-----------------------
  +         Unary plus operator; indicates positive value (numbers are positive without this, however)
  -         Unary minus operator; negates an expression
  ++        Increment operator; increments a value by 1
  --        Decrement operator; decrements a value by 1
  !         Logical complement operator; inverts the value of a boolean
*/

package chap003myfirsttest.readings;

public class UnaryDemo {
    public static void main(String[] args) {

        int result = +1;
        // result is now 1
        System.out.println("Result = " + result);

        result --;
        // result is now 0
        System.out.println("Result = " + result);

        result++;
        // result is now 1
        System.out.println("Result = " + result);

        result =-result;
        // result is now -1
        System.out.println("Result = " + result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }

}
