/*
User: user
Date: 15/06/2020
*/

package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Test class to show runs from IDE and maven cmd line as Test" is at end of the class name
public class NameClassTest {

    @Test
    public void canAddTwoNUmbersTogether(){
        int answer = 7+5;
        assertEquals("7+5=12", 12, answer);
    }
}
