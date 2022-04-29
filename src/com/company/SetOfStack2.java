package com.company;

import java.util.LinkedList;

public class SetOfStack2 <E>{
//     private Stack stack;
//     private
    E[] stack;
    private int size;
    // private
    int lastIndex;
    private int listInd;
    LinkedList<E[]> linStack = new LinkedList <E[]>();

    public SetOfStack2 (int size) {
        this.size = size;
        lastIndex = -1;
        listInd = 0;
//    ur = (E[]) new Object[size];
//    ul.add(ur);
        stack = (E[]) new Object[size];
        linStack.add(stack);
    }

    public void push (E val){
        lastIndex ++;
        this.stack[lastIndex] = val;
        this.linStack.add(0,this.stack);
        //  this.linStack.push();
    }
}
