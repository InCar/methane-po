package com.incarcloud.methane;

import com.incarcloud.methane.comm.IReceiver;

import java.util.ArrayList;
import java.util.List;

class MockReceiver implements IReceiver {

    private final List<String> testList = new ArrayList<>();

    @Override
    public int OnReceive(String vin) {
        testList.add(vin);
        return 1;
    }

    public List<String> getTestList() {
        return testList;
    }
}
