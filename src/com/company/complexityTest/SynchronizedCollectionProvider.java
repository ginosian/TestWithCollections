package com.company.complexityTest;

import java.util.*;

/**
 * Created by marta.ginosyan on 11/14/2016.
 */
public class SynchronizedCollectionProvider {

    public static Collection synchronizedCollection (Collection c) {
        return Collections.synchronizedCollection(c);
    }

    public static List synchronizedList(List c) {
        return Collections.synchronizedList(c);
    }

    public static Map synchronizedMap(Map c) {
        return Collections.synchronizedMap(c);
    }

    public static Set synchronizedSet(Set c) {
        return Collections.synchronizedSet(c);
    }

    public static SortedMap synchronizedSortedMap(SortedMap c) {
        return Collections.synchronizedSortedMap(c);
    }

    public static SortedSet synchronizedSortedSet(SortedSet c) {
        return Collections.synchronizedSortedSet(c);
    }
}
