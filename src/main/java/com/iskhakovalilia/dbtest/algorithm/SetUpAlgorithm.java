package com.iskhakovalilia.dbtest.algorithm;

import com.iskhakovalilia.dbtest.algorithmType.AwesomeGroup;
import org.db.Algo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetUpAlgorithm extends Algorithm {
    @Autowired
    Algo algoLib;

    SetUpAlgorithm() {
        signalNumber = AwesomeGroup.SIGNAL_1;
    }

    @Override
    public void handleSignal(int signal) {
        algoLib.setUp();
        algoLib.setAlgoParam(1, 60);
        algoLib.performCalc();
        algoLib.submitToMarket();
    }
}
