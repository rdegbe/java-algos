// Simple interface for MinimumWeightPerfectMatching (MWPM) solutions to simplify testing.

package main.java.com.raymond.algorithms.dp;

public interface MwpmInterface {
  public double getMinWeightCost();

  public int[] getMatching();
}
