package com.company.concurrentHashMapTesting;

import java.util.Map;

/**
 * Created by marta.ginosyan on 11/17/2016.
 */
public class TestUnit {

    public static void testStep1(Map testCase){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3000; i++) {
                    testCase.put((new AsKey(Utils.rand.nextInt(90) + 10)), (new AsValue((Utils.rand.nextInt(90) + 10), (Utils.rand.nextInt(90) + 10))));
                }
                Object[] keySet = testCase.keySet().toArray();
                for (int i = 0; i < testCase.size(); i+=10) {
                    testCase.put(keySet[i], new AsValue((Utils.rand.nextInt(90) + 10), (Utils.rand.nextInt(90) + 10)));
                }
            }
        });
    }
}
