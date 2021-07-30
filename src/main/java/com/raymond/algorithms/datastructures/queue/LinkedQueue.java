/**
 * A simple queue implementation with a linked List (Doubly linked list)
 *
 * @author Raymond Degbe, raymond.degbe.05@gmail.com
 */
package main.java.com.raymond.algorithms.datastructures.queue;
import java.util.LinkedList;

public class LinkedQueue<T> implements Iterable<T>, Queue<T> {

  private LinkedList<T> list = new LinkedList<T>();

  public LinkedQueue() {}

  public LinkedQueue(T firstElem) {
    offer(firstElem);
  }

  // Return the size of the queue
  public int size() {
    return list.size();
  }

  // Returns whether the queue is empty  or not
  public boolean isEmpty() {
    return size() == 0;
  }

  // Peek the element at the front of the queue
  // The method throws an error is the queue is empty
  public T peek() {
    if (isEmpty()) throw new RuntimeException("Queue Empty");
    return list.peekFirst();
  }

  // Poll an element from the front of the queue
  // The method throws an error is the queue is empty
  public T poll() {
    if (isEmpty()) throw new RuntimeException("Queue Empty");
    return list.removeFirst();
  }

  // Add an element to the back of the queue
  public void offer(T elem) {
    list.addLast(elem);
  }

  // Return an iterator to allow the user to traverse
  // through the elements found inside the queue
  @Override
  public java.util.Iterator<T> iterator() {
    return list.iterator();
  }
}
