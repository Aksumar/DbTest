package com.iskhakovalilia.dbtest.algorithm;

import com.iskhakovalilia.dbtest.algorithmType.AwesomeGroup;
import org.db.Algo;
import org.springframework.stereotype.Component;

@Component
public class SetUpAlgorithm extends Algorithm {

    SetUpAlgorithm() {
        signalNumber = AwesomeGroup.SIGNAL_1;
    }

    @Override
    public void handleSignal(int signal) {
        Algo algoLib = new Algo();
        algoLib.setUp();
        algoLib.setAlgoParam(1, 60);
        algoLib.performCalc();
        algoLib.submitToMarket();
    }
}
