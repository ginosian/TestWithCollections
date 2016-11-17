package com.company.complexityTest;

/**
 * Created by marta.ginosyan on 11/14/2016.
 */
public class RecordHolder {
    private String collectionClassName;
    private long initilize;
    private long getElement;
    private long add;
    private long addAll;
    private long binarySearch;
    private long copy;
    private long disjoint;
    private long fill;
    private long frequency;
    private long indexOfSubList;
    private long lastIndexOfSubList;
    private long max;
    private long min;
    private long replaceAll;
    private long reverse;
    private long reverseOrder;
    private long reverseOrderWithComperator;
    private long rotate;
    private long shuffle;
    private long sort;
    private long swap;
    private int memoryConsumptionEmpty;
    private int getMemoryConsumptionRatioForOneElement;

    @Override
    public String toString() {
        return
                ("Name of Collection tested: " + collectionClassName + "\n" +
                "Initilize: " + initilize + "\n" +
                "GetElement: " + getElement + "\n" +
                "Add: " + add + "\n" +
                "AddAll: " + addAll + "\n" +
                "BinarySearch: " + binarySearch + "\n" +
                "Copy: " + copy + "\n" +
                "Disjoint: " + disjoint + "\n" +
                "Fill: " + fill + "\n" +
                "Frequency: " + frequency + "\n" +
                "IndexOfSubList: " + indexOfSubList + "\n" +
                "LastIndexOfSubList: " + lastIndexOfSubList + "\n" +
                "Max: " + max + "\n" +
                "Min: " + min + "\n" +
                "ReplaceAll: " + replaceAll + "\n" +
                "Reverse: " + reverse + "\n" +
                "ReverseOrder: " + reverseOrder + "\n" +
                "ReverseOrderWithComperator: " + reverseOrderWithComperator + "\n" +
                "Rotate: " + rotate + "\n" +
                "Shuffle: " + shuffle + "\n" +
                "Sort: " + sort + "\n" +
                "Swap: " + swap + "\n" +
                "MemoryConsumptionEmpty: " + memoryConsumptionEmpty + "\n" +
                "GetMemoryConsumptionRatioForOneElement: " + getMemoryConsumptionRatioForOneElement);
    }

    public String getCollectionClassName() {
        return collectionClassName;
    }

    public void setCollectionClassName(String collectionClassName) {
        this.collectionClassName = collectionClassName;
    }

    public long getInitilize() {
        return initilize;
    }

    public void setInitilize(long initilize) {
        this.initilize = initilize;
    }

    public long getGetElement() {
        return getElement;
    }

    public void setGetElement(long getElement) {
        this.getElement = getElement;
    }

    public long getAdd() {
        return add;
    }

    public void setAdd(long add) {
        this.add = add;
    }

    public long getAddAll() {
        return addAll;
    }

    public void setAddAll(long addAll) {
        this.addAll = addAll;
    }

    public long getBinarySearch() {
        return binarySearch;
    }

    public void setBinarySearch(long binarySearch) {
        this.binarySearch = binarySearch;
    }

    public long getCopy() {
        return copy;
    }

    public void setCopy(long copy) {
        this.copy = copy;
    }

    public long getDisjoint() {
        return disjoint;
    }

    public void setDisjoint(long disjoint) {
        this.disjoint = disjoint;
    }

    public long getFill() {
        return fill;
    }

    public void setFill(long fill) {
        this.fill = fill;
    }

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    public long getIndexOfSubList() {
        return indexOfSubList;
    }

    public void setIndexOfSubList(long indexOfSubList) {
        this.indexOfSubList = indexOfSubList;
    }

    public long getLastIndexOfSubList() {
        return lastIndexOfSubList;
    }

    public void setLastIndexOfSubList(long lastIndexOfSubList) {
        this.lastIndexOfSubList = lastIndexOfSubList;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public long getReplaceAll() {
        return replaceAll;
    }

    public void setReplaceAll(long replaceAll) {
        this.replaceAll = replaceAll;
    }

    public long getReverse() {
        return reverse;
    }

    public void setReverse(long reverse) {
        this.reverse = reverse;
    }

    public long getReverseOrder() {
        return reverseOrder;
    }

    public void setReverseOrder(long reverseOrder) {
        this.reverseOrder = reverseOrder;
    }

    public long getReverseOrderWithComperator() {
        return reverseOrderWithComperator;
    }

    public void setReverseOrderWithComperator(long reverseOrderWithComperator) {
        this.reverseOrderWithComperator = reverseOrderWithComperator;
    }

    public long getRotate() {
        return rotate;
    }

    public void setRotate(long rotate) {
        this.rotate = rotate;
    }

    public long getShuffle() {
        return shuffle;
    }

    public void setShuffle(long shuffle) {
        this.shuffle = shuffle;
    }

    public long getSort() {
        return sort;
    }

    public void setSort(long sort) {
        this.sort = sort;
    }

    public long getSwap() {
        return swap;
    }

    public void setSwap(long swap) {
        this.swap = swap;
    }

    public int getMemoryConsumptionEmpty() {
        return memoryConsumptionEmpty;
    }

    public void setMemoryConsumptionEmpty(int memoryConsumptionEmpty) {
        this.memoryConsumptionEmpty = memoryConsumptionEmpty;
    }

    public int getGetMemoryConsumptionRatioForOneElement() {
        return getMemoryConsumptionRatioForOneElement;
    }

    public void setGetMemoryConsumptionRatioForOneElement(int getMemoryConsumptionRatioForOneElement) {
        this.getMemoryConsumptionRatioForOneElement = getMemoryConsumptionRatioForOneElement;
    }
}
