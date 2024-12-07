# Off-by-One Error in Java Array
This example demonstrates a common yet subtle bug in Java: the off-by-one error when iterating over an array.

## The Bug
The `for` loop in `bug.java` iterates from `i = 0` to `i <= array.length`.  Since array indices are zero-based, the last valid index is `array.length - 1`. Accessing `array[array.length]` throws an `ArrayIndexOutOfBoundsException`.

## The Solution
The `bugSolution.java` file corrects the loop condition to `i < array.length`, ensuring that the loop terminates before attempting to access an invalid index.

This example highlights the importance of careful array index management in Java programming.