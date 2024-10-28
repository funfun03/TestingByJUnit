package com.example;


/**
 * Hello world!
 */
public final class MyClass {
    public MyClass() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public int average(int value[], int minimum, int maximum) {
        int i = 0;
        int inputNumber = 0;
        int validNumber = 0;
        int sum = 0;
        int average;
    
        while ((value[i] != -999) && (inputNumber < 100)) {
            inputNumber++;
            if ((value[i] >= minimum) && (value[i] <= maximum)) {
                validNumber++;
                sum = sum + value[i];
            } else {
                i++;
                continue;
            }
            i++;
        }
    
        if (validNumber > 0) {
            average = sum / validNumber;
        } else {
            average = -999;
        }
        return average;
    }
    
}
