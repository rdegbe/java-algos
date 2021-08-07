/**
 * An implementation of finding the LCM of two numbers
 *
 * <p>Time Complexity ~O(log(a + b))
 *
 */
package main.java.com.raymond.algorithms.math;

public class LCM {

  // Finds the greatest common divisor of a and b
  private static long gcd(long a, long b) {
    return b == 0 ? (a < 0 ? -a : a) : gcd(b, a % b);
  }

  // Finds the least common multiple of a and b
  public static long lcm(long a, long b) {
    long lcm = (a / gcd(a, b)) * b;
    return lcm > 0 ? lcm : -lcm;
  }

  public static void main(String[] args) {
    System.out.println(lcm(12, 18)); // 36
    System.out.println(lcm(-12, 18)); // 36
    System.out.println(lcm(12, -18)); // 36
    System.out.println(lcm(-12, -18)); // 36
  }
}
