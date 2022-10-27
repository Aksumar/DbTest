package com.iskhakovalilia.dbtest.algorithm;

import com.iskhakovalilia.dbtest.algorithmType.AwesomeGroup;
import org.db.Algo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReverseAlgorithm extends Algorithm {
    @Autowired
    Algo algoLib;

    ReverseAlgorithm() {
        signalNumber = AwesomeGroup.SIGNAL_2;
    }

    public void handleSignal(int signal) {
        algoLib.reverse();
        algoLib.setAlgoParam(1, 80);
        algoLib.submitToMarket();
    }
}
