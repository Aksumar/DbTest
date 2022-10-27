package com.iskhakovalilia.dbtest.algorithmType;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public interface SignalNumber {
    /**
     * Collection that saves all signals, that have already been handled. Only one service can handle each of the signal.
     */
    Set<Integer> usedNumbers = Collections.synchronizedSet(new HashSet<>());

    int getNumber();
}
