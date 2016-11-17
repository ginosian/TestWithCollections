package com.company.unmodifiable.immutable.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by marta.ginosyan on 11/17/2016.
 */
public class MyCollection {

    @BreakRules(immutableCollection = true)
    private Collection immutableCollection;

    @BreakRules(unmodifableCollection = true)
    private Collection unmodifableCollection;

    @BreakRules(immutableMap = true)
    private Map immutableMap;

    @BreakRules(unmodifableMap = true)
    private Map unmodifableMap;

    private Collection modifableCollection;
    private Map modifableMap;
    private Collection mutableCollection;
    private Map mutableMap;

    public MyCollection() {
        immutableCollection = new ArrayList();
        unmodifableCollection = new ArrayList();
        modifableCollection = new ArrayList();
        mutableCollection = new ArrayList();

        immutableMap = new HashMap();
        unmodifableMap = new HashMap();
        modifableMap = new HashMap();
        mutableMap = new HashMap();
    }

    public Collection getImmutableCollection() {
        return immutableCollection;
    }

    public void setImmutableCollection(Collection immutableCollection) {
        this.immutableCollection = immutableCollection;
    }

    public Collection getUnmodifableCollection() {
        return unmodifableCollection;
    }

    public void setUnmodifableCollection(Collection unmodifableCollection) {
        this.unmodifableCollection = unmodifableCollection;
    }

    public Map getImmutableMap() {
        return immutableMap;
    }

    public void setImmutableMap(Map immutableMap) {
        this.immutableMap = immutableMap;
    }

    public Map getUnmodifableMap() {
        return unmodifableMap;
    }

    public void setUnmodifableMap(Map unmodifableMap) {
        this.unmodifableMap = unmodifableMap;
    }

    public Collection getModifableCollection() {
        return modifableCollection;
    }

    public void setModifableCollection(Collection modifableCollection) {
        this.modifableCollection = modifableCollection;
    }

    public Map getModifableMap() {
        return modifableMap;
    }

    public void setModifableMap(Map modifableMap) {
        this.modifableMap = modifableMap;
    }

    public Collection getMutableCollection() {
        return mutableCollection;
    }

    public void setMutableCollection(Collection mutableCollection) {
        this.mutableCollection = mutableCollection;
    }

    public Map getMutableMap() {
        return mutableMap;
    }

    public void setMutableMap(Map mutableMap) {
        this.mutableMap = mutableMap;
    }
}


