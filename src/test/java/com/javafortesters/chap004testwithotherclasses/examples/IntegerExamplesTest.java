/*
User: user
Date: 07/08/2020
*/

package com.javafortesters.chap004testwithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerExamplesTest {

    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals("intValue returns 4", 4, four.intValue());

        // Integer constructor can also take a string value
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());

        // example of same as above but without the 'autoboxing' that the IDE is complaining about
        // here java automatically converts the primitive int to the Integer class
        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());
    }

    @Test
    public void intToHexConversion() {
        Integer first = 11;
        assertEquals("convert int 11 to hex b", "b", first.toHexString(first));

        Integer second = 10;
        assertEquals("intValue 10 converted to hex a", "a", second.toHexString(second));

        Integer third = 3;
        assertEquals("intValue 3 converted to hex 3", "3", third.toHexString(third));

        Integer fourth = 21;
        assertEquals("intValue 21 converted to hex 15", "15", fourth.toHexString(fourth));
    }

    @Test
    public void intMinAndMAxValues() {
        assertEquals("intMinValue is -2147483648", -2147483648, Integer.MIN_VALUE);

        assertEquals("intMaxValue equals 2147483647", 2147483647, Integer.MAX_VALUE);
    }

    @Test
    public void equalsIsNotAlwaysEquals() {

        // the following will equate to true and pass the tests
        assertEquals(4,4);
        assertTrue(4==4);

        Integer firstFour = 4;
        Integer secondFour = 4;
        // expect this to equate to true and pass the test as it is comparing the values assigned
        assertEquals(firstFour, secondFour);
        // this will not equate to true and so the test will fail

        assertTrue(firstFour == secondFour);
        // because they are separate integer objects, the == action is checking if they are the same instantiation,
        // which they are not

        // in comparisson, this version of that assertion will pass
        assertTrue(firstFour.equals(secondFour));

    }
}






