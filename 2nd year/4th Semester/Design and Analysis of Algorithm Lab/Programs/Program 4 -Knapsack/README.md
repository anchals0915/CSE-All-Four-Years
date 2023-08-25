

#   EXPERIMENT 4  - To solve Knapsack problem using Greedy method.
##  Program Statement
Implement in Java, the Fractional Knapsack problem using Greedy method

###  Concept
+   Greedy Solution to the Fractional Knapsack Problem
+   The basic idea of greedy approach is to calculate the ratio value/weight for each item and sort the item on basis of this ratio. 
+   Then take the item with highest ratio and add them until we can’t add the next item as whole and at
the end add the next item as much as we can. 
+   This will always be optimal solution of this problem.


###   Algorithm 
    Assume knapsack holds weight W and items have value vi and weight wi <br>
    Rank items by value/weight ratio: vi / wi
           Thus: vi / wi ≥ vj / wj, for all i ≤ j  
    Consider items in order of decreasing ratio
    Take as much of each item as possible


###  Time Complexity :

The time complexity of the Fractional Knapsack problem using the Greedy method is generally dominated by the sorting step. 

If sorting is performed using a fast sorting algorithm, the time complexity is often dominated by the sorting step, which is O(n log n), where n is the number of items.



| Time Complexity   | Description                                      |
|-------------------|--------------------------------------------------|
| O(n log n)        | Dominated by the sorting step.                  |

###  Space Complexity :
The space complexity of the Fractional Knapsack problem using the Greedy method depends on the data structures used for sorting and storing intermediate values. 

Typically, the space complexity is O(n), where n is the number of items, due to the need to store the value-to-weight ratios and other data structures during the sorting and selection process.

| Space Complexity  | Description                                      |
|-------------------|--------------------------------------------------|
| O(n)              | Due to the need to store intermediate values and data structures. |

### Program
### Output


