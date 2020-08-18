/*
User: user
Date: 15/06/2020
*/

package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Test class to show runs from IDE but not maven cmd line as Test" is in the middle of the class name
public class NameTestClass {

    @Test
    public void canAddTwoNumbersTogether(){
        int answer = 1+20;
        assertEquals("1+20=21", 21, answer);
    }
}