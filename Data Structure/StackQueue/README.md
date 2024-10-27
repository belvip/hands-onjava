# Stack Implementation Algorithm

## Initialize the stack:
1. Create an array to store the stack elements.
2. Define a variable `top` to keep track of the top of the stack, initialized to `-1` (indicating the stack is empty).

## Push operation:
1. Check if the stack is full by comparing `top` with the size of the array.
2. If the stack is not full:
   - Increment `top`.
   - Insert the element at the new top position.

## Pop operation:
1. Check if the stack is empty by checking if `top` is `-1`.
2. If the stack is not empty:
   - Return the element at the `top`.
   - Decrement `top`.

## Peek operation:
1. Return the top element of the stack without removing it.

## Check if the stack is empty:
1. Return `true` if `top` is `-1`, otherwise return `false`.

## Check if the stack is full:
1. Return `true` if `top` equals the size of the stack minus `1`, otherwise return `false`.



# Queue Implementation Algorithm

## Initialize the queue:
1. Create an array to store the queue elements.
2. Define two variables:
   - `front`: to keep track of the front of the queue, initialized to `-1` (indicating the queue is empty).
   - `rear`: to keep track of the rear of the queue, initialized to `-1`.

## Enqueue operation:
1. Check if the queue is full by comparing `rear` with the size of the array minus 1.
2. If the queue is not full:
   - If `front` is `-1` (the queue was empty), set `front` to `0`.
   - Increment `rear`.
   - Insert the element at the position `rear`.

## Dequeue operation:
1. Check if the queue is empty by checking if `front` is `-1`.
2. If the queue is not empty:
   - Store the element at the position `front` to return it.
   - If `front` equals `rear` (the last element is dequeued), set both `front` and `rear` to `-1` (the queue is now empty).
   - Otherwise, increment `front`.

## Peek operation:
1. Return the element at the `front` of the queue without removing it.

## Check if the queue is empty:
1. Return `true` if `front` is `-1`, otherwise return `false`.

## Check if the queue is full:
1. Return `true` if `rear` equals the size of the queue minus `1`, otherwise return `false`.

D:\Hands-on-Java