/*
User: user
Date: 15/06/2020
*/

package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Test class to show runs from IDE but not maven cmd line as doesn't have "Test" at start/emd of class name
public class NameClass {

    @Test
    public void canAddTwoNUmbersTogether(){
        int answer = 7+5;
        assertEquals("7+5=12", 12, answer);
    }
}
