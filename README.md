# Clean Coding Example: Valid Parentheses
"Valid parentheses" is a popular problem in coding interviews that aims to test your knowledge of programming and data structures. It is found on [Leetcode](https://leetcode.com/problems/valid-parentheses/). You can solve the problem in any programming language you want. In this example, we will use Java to write clean code.

## Problem statement
Given a string `s` that only contains bracket characters `(`, `[`, `{`, `}`, `]`, and `)`, check whether the string `s` is made of only valid parenthesis. This means all brackets in `s` must be closed in the correct order, by its corresponding bracket shape. 

For example,
- `()` is valid
- `[()]` is also valid
- ` ` is valid
- `)` is not valid
- `[)` is not valid
- `[][][]{` is not valid

## Solution
I encourage you to think about solving this problem first, for at least 5-10 minutes. If you still don't know, check the solution.

Valid parentheses consist of always pairs of matching brackets. Each time you open a bracket, you expect a closing bracket somewhere down the string. Each time you encounter a closing bracket, the latest unmatched opening bracket must be matching this closing bracket's shape. If this condition fails, the string is not valid.

Looking back at the latest element is a feature found in **stacks**. The stack data structure emphasizes the pattern of last-in-first-out. This behavior fits our problem.

The pseudocode of the solution algorithm is the following.
1. Create an empty stack.
2. Iterate through the string `s`, character by character.
3. For each character representing an opening bracket of any shape, push it to the stack. Items on the stack will only contain opening brackets.
4. For each character representing a closing bracket of any shape, pop the latest item from the stack.
5. If the popped item doesn't have the same shape as the closing bracket, then return `false`.
6. When the iteration is done, check if the stack is empty. If so, return `true`. Otherwise, return `false`.

## The cleaning example
The file `Solution.java` contains a quickly written solution to the problem in Java. It has many areas for clean coding improvement. The improved code is found in `CleanedSolution.java`.

## Your turn
The file `StackOnlySolution` contains a more spaghetti code solution to the same problem. Clean this one as exercise.

## Compiling and running
To compile and run the code, simply clicking the play button is enough.

Alternatively, use the command line.
```bash
javac *.java
java Main
```
