package com.iskhakovalilia.dbtest.algorithmType;

public enum PerfectGroup implements SignalNumber {
    SIGNAL_3(3);
    private final int number;

    PerfectGroup(int number) {
        if (usedNumbers.contains(number))
            throw new IllegalArgumentException("There is already algorithm with the same number");
        this.number = number;
        usedNumbers.add(number);
    }

    @Override
    public int getNumber() {
        return number;
    }
}
