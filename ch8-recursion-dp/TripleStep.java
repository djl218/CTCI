import java.util.Arrays;

class TripleStep {
    public int countWays1(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return countWays1(n-1) + countWays1(n-2) + countWays1(n-3);
        }
    }

    public int countWays2(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return countWays2(n, memo);
    }

    int countWays2(int n, int[] memo) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (memo[n] > -1) {
            return memo[n];
        } else {
            memo[n] = countWays2(n - 1, memo) + countWays2(n - 2, memo) + countWays2(n - 3, memo);
            return memo[n];
        }
    }
}