package com.company;

import com.company.complexityTest.CollectionProvider;
import com.company.complexityTest.InvalidCollectionException;
import com.company.complexityTest.RecordHolder;
import com.company.complexityTest.TestCollections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {

























































        int collectionSize = 20;
        HashSet hashSet = (HashSet) CollectionProvider.fillData(CollectionProvider.hashSet, collectionSize);
        TreeSet treeSet = (TreeSet) CollectionProvider.fillData(CollectionProvider.treeSet, collectionSize);
        LinkedHashSet linkedHashSet = (LinkedHashSet) CollectionProvider.fillData(CollectionProvider.linkedHashSet, collectionSize);
        PriorityQueue priorityQueue = (PriorityQueue) CollectionProvider.fillData(CollectionProvider.priorityQueue, collectionSize);
        ArrayDeque arrayDeque = (ArrayDeque) CollectionProvider.fillData(CollectionProvider.arrayDeque, collectionSize);
        LinkedList linkedList = (LinkedList) CollectionProvider.fillData(CollectionProvider.linkedList, collectionSize);
        ArrayList arrayList = (ArrayList) CollectionProvider.fillData(CollectionProvider.arrayList, collectionSize);

        TestCollections testCollections = new TestCollections();
        RecordHolder recordHolder;

        try {
            recordHolder = testCollections.testCollection(hashSet);
            System.out.println(recordHolder.toString());
            recordHolder = testCollections.testCollection(Collections.synchronizedSet(hashSet));
            System.out.println(recordHolder.toString());

        } catch (InvalidCollectionException e) {
            e.printStackTrace();
        }

        Map<String, String> notSync = new HashMap<>();
        notSync.put("One", "One");
        notSync.put("Two", "Two");

        notSync = Collections.synchronizedMap(notSync);


        Map<String, String> currencies = new HashMap<>();
        currencies.put("USA", "USD");
        currencies.put("England", "GBP");
        currencies.put("Canada", "CAD");
        currencies.put("HongKong", "HKD");
        currencies.put("Australia", "AUD");

        currencies = Collections.synchronizedMap(currencies);

        Set<String> keySet = currencies.keySet();

        synchronized(currencies) { Iterator<String> itr = keySet.iterator(); }

        ConcurrentHashMap<String, String> syncmap = new ConcurrentHashMap();

        HashSet d;





    }






}
