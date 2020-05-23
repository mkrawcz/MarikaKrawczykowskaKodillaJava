package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {


            System.out.println("Test - Calculator");

            Calculator calculator = new Calculator();

            int addResult = calculator.add(260, 543);

            if (addResult == 803){
                System.out.println("Add result - ok");
            } else {
                System.out.println("Add - error");
            }

            int substractResult = calculator.substract(534, 213);

            if (substractResult == 321){
                System.out.println("Substract result - ok");
            } else {
                System.out.println("Substract - error");
            }






    }
}
