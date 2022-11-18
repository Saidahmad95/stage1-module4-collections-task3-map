package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsValue(requiredValue);
    }
    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (Integer integer : sourceList) {
            int value=5*integer+2;
            hashMap.put(integer,value);
        }
    return hashMap;
    }
}
