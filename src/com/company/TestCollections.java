package com.company;

import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by marta.ginosyan on 11/14/2016.
 */
public class TestCollections {

    private Timestamp syncTS = new Timestamp();
    private RecordHolder recordHolder;

    private void memoryConsumption(Collection c) {
        Field f;
        try {
            f = c.getClass().getDeclaredField("elementData");
            f.setAccessible(true);
            int capacity = ((Object[]) f.get(c)).length;
            recordHolder.setGetMemoryConsumptionRatioForOneElement(capacity / c.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void operationTimeConsumption(Collection collection){
        recordHolder.setInitilize(testInitialize(collection));
        recordHolder.setGetElement(testGetElement(collection));
        recordHolder.setGetElement(testAdd(collection));
        recordHolder.setGetElement(testAddAll(collection));
        recordHolder.setGetElement(testBinarySearch(collection));
        recordHolder.setGetElement(testCopy(collection));
        recordHolder.setGetElement(testDisjoint(collection));
        recordHolder.setGetElement(testFill(collection));
        recordHolder.setGetElement(testFrequency(collection));
        recordHolder.setGetElement(testIndexOfSubList(collection));
        recordHolder.setGetElement(testLastIndexOfSubList(collection));
        recordHolder.setGetElement(testMax(collection));
    }

    static void cleanGC() {
        System.gc();
        System.runFinalization();
        System.gc();
    }

    private long testInitialize(Collection c) {
        cleanGC();
        CollectionProvider.fillData(c, 10);
        syncTS.stop();
        return syncTS.elapsedTime();
    }
    private long testGetElement(Collection c) {
        cleanGC();
        if (c instanceof List){
            testGetElementFromList(c);
        } else if (c instanceof Set){
            testGetElementFromSet(c);
        }
        syncTS.stop();
        return syncTS.elapsedTime();
    }
    private long testGetElementFromList(Collection c) {
        int elementIndex = c.size()/2;
        cleanGC();
        ((List)c).get(elementIndex);
        syncTS.stop();
        return syncTS.elapsedTime();
    }
    private long testGetElementFromSet(Collection c) {
        int elementIndex = c.size()/2;
        int counter = 1;
        Iterator iterator = c.iterator();
        cleanGC();
        while (iterator.hasNext()){
            iterator.next();
            if(counter == elementIndex){
                break;
            }
        }
        syncTS.stop();
        return syncTS.elapsedTime();
    }
    private long testAdd(Collection c) {
        Object o = new Object();
        cleanGC();
        c.add(o);
        syncTS.stop();
        return syncTS.elapsedTime();
    }
    private long testAddAll(Collection c) {
        Collection additional = c;
        cleanGC();
        c.addAll(additional);
        syncTS.stop();
        return syncTS.elapsedTime();
    }
    private long testBinarySearch(Collection c) {
        return 0;
    }
    private long testCopy(Collection c) {
        if(!(c instanceof  List)) return 0;
        Collection additional = c;
        cleanGC();
        Collections.copy((List)c, (List)additional);
        syncTS.stop();
        return syncTS.elapsedTime();
    }
    private long testDisjoint(Collection c) {
        Collection additional = c;
        cleanGC();
        Collections.disjoint(c, additional);
        syncTS.stop();
        return syncTS.elapsedTime();
    }
    private long testFill(Collection c) {
//        Object[] collectionArray = c.toArray();
//        Object fill = collectionArray[0];
//        cleanGC();
//        Collections.fill(c, fill);
//        syncTS.stop();
//        return syncTS.elapsedTime();
        return 0;
    }
    private long testFrequency(Collection c) {
        Object[] collectionArray = c.toArray();
        Object obj = collectionArray[0];
        cleanGC();
        Collections.frequency(c, obj);
        syncTS.stop();
        return syncTS.elapsedTime();
    }
    private long testIndexOfSubList(Collection c) {
        return 0;
    }
    private long testLastIndexOfSubList(Collection c) {
        return 0;
    }
    private long testMax(Collection c) {
        return 0;
    }
    private long testMin(Collection c) {
        return 0;
    }
    private long testReplaceAll(Collection c) {
        return 0;
    }
    private long testReverse(Collection c) {
        return 0;
    }
    private long testReverseOrder(Collection c) {
        return 0;
    }
    private long testReverseOrderWithComperator(Collection c) {
        return 0;
    }
    private long testRotate(Collection c) {
        if(!(c instanceof  List)) return 0;
        cleanGC();
        Collections.rotate((List)c, 8);
        syncTS.stop();
        return syncTS.elapsedTime();
    }
    private long testShuffle(Collection c) {
        if(!(c instanceof  List)) return 0;
        cleanGC();
        Collections.shuffle((List)c);
        syncTS.stop();
        return syncTS.elapsedTime();
    }
    private long testSort(Collection c) {
        if(!(c instanceof  List)) return 0;
        cleanGC();
        Collections.sort((List)c);
        syncTS.stop();
        return syncTS.elapsedTime();
    }
    private long testSwap(Collection c) {
        if(!(c instanceof  List)) return 0;
        cleanGC();
        Collections.swap((List)c, 5, 8);
        syncTS.stop();
        return syncTS.elapsedTime();
    }

    public RecordHolder testCollection(Collection collection) throws InvalidCollectionException {
        if (collection == null || collection.size() < 20) throw new InvalidCollectionException("Collection you provided should be not null, and have at least 20 elements");
        recordHolder = new RecordHolder();
        recordHolder.setCollectionClassName(collection.getClass().getName());
        memoryConsumption(collection);
        operationTimeConsumption(collection);
        return this.recordHolder;
    }
}
