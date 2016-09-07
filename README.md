# StackWithMin
Design a stack that executes pop, push and return min at O(1) time

Two Methods:

1. Create a local value min to store the current min value, push x-min into stack, pop x+min from stack, 
  check min value every time push and pop, update the min value when necessary

2. Create another stack to push the min value into it, do normal push and pop
  if push a value smaller than the current min, push this value into s2
  if pop a value that is equal to the current min, pop s2

