package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    ArrayList<Integer> numbers;

    public OddNumbersExterminator(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
         int i = numbers.size();
         while (i != 0) {
             i--;
             System.out.println("ArrayList element: " + i);
             if (numbers.get(i) % 2 != 0) {
                 System.out.println("Exterminating odd number");
                 numbers.remove(i);
             } else {
                 System.out.println("Even number ommited");
             }
         }
        System.out.println("Exterminator ended working. ArrayList size: " + numbers.size());
         return numbers;
    }

    int size() {
        return numbers.size();
    }
}
