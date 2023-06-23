package com.Day3Assignment;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 3, 5, 1, 4};

        System.out.println("Frequency of each element:");
        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            boolean isCounted = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    numbers[j] = Integer.MIN_VALUE;
                    isCounted = true;
                }
            }
            if (!isCounted && numbers[i] != Integer.MIN_VALUE) {
                System.out.println(numbers[i] + ": " + count);
            }
        }
    }
}
