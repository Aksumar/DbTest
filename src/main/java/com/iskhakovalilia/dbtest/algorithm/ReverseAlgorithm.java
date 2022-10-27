package com.iskhakovalilia.dbtest.algorithm;

import com.iskhakovalilia.dbtest.algorithmType.AwesomeGroup;
import com.iskhakovalilia.dbtest.algorithmType.PerfectGroup;
import com.iskhakovalilia.dbtest.lib.Algo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReverseAlgorithm extends Algorithm {

    ReverseAlgorithm() {
        signalNumber = AwesomeGroup.SIGNAL_2;
    }

    @Autowired
    Algo algoLib;

    public void handleSignal(int signal) {
        algoLib.reverse();
        algoLib.setAlgoParam(1, 80);
        algoLib.submitToMarket();
    }
}
