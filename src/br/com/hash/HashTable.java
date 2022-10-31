package br.com.hash;

import java.util.LinkedList;

public class HashTable<T> {
    
    private LinkedList<LinkedList<T>> elements;

    private int categories = 16;
    private int size;

    public HashTable() {
        this.elements = new LinkedList<LinkedList<T>>();
        this.size = 0;
        for (int i = 0; i < this.categories; i++) {
            this.elements.add(new LinkedList<T>());
        }
    }

    public boolean add(T element) {
        LinkedList<T> list = this.getCategory(element);
        if(element == null || this.contains(element)) {
            return false;
        }
        list.add(element);
        this.size ++;
        return true;
    }

    public void remove(T element) {
        LinkedList<T> list = this.getCategory(element);
        list.remove(element);
        this.size --;
    }

    public boolean contains(T element) {
        LinkedList<T> list = this.getCategory(element);
        return list.contains(element);
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    private int hashGenerator(T element) {
        return Math.abs(element.hashCode() % this.categories);
    }

    private LinkedList<T> getCategory(T element) {
        int hash = this.hashGenerator(element);
        return this.elements.get(hash);
    }

    @Override
    public String toString() {
        return "HashTable [elements=" + elements + "]";
    }

}
