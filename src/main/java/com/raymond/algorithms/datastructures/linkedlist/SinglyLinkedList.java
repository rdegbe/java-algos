/**
 * Implementation of singly linked list.
 *
 * @author Raymond Degbe, raymond.degbe.05@gmail.com
 */
package main.java.com.raymond.algorithms.datastructures.linkedlist;

import java.util.NoSuchElementException;

public class SinglyLinkedList{
    private class Node{
        private int data;
        private Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    private int size = 0;
    private Node head, tail, tbr, trav;


    // Add function adds node at the tail of the linked list by default, O(1)
    public void add(int elem) {
        addLast(elem);
        size++;
    }

    // Add a node to the tail of the linked list, O(1)
    public void addLast(int elem) {
        if(isEmpty())
            head = tail = new Node(elem, null);
        else {
            tail.next = new Node(elem, null);
            tail = tail.next;
        }
        size++;
    }

    public void addFirst(int elem) {
        if (isEmpty())
            head = tail = new Node(elem, null);
        else {
            trav = new Node(elem, head);
            head = trav;
        }
        size++;
    }

    public void removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();

        if (head == tail ){
            head = tail = null;
            return;
        }
        tbr = head.next;
        head = null;
        head = tbr;
        --size;
    }

    public void removeLast() {
        if(isEmpty()) throw new NoSuchElementException();

        if (head == tail ){
            head = tail = null;
            return;
        }
        trav = head;
        while (hasNotEnd() ) {
            if (trav.next == tail ) break;
            trav = trav.next;
        }
        tail = trav;
        tail.next = null;
        --size;
    }

    public int indexOf(int elem){
        int index = 0;
        trav = head;
        while (hasNotEnd()){
            if (trav.data == elem) return index;
            trav = trav.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int elem){
        return indexOf(elem) != -1;
    }

    // Return size of the linked list
    public int size(){
        return size;
    }

    public boolean hasNotEnd(){
        return trav != null;
    }

    public boolean isEmpty() {
        return head == null;
    }


public static void main(String[] args) {
        SinglyLinkedList a = new SinglyLinkedList();
        a.addFirst(2);
        a.addFirst(7);
        a.addLast(6);
        a.addLast(4);

        a.removeLast();
        a.removeLast();

    System.out.println(a.contains(5));

}
}

