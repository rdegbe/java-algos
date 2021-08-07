/**
 * An implementation of finding the GCD of two numbers
 *
 * <p>Time Complexity ~O(log(a + b))
 *
 */
package main.java.com.raymond.algorithms.math;

public class GCD {

  // Computes the Greatest Common Divisor (GCD) of a & b
  // This method ensures that the value returned is non negative
  public static long gcd(long a, long b) {
    return b == 0 ? (a < 0 ? -a : a) : gcd(b, a % b);
  }

  public static void main(String[] args) {
    System.out.println(gcd(12, 18)); // 6
    System.out.println(gcd(-12, 18)); // 6
    System.out.println(gcd(12, -18)); // 6
    System.out.println(gcd(-12, -18)); // 6

    System.out.println(gcd(5, 0)); // 5
    System.out.println(gcd(0, 5)); // 5
    System.out.println(gcd(-5, 0)); // 5
    System.out.println(gcd(0, -5)); // 5
    System.out.println(gcd(0, 0)); // 0
  }
}
