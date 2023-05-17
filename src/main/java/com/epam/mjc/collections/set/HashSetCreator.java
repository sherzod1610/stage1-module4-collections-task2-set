package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer i : sourceList) {
            if (i % 2 == 0) {
                hashSet.add(i);
                i /= 2;
                if (i % 2 == 0) {
                    while (i % 2 == 0) {
                        hashSet.add(i);
                        i /= 2;
                    }
                }

            } else {
                hashSet.add(i);
                hashSet.add(2 * i);
            }
        }
        return hashSet;
    }
}
