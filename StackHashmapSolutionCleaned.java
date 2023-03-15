import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
// Note: Java has a "util" package, which is counter to the ideal of clean coding.
// Don't do like Java. The package should be named with more detail, like "collections"

// Taken from
// https://github.com/neetcode-gh/leetcode/blob/main/java/0020-valid-parentheses.java

class CleanedSolution {

  public boolean isValid(String stringToValidate) {

    // Code is implementing the pseudocode in the README.md file.

    Stack<Character> brackets = new Stack<>();

    Map<Character, Character> closingBracketToOpening = new HashMap<>();

    closingBracketToOpening.put(')', '(');
    closingBracketToOpening.put('}', '{');
    closingBracketToOpening.put(']', '[');

    for (char character : stringToValidate.toCharArray()) {

      // push an opening bracket to the stack
      if (!closingBracketToOpening.containsKey(character)) {
        brackets.push(character);
        continue;
      }

      // closing bracket cannot be paired
      if (brackets.size() == 0)
        return false;

      char lastOpeningBracket = brackets.pop();
      if (lastOpeningBracket != closingBracketToOpening.get(character))
        return false;

    }

    if (brackets.size() == 0)
      return true;

    return false;
  }
}