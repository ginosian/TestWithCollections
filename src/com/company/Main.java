package com.company;

import java.util.*;

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
    }




}
