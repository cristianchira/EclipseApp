package com.biostil.SpringMavenSps;

public class Stack<E> {
    private E[] stackContent;
    E e;
    public Stack(int capacity) {
        this.stackContent = (E[]) new Object[capacity];
    }
 
    public void push(E data) {
       System.out.println("Push "+data);
    }
 
    public E pop() {
    	 System.out.println("Pop "+stackContent);
        return null;
    }
}