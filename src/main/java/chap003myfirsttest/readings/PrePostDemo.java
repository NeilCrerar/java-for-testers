/*
User: user
Date: 08/08/2020
Prefix/postfix unary increment operator demonstration from Chapter 3 additional readings on operators
*/

package chap003myfirsttest.readings;

public class PrePostDemo {

    public static void main(String[] args) {

        int i = 3;
        i++;
        // prints 4
        System.out.println(i);

        ++i;
        // print 5
        System.out.println(i);

        //prints 6
        System.out.println(++i);

        // prints 6
        System.out.println(i++);

        // prints 7
        System.out.println(i);
    }
}
