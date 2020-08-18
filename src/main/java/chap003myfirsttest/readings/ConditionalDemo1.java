/*
User: user
Date: 08/08/2020
Conditional Operators demonstration from Chapter 3 additional readings on operators

Operator    Description
-----------------------
  &&        Conditional-AND
  ||        Conditional-OR
  ?         shorthand for an if-then-else statement
*/

package chap003myfirsttest.readings;

public class ConditionalDemo1 {
    public static void main(String[] args){

        int value1 = 1;
        int value2 = 2;

        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");

        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");

        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;
        System.out.println(result);
    }
}
