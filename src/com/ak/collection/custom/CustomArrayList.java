package com.ak.collection.custom;

public class CustomArrayList {

    private String array[] = new String[10];
    private int size = 0;

    public void add(String s) {
        array[size] = s;
        size++;

        if (size == array.length) {
            String newArray[] = new String[size * 2];
            for (int i = 0; i < newArray.length; i++) {
                if(i<size)
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    public String getValue(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
