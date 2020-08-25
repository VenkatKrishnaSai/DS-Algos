package com.codewithvenky;

public class Array {
    private int[] array;
    private static int index=0;
    public Array(int length){
        array = new int[length];
    }

    public void insert(int number){
        if(index == array.length){
            int[] temp = array;
            array = new int[2*array.length];
            for(int i=0;i<temp.length;i++){
                array[i] = temp[i];
            }
        }
        array[index] = number;
        index++;
    }

    public void removeAt(int index){
        for(int i=index;i<array.length-1;i++){
            array[i] =array[i+1];
        }
        this.index--;
    }

    public void print(){
        for(int i=0;i<index;i++){
            System.out.println(array[i]);
        }
    }

    public int indexOf(int item){
        for(int i=0;i<array.length;i++){
            if(item == array[i])return i;
        }
        return -1;
    }
}
