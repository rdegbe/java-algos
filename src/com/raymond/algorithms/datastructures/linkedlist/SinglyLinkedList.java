/**
 * A very simple implementation of singly linked list.
 *
 * @author Raymond Degbe, raymond.degbe.05@gmail.com
 */
package com.raymond.algorithms.datastructures.linkedlist;

public class SinglyLinkedList {
    Node head; // head of list

    // Linked list Node. This inner class is made static so that
    // main() can access it
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        } // Constructor
    }

    // This function prints contents of linked list starting from head
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }



// method to create a simple linked list with 3 nodes
public static void main(String[] args) {
    /* Start with the empty list. */
    SinglyLinkedList sllist = new SinglyLinkedList();

    sllist.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    sllist.head.next = second; // Link first node with the second node
    second.next = third; // Link second node with the third node

    sllist.printList();
}
}

