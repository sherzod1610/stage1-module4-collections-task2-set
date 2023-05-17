package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> stringSet = new HashSet<>();
        for (String s1 : firstSet) {
            if (secondSet.contains(s1) & !thirdSet.contains(s1)) {
                stringSet.add(s1);
            }
        }
        for (String s3 : thirdSet) {
            if (stringSet.contains(s3)) {
                stringSet.remove(s3);
            } else {
                stringSet.add(s3);
            }

        }
        return stringSet;
    }
}
