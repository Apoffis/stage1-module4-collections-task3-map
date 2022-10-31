package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> wordRepetition = new HashMap<>();
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        for (String word : words) {
            if (wordRepetition.containsKey(word))
                wordRepetition.put(word, wordRepetition.get(word) + 1);
            else
                if (word != null && !word.isEmpty())
                    wordRepetition.put(word, 1);
        }

        return wordRepetition;
    }
}
