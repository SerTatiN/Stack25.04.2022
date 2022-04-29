package com.company;
//    Как известно, слишком высокая стопка тарелок может развалиться. Следовательно, в реальной жизни, когда высота
//    стопки превысила бы некоторое пороговое значение, мы начали бы складывать тарелки в новую стопку. Реализуйте
//    структуру данных SetofStacks, имитирующую реальную ситуацию. Структура SetofStacks должна состоять из нескольких
//    стеков, новый стек создается, как только предыдущий достигнет порогового значения. Методы SetofStacks.push() и
//    SetofStacks.pop() должны вести себя так же, как при работе с одним стеком (то есть метод pop() должен возвращать
//    те же значения, которые бы он возвращал при использовании одного большого стека). Реализуйте функцию popAt(int index),
//    которая осуществляет операцию pop c заданным внутренним стеком.

import java.util.LinkedList;

public class SetOfStacks {
    private LinkedList <Stack> linkListStacks;
    private int sizeL;
    private int aktivIndex; //для активной "стопки"


    public int getAktivIndex() {
        return aktivIndex;
    }

    public SetOfStacks(int size) {
        this.linkListStacks = new LinkedList<>();
        this.sizeL = size;
        this.aktivIndex = 0;
        Stack stack = new Stack(size);
        this.linkListStacks.add(stack);
    }

    public void push (int value) {
        if (this.linkListStacks.get(this.aktivIndex).getLastIndex() < this.linkListStacks.get(this.aktivIndex).getSize()-1) {
            this.linkListStacks.get(this.aktivIndex).push(value);
            System.out.println("push+" + this.linkListStacks.get(this.aktivIndex).getLastIndex());
        } else {
            this.aktivIndex++;
            Stack stack = new Stack(this.sizeL);
            stack.push(value);
            this.linkListStacks.add(stack);
            System.out.println("+ new stack");
        }
    }

    public int pop() {
        if (!this.linkListStacks.get(this.aktivIndex).isEmpty()) {
            System.out.println("not empty");
        } else {
            this.aktivIndex--;
        }
        return this.linkListStacks.get(this.aktivIndex).pop();

    }

    public int  popAt(int index) {
        if (index <= this.aktivIndex) {
            if (!this.linkListStacks.get(index).isEmpty()) {
                return this.linkListStacks.get(index).pop();
            }
        } else {
            System.out.println("NO ELEMENT");
        }
        return this.linkListStacks.get(aktivIndex).pop();
    }


}
//    Как известно, слишком высокая стопка тарелок может развалиться. Следовательно, в реальной жизни, когда высота
//    стопки превысила бы некоторое пороговое значение, мы начали бы складывать тарелки в новую стопку. Реализуйте
//    структуру данных SetofStacks, имитирующую реальную ситуацию. Структура SetofStacks должна состоять из нескольких
//    стеков, новый стек создается, как только предыдущий достигнет порогового значения. Методы SetofStacks.push() и
//    SetofStacks.pop() должны вести себя так же, как при работе с одним стеком (то есть метод pop() должен возвращать
//    те же значения, которые бы он возвращал при использовании одного большого стека). Реализуйте функцию popAt(int index),
//    которая осуществляет операцию pop c заданным внутренним стеком.