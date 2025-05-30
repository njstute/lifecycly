package com.northgrum.beavercreek.devsecops;

import java.util.logging.Logger;

public class Calculator {

    /**
     * This is a simple calculator class that performs basic arithmetic operations.
     * 
     * @author Your Name
     * @version 1.0
     */

    private static final Logger logger = Logger.getLogger(Calculator.class.getName());


    public Calculator() {
        // Constructor
        logger.info("This is an INFO message");
    }    
    
    /**
     * This method adds two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */   
    public int add(int a, int b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }   

    /**
     * This method multiplies two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * This method divides two integers and returns the result.
     *
     * @param a the numerator
     * @param b the denominator
     * @return the quotient of a and b
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}