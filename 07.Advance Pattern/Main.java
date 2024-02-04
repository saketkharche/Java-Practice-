import java.util.*;

class Main {

  public static void main(String[] args) {
    
    // Test case 1
    int n = 3;
    int m = 3;
    int k = 1;
    int[][] profit = {{1, 3, 1}, {2, 1, 3}, {1, 1, 4}};
    System.out.println(getMaxProfit(profit, n, m, k)); // 8
    
    // Test case 2    
    n = 5;
    m = 5; 
    k = 3;
    profit = new int[][]{{1, 3, 1, 2, 4}, 
                         {2, 1, 3, 2, 1},
                         {1, 5, 4, 3, 2},
                         {2, 3, 4, 1, 3},
                         {3, 4, 3, 2, 1}};
    System.out.println(getMaxProfit(profit, n, m, k)); // 19

  }

 public static long getMaxProfit(int[][] profit, int n, int m, int k) {
  long[][][] dp = new long[k+1][n+1][m+1];
  for (int p = 1; p <= k; p++) {
    for (int j = 1; j <= n; j++) {
      for (int i = 1; i <= m; i++) {
        dp[p][j][i] = Math.max(dp[p][j][i-1], dp[p][j-1][i]);
        if (j >= p) {
          dp[p][j][i] = Math.max(dp[p][j][i], dp[p-1][j-p][i-1] + profit[i-1][j-p]);
        }
      }
    }
  }
  return dp[k][n][m];
}

}