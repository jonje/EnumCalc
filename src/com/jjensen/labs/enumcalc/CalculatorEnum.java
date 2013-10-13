package com.jjensen.labs.enumcalc;

/**
 * Created with IntelliJ IDEA.
 * User: jjensen
 * Date: 10/12/13
 * Time: 7:26 PM
 */

public enum CalculatorEnum {

    ADD {
        @Override
        public double calculate(double num1, double num2) {
            return num1 + num2;
        }
    },

    SUBTRACT {
        @Override
        public double calculate(double num1, double num2) {
              return num1 - num2;
        }
    },

    MULTIPLY {
        @Override
        public double calculate(double num1, double num2) {
            return num1 * num2;
        }
    },

    DIVIDE {
        @Override
        public double calculate(double num1, double num2) {
            return num1 / num2;
        }
    };

    public abstract double calculate(double num1, double num2);
}
