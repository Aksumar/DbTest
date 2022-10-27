package com.iskhakovalilia.dbtest.algorithmType;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public interface SignalNumber {
    Set<Integer> usedNumbers = Collections.synchronizedSet(new HashSet<>());

    int getNumber();
}
