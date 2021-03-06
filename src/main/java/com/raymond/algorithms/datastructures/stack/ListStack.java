/**
 * Stack Implemented using Linked List (Doubly Linked List)
 * The Linked List instance used here is the one provided in java.util. instead of the one that I created.
 * This is for portability in case you want to use this stack implementation for whatever reason ;)
 *
 * @author Raymond Degbe, raymond.degbe.05@gmail.com
 */
package main.java.com.raymond.algorithms.datastructures.stack;
import java.util.*;

public class ListStack<T> implements Iterable<T>, Stack<T> {

  private LinkedList<T> list = new LinkedList<T>();

  // Create an empty stack
  public ListStack() {}

  // Create a Stack with an initial element
  public ListStack(T firstElem) {
    push(firstElem);
  }

  // Return the number of elements in the stack
  public int size() {
    return list.size();
  }

  // Check if the stack is empty
  public boolean isEmpty() {
    return size() == 0;
  }

  // Push an element on the stack
  public void push(T elem) {
    list.addLast(elem);
  }

  // Pop an element off the stack
  // Throws an error is the stack is empty
  public T pop() {
    if (isEmpty()) throw new EmptyStackException();
    return list.removeLast();
  }

  // Peek the top of the stack without removing an element
  // Throws an exception if the stack is empty
  public T peek() {
    if (isEmpty()) throw new EmptyStackException();
    return list.peekLast();
  }

  // Searches for the element starting from top of the stack
  // Returns -1 if the element is not present in the stack
  public int search(T elem) {
    return list.lastIndexOf(elem);
  }

  // Allow users to iterate through the stack using an iterator
  @Override
  public Iterator<T> iterator() {
    return list.iterator();
  }
}
