package com.raymond.algorithms.datastructures.queue;

/**
 * @author Raymond Degbe, raymond.degbe.05@gmail.com
 *
 * @param <T> the type of element held int the queue
 */
public interface Queue<T> {
  public void offer(T elem);

  public T poll();

  public T peek();

  public int size();

  public boolean isEmpty();
}
