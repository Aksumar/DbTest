package com.iskhakovalilia.dbtest.algorithm;

import com.iskhakovalilia.dbtest.algorithmType.PerfectGroup;
import org.db.Algo;
import org.springframework.stereotype.Component;

@Component
public class CalculationAlgorithm extends Algorithm {

    CalculationAlgorithm() {
        signalNumber = PerfectGroup.SIGNAL_3;
    }

    public void handleSignal(int signal) {
        Algo algoLib = new Algo();

        algoLib.setAlgoParam(1, 90);
        algoLib.setAlgoParam(2, 15);
        algoLib.performCalc();
        algoLib.submitToMarket();
    }
}
