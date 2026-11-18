# Data Structures and Algorithms in Java

A collection of Java examples covering core programming concepts, data structures, algorithms, and problem-solving patterns.

Each example is kept in a topic-specific directory and is intended to demonstrate a concept or solve a small programming problem.

## Topics

| Directory | Content |
| --- | --- |
| `arrays/` | Array operations and array-based problems |
| `binarysearch/` | Binary search implementation |
| `collections/` | ArrayList, LinkedList, Stack, Queue, HashMap, and HashSet |
| `ifelse/` | Conditional statements and control flow |
| `linkedlist/` | Singly linked lists and linked-list exercises |
| `loops/` | `for` loops, `while` loops, and number patterns |
| `mapsandsets/` | HashMap, HashSet, hashing, and pair/subsequence problems |
| `methods/` | Method syntax, parameters, return values, and overloads |
| `oops/` | Classes, inheritance, polymorphism, abstraction, and interfaces |
| `patterns/` | Star, number, and alphabet patterns |
| `recursions/` | Recursion-based examples and problems |
| `sorting/` | Bubble, selection, and insertion sort algorithms |
| `stack/` | Stack operations and stack problems |
| `strings/` | String operations and string-based problems |

## Prerequisites

- Java Development Kit (JDK) 8 or later
- A Java IDE or a terminal

Check whether Java is installed:

```bash
java -version
javac -version
```

## Running an Example

The files use Java packages. Compile and run a class from the repository root using its fully qualified class name.

```bash
javac arrays/TwoSum.java
java arrays.TwoSum
```

To compile every Java source file, run this from the repository root in a Unix shell such as bash or zsh. The root is required so the package names resolve.

```bash
javac $(find . -name "*.java")
```
