package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                int currentNum = num;
                while (currentNum % 2 == 0) {
                    hashSet.add(currentNum);
                    currentNum /= 2;
                }
                hashSet.add(currentNum);
            } else {
                hashSet.add(num);
                hashSet.add(2 * num);
            }
        }

        return hashSet;
    }
}
