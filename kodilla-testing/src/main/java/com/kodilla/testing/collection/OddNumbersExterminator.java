package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> resultList = new ArrayList<>();

        for(Integer el: numbers) {
            if (el % 2 == 0) {
                resultList.add(el);
            }
        }

        return resultList;
    }
}