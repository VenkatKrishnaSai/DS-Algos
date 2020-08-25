package com.codewithvenky;

import java.util.EmptyStackException;

public class Stack {

    int[] stack;
    int index = 0;
    public Stack(int capacity){
        stack = new int[capacity];
    }

    public boolean isEmpty(){
        return index == 0?false:true;
    }

    public int pop(){
        return 0;
    }

    public void push(int item){
        if(index == stack.length){
            int[] newStack = new int[2*index];
            for(int i=0;i<stack.length;i++){
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
        stack[index] = item;
        index++;
    }
}
