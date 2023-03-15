public class Main {
  public static void main(String[] args) {
    CleanedSolution solution = new CleanedSolution();
    System.out.println(solution.isValid("()"));
    System.out.println(solution.isValid("[]"));
    System.out.println(solution.isValid("[][]"));
    System.out.println(solution.isValid("["));
    System.out.println(solution.isValid("[()]"));
    System.out.println(solution.isValid("[()]{}"));
    System.out.println(solution.isValid("[()]{]"));
  }

}
