package com.Day3Assignment;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 25};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }
}

