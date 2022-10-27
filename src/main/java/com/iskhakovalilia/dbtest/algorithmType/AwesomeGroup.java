package com.iskhakovalilia.dbtest.algorithmType;

public enum AwesomeGroup implements SignalNumber {
    SIGNAL_1(1),
    SIGNAL_2(2);

    private final int number;

    AwesomeGroup(int number) {
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
