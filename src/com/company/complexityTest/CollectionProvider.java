package com.company.complexityTest;

import java.util.*;

/**
 * Created by marta.ginosyan on 11/14/2016.
 */
public class CollectionProvider {
    public static HashSet hashSet = new HashSet();
    public static TreeSet treeSet = new TreeSet();
    public static LinkedHashSet linkedHashSet = new LinkedHashSet();
    public static PriorityQueue priorityQueue = new PriorityQueue();
    public static ArrayDeque arrayDeque = new ArrayDeque();
    public static LinkedList linkedList = new LinkedList();
    public static ArrayList arrayList = new ArrayList();




    public static Collection fillData(Collection collection, int size){
        for (int i = 0; i < size; i++) {
            collection.add(collection.getClass().getName() + (i+1));
        }
        return collection;
    }

    public static void print(Collection collection){
        System.out.println("************* Printing information from " + collection.getClass().getName() + " collection.");
        Iterator iterator = collection.iterator();
        int count = 1;
        while (iterator.hasNext()){
            System.out.println(count + ". " + iterator.next());
        }
    }
}

