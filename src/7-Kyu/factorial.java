public class factorial {
  public int factorials(int n) {

    int sum = 1;

    if (n < 0 || n > 12) {
      throw new IllegalArgumentException();
    }

    for (int i = 1; i <= n; i++) {
      sum *= i;
    }

    return sum;
  }
}
