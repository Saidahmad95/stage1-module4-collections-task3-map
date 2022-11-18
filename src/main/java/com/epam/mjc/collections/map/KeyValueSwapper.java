package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            if (hashMap.containsKey(entry.getValue())){
                Integer value = hashMap.get(entry.getValue());
                if (entry.getKey()>value) hashMap.put(entry.getValue(), value);
            }  else hashMap.put(entry.getValue(), entry.getKey());
        }
        return hashMap;
    }
}
