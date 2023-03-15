public class Main {
  public static void main(String[] args) {
    CleanedSolution solution = new CleanedSolution();
    assert solution.isValid("()") == true;
    assert solution.isValid("[]") == true;
    assert solution.isValid("[][]") == true;
    assert solution.isValid("[") == false;
    assert solution.isValid("[()]") == true;
    assert solution.isValid("[()]{}") == true;
    assert solution.isValid("[()]{]") == false;
  }

}
