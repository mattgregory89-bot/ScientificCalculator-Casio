package com.zipcodewilmington.scientificcalculator;
public class Arithmetic {

    //fields
    private double result; 

    //constructor
    //Sets the starting value for the calculation.
    public Arithmetic(double initialValue) {
        this.result = initialValue; 
    }

    //methods

    //addtion
    public Arithmetic add(double num) {
        this.result = this.result + num;
        return this; // returns the object itself, enabling chaining like add(5).multiply(2)
    }

    //subtraction
    public Arithmetic subtract(double num) {
        this.result = this.result - num;
        return this;
    }

    //multiplication
    public Arithmetic multiply(double num) {
        this.result = this.result * num;
        return this;
    }

    //division
    public Arithmetic divide(double num) {
        if (num == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        this.result = this.result / num;
        return this;
    }

    //square root, tehcnically redunant but it's functional. 
    
    public Arithmetic squareRoot(double num) {
        this.result = Math.sqrt(num);
        return this;
    }
    

    //power
    public Arithmetic power(double num) {
        this.result = Math.pow(this.result, num);
        return this;
    }

    //modulo
    public Arithmetic modulo(double num) {
        this.result = this.result % num;
        return this;
    }

    public Arithmetic sine() {
        this.result = Math.sin(this.result);
        return this;

    }

    public Arithmetic cosine() {
        this.result = Math.cos(this.result);
        return this;

    }

    public Arithmetic tangent() {
        this.result = Math.tan(this.result);
        return this;

    }

    // public Arithmetic cosecant(double num) {
    //     this.result = Math.cos(this.result);
    //     return this;

    // }

    // public Arithmetic secant(double num) {
        
    // }

    // public Arithmetic cotangent(double num) {
        
    // }



    //getResult() - will retrieve the final value after chaining
    public double getResult() {
        return this.result;
    }

}




