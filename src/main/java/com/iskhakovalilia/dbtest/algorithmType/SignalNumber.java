package com.iskhakovalilia.dbtest.algorithmType;

import java.util.HashSet;
import java.util.Set;

public interface SignalNumber {
    Set<Integer> usedNumbers = new HashSet<>();

    int getNumber();
}
