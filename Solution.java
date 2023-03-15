import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
// Note: Java has a "util" package, which is counter to the ideal of clean coding.
// Don't do like Java. The package should be named with more detail, like "collections"

// Taken from
// https://github.com/neetcode-gh/leetcode/blob/main/java/0020-valid-parentheses.java

class Solution {
  public boolean isValid(String s) {
    Stack<Character> brackets = new Stack<>();
    Map<Character, Character> bracketLookup = new HashMap<>();

    bracketLookup.put(')', '(');
    bracketLookup.put('}', '{');
    bracketLookup.put(']', '[');

    for (char c : s.toCharArray()) {
      if (bracketLookup.containsKey(c)) {
        if (brackets.size() != 0 && brackets.peek() == bracketLookup.get(c)) {
          brackets.pop();
        } else {
          return false;
        }
      } else {
        brackets.push(c);
      }
    }

    if (brackets.size() == 0)
      return true;
    return false;
  }
}