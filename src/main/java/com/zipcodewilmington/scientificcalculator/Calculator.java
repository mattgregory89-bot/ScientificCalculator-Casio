package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    private double currentValue;
    private double memory;

    public Calculator() {
        this.currentValue = 0;
        this.memory = 0;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void memoryStore() {
        memory = currentValue;
    }

    public double memoryRecall() {
        currentValue = memory;
        return currentValue;
    }

    public void memoryAdd() {
        memory = memory + currentValue;
    }

    public void memoryReset() {
        memory = 0;
    }

    public double getMemory() {
        return memory;
    }

    public String displayBinary() {
        int wholeNumber = (int) currentValue;
        return Integer.toBinaryString(wholeNumber);
    }

    public String displayOctal() {
        int wholeNumber = (int) currentValue;
        return Integer.toOctalString(wholeNumber);
    }

    public String displayDecimal() {
        return String.valueOf(currentValue);
    }

    public String displayHexadecimal() {
        int wholeNumber = (int) currentValue;
        return Integer.toHexString(wholeNumber).toUpperCase();
    }
}