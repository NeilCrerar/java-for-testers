/*
User: user
Date: 08/08/2020
Comparison Operators demonstration from Chapter 3 additional readings on operators

Operator    Description
-----------------------
  ==        equal to
  !=        not equal to
  >         greater than
  >=        greater than or equal to
  <         less than
  <=        less than or equal to
*/

package chap003myfirsttest.readings;

public class ComparisonDemo {

    public static void main(String[] args) {

        int value1 = 1;
        int value2 = 2;

        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 >= value2)
            System.out.println("value1 >= value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
    }


}
