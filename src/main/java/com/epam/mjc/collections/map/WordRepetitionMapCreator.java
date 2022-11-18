package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> hashMap = new HashMap<>();
        String[] split = sentence.toLowerCase(Locale.ROOT).split("[ ,.]");
        for (String s : split) {
            if (!hashMap.containsKey(s)) {
                if (!s.equals("")) {
                    hashMap.put(s, 1);
                }
            } else {
                Integer value = hashMap.get(s);
                Integer newValue = value + 1;
                hashMap.put(s, newValue);
            }
        }
        return hashMap;
    }
}
