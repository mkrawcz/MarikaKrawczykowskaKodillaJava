package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    /*public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
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
         System.out.println("ArrayList with even numbers size: " + numbers.size());
         return numbers;
    }*/

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> resultList = new ArrayList<>();

        for(Integer el : numbers) {
            if (el % 2 == 0) {
                resultList.add(el);
            }
        }

        return resultList;

    }
}
