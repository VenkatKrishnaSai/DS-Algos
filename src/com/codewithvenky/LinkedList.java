package com.codewithvenky;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first = null;
    private Node last = null;
    private int count = 0;

    public void addLast(int number){
        Node node = new Node(number);
        node.next = null;
        if(isEmpty()) {
            last = node;
            first = node;
        }
        else{
            last.next = node;
            last = node;
        }
        count++;

    }

    public void addFirst(int number){
        Node node = new Node(number);
        if(isEmpty()){
            first = node;
            last =node;
            node.next = null;
        }
        else{
            node.next = first;
            first = node;
        }
        count++;
    }

    public int indexOf(int number){
        int count = 0;
        Node current = first;
        while(current != null){
            if(current.value == number){
                return count;
            }
            count++;
            current = current.next;
        }
        return -1;
    }

    public boolean contains(int number){
        return indexOf(number) != -1;
    }

    public void removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = null;
            last = null;
            count--;
            return;
        }
        Node second = first.next;
        first.next = null;
        first = second;
        count--;
    }

    public void removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = null;
            last = null;
            count--;
            return;
        }
        Node previousNode = getPrevious(last);
        previousNode.next = null;
        last = previousNode;
        count--;
    }

    public Node getPrevious(Node node){
        Node current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public void print(){
        Node current = first;
        while(current!= null){
            System.out.println(current.value);
            current =current.next;
        }
    }

    public int[] toArray(){
        int[] newArray = new int[count];
        Node current = first;
        int index = 0;
        while(current != null){
            newArray[index] = current.value;
            index++;
            current = current.next;
        }
        return newArray;
    }

    public void reverse(){
        if(isEmpty()) return;
        Node current = first;
        Node previous = null;
        while(current.next != null){
            Node nextNode = current.next;
            current.next = previous;
            previous =current;
            current = nextNode;
        }
        current.next = previous;


        last = first;
        first = current;
    }

    public int size(){
        return count;
    }

    private boolean isEmpty(){
        return first == null;
    }
}
