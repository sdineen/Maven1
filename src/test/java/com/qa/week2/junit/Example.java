package com.qa.week2.junit;

import java.util.ArrayList;

import org.junit.Test;

public class Example {
    @Test
    public void method() {
       org.junit.Assert.assertTrue( new ArrayList().isEmpty() );
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void outOfBounds() {
       new ArrayList<Object>().get(1);
    }
 }