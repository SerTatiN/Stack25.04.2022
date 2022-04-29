package com.company;

public class Stack {
    private int[] arr;
    private int size;
    private int lastIndex;

    public Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.lastIndex = -1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public void push(int value) throws IndexOutOfBoundsException{
        this.lastIndex ++;
        if (this.lastIndex > arr.length) {
            throw new IndexOutOfBoundsException();
        }
        this.arr [this.lastIndex] = value;
    }

    public int pop() throws IndexOutOfBoundsException {
          return arr[this.lastIndex--];
    }

    public int peep() {
        return arr[this.lastIndex];
    }

    public boolean isEmpty() {
        return this.lastIndex == -1;
    }

    public int search(int num) {
        for (int i = 0; i < this.lastIndex+1; i++) {
           if (this.arr[i] == num) {
                 return i;
             }
        }
        return -1;
    }
}
