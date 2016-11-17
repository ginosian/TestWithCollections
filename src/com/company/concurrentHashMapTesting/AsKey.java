package com.company.concurrentHashMapTesting;

/**
 * Created by marta.ginosyan on 11/17/2016.
 */
public class AsKey {
    private int coordinateId;
    private int hashcode;

    public AsKey(int coordinateId) {
        this.hashcode = Utils.rand.nextInt(5) + 1;
        this.coordinateId = coordinateId;
    }

    public AsKey() {
        this.hashcode = Utils.rand.nextInt(5) + 1;
    }

    public int getCoordinateId() {
        return coordinateId;
    }

    public void setCoordinateId(int coordinateId) {
        this.coordinateId = coordinateId;
    }

    @Override
    public int hashCode() {
        return hashcode;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AsKey)) {
            try {
                throw new InvalidDataTypeException("Object should be instance of AsKey");
            } catch (InvalidDataTypeException e) {
                e.printStackTrace();
            }
        }
        if(o.hashCode() == this.hashcode) return true;
        else return false;
    }
}

