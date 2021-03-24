package com.archit.Part1;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;
        Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);

        if(isEmpty()) {
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        var current = first;
        while (current != null) {
            if (current.value == item) return true;
            current = current.next;
        }
        return false;

        // return indexOf(item) != -1
    }


    public void removeFirst() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        if (first == last){
            first = last = null;
            size--;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public void removeLast() {
        Node current = first;
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (current == last) {
            first = last = null;
            size--;
            return;
        }
        while (current != null) {
            if (current.next == last){
                last = current;
                current.next = null;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public int size(){
//        Node current = first;
//        int index = 0;
//        while (current != null){
//            index++;
//            current = current.next;
//        }
//        return index;
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current  = first;
        int index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        if (isEmpty())
            return;

        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;

    }


    public int getKthFromTheEnd(int k) {
        Node start = first;
        Node end = first;
        int index = 0;
        if (isEmpty())
            throw new IllegalStateException();

        for (int i = 0;i<k-1;i++) {
            end = end.next;
            if(end == null)
                throw new IllegalArgumentException();
        }
        while(end != last){
            start = start.next;
            end = end.next;
        }
        return start.value;
    }

    private boolean isEmpty() {

        return first == null;
    }

}
