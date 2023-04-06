package com.unitTest.services;import org.junit.After;import org.junit.Assert;import org.junit.Before;import org.junit.Test;import static org.junit.Assert.*;public class CalculatorTest {    @Before    public void welcomePrint() {        System.out.println("Welcome in Method Execution Started");    }    @After    public void fairwellPrint() {        System.out.println("Thank You !! Execution ended !!");    }    @Test    public void addTwoNumbers() {        System.out.println("Test case for Addition Started");        int actualvalue = Calculator.addTwoNumbers(25, 25);        int expectedvalue = 50;        Assert.assertEquals(actualvalue, expectedvalue);    }    @Test    public void subTwoNumbers() {        System.out.println("Test case for Substraction Started");        int actualResult = Calculator.subTwoNumbers(50, 25);        int expectedResult = 25;        Assert.assertEquals(actualResult, expectedResult);    }    @Test    public void mulTwoNumbers() {        System.out.println("Test case for Multiplication Started");        int actualResult = Calculator.mulTwoNumbers(25, 10);        int expectedResult = 250;        Assert.assertEquals(actualResult, expectedResult);    }    @Test    public void divTwoNumbers() {        System.out.println("Test case for Division Started");        int actualResult = Calculator.divTwoNumbers(100, 2);        int expectedResult = 50;        Assert.assertEquals(actualResult, expectedResult);    }}