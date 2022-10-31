package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        var res = functionMap.values().stream().filter(integer -> integer == requiredValue).findFirst();
        return res.isPresent();
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> calcMap = new LinkedHashMap<>();
        for(Integer num : sourceList)
            calcMap.put(num, 5 * num + 2);
        return calcMap;
    }
}
