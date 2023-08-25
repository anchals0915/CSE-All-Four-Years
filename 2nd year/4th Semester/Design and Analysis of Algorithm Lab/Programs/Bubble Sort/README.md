# Bubble Sort

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

## Working of Algorithm

1. Start from the beginning of the list.
2. Compare the first two elements.
   - If the first element is greater than the second element, swap them.
3. Move to the next pair of elements and repeat step 2.
4. Continue this process until the end of the list.
5. The largest element will "bubble up" to the end of the list in the first pass.
6. Repeat the above steps for the remaining elements, excluding the last sorted element.
7. Continue this process until the entire list is sorted.

## Algorithm


    BubbleSort(list)
       for i from 0 to list.length - 1
          for j from 0 to list.length - i - 1
             if list[j] > list[j+1]
                swap(list[j], list[j+1]) 
    

## Time Complexity
| Case              | Time Complexity   | Description                                      |
|-------------------|-------------------|--------------------------------------------------|
| Best Case         | O(n)              | Occurs when the array is already sorted.        |
| Worst Case        | O(n^2)            | Occurs when the array is in reverse order.      |
| Average Case      | O(n^2)            | Random permutations of the array.               |

## Space Complexity
| Space Complexity  | Description                                      |
|-------------------|--------------------------------------------------|
| O(1)              | Bubble Sort uses only a constant amount of extra space for temporary variables. |

