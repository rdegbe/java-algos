/**
 * This file has an implementation of an integer specific stack which is extremely fast and lightweight.
 * To the furthest extent that it's execution time can outmaneuver java.util.ArrayDeque (Java's fastest stack
 * implementation) by a factor of more than 45x! You can confirm it from the benchmark test. Regardless, the
 * disadvantage is you need to understand an upper bound on the amount of segments that will be inside the
 * stack at any given time for it to work precisely.
 *
 * @author Raymond Degbe, raymond.degbe.05@gmail.com
 */
package main.java.com.raymond.algorithms.datastructures.stack;

public class IntegerStack implements Stack<Integer> {

  private int[] arr;
  private int pos = 0;

  // maxSize is the maximum number of items
  // that can be in the queue at any given time
  public IntegerStack(int maxSize) {
    arr = new int[maxSize];
  }

  // Returns the number of elements insize the stack
  public int size() {
    return pos;
  }

  // Returns true/false on whether the stack is empty
  public boolean isEmpty() {
    return pos == 0;
  }

  // Returns the element at the top of the stack
  @Override
  public Integer peek() {
    return arr[pos - 1];
  }

  // Add an element to the top of the stack
  @Override
  public void push(Integer value) {
    arr[pos++] = value;
  }

  // Make sure you check that the stack is not empty before calling pop!
  @Override
  public Integer pop() {
    return arr[--pos];
  }

  // Example usage
  public static void main(String[] args) {

    IntegerStack stk = new IntegerStack(5);

    stk.push(1);
    stk.push(2);
    stk.push(3);
    stk.push(4);
    stk.push(5);

    System.out.println(stk.pop()); // 5
    System.out.println(stk.pop()); // 4
    System.out.println(stk.pop()); // 3

    stk.push(3);
    stk.push(4);
    stk.push(5);

    while (!stk.isEmpty()) System.out.println(stk.pop());

    benchMarkTest();
  }

  // BenchMark IntStack vs ArrayDeque.
  private static void benchMarkTest() {

    int n = 10000000;
    IntegerStack intStack = new IntegerStack(n);

    // IntStack times at around 0.0324 seconds
    long start = System.nanoTime();
    for (int i = 0; i < n; i++) intStack.push(i);
    for (int i = 0; i < n; i++) intStack.pop();
    long end = System.nanoTime();
    System.out.println("IntStack Time: " + (end - start) / 1e9);

    // ArrayDeque times at around 1.438 seconds
    /**
     * java.util.ArrayDeque<Integer> arrayDeque = new java.util.ArrayDeque<>();
     * java.util.Stack<Integer> arrayDeque = new java.util.Stack<>();
    */
     java.util.ArrayDeque<Integer> arrayDeque = new java.util.ArrayDeque<>(n); // strangely the

     // ArrayQueue is slower when you give it an initial capacity.

    start = System.nanoTime();
    for (int i = 0; i < n; i++) arrayDeque.push(i);
    for (int i = 0; i < n; i++) arrayDeque.pop();
    end = System.nanoTime();
    System.out.println("ArrayDeque Time: " + (end - start) / 1e9);

    Stack<Integer> listStack = new ListStack<>();

    start = System.nanoTime();
    for (int i = 0; i < n; i++) listStack.push(i);
    for (int i = 0; i < n; i++) listStack.pop();
    end = System.nanoTime();
    System.out.println("ListStack Time: " + (end - start) / 1e9);

    Stack<Integer> arrayStack = new ArrayStack<>();

    start = System.nanoTime();
    for (int i = 0; i < n; i++) arrayStack.push(i);
    for (int i = 0; i < n; i++) arrayStack.pop();
    end = System.nanoTime();
    System.out.println("ArrayStack Time: " + (end - start) / 1e9);
  }
}
