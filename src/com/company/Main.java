package com.company;

public class Main {

    public static void main(String[] args) {
         Stack stk = new Stack(5);
         stk.push(1);
         stk.push(2);
         stk.push(3);
         stk.push(4);
         stk.push(5);

        System.out.println(stk.pop() + " " + stk.getLastIndex());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop() +" " + stk.getLastIndex());
        System.out.println(stk.pop() +" " + stk.getLastIndex());

        System.out.println(stk.isEmpty());
        stk.push(6);
        System.out.println(stk.peep());
        System.out.println(stk.search(3));
        System.out.println("----------------");
        SetOfStacks setOfStacks = new SetOfStacks(5);
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.push(4);
        setOfStacks.push(5);
        setOfStacks.push(6);
        setOfStacks.push(7);
        setOfStacks.push(8);
        System.out.println(setOfStacks.pop() +" " + setOfStacks.getAktivIndex());
        System.out.println(setOfStacks.pop() +" " + setOfStacks.getAktivIndex());

        setOfStacks.push(9);
        setOfStacks.push(10);
        setOfStacks.push(11);
        System.out.println(setOfStacks.pop() +" " + setOfStacks.getAktivIndex());
        System.out.println(setOfStacks.pop() +" " + setOfStacks.getAktivIndex());
        System.out.println(setOfStacks.popAt(2) +" " + setOfStacks.getAktivIndex());
        System.out.println(setOfStacks.popAt(0) +" " + setOfStacks.getAktivIndex());
    }
}
