
#   EXPERIMENT 1 - Selection Sort

##  Program Statement
Sort a given set of n integer elements using Selection Sort method and compute its time complexity. Run the program
for varied values of n>5000 and record the time taken to sort. Plot a graph of the time taken versus n. The elements can
be read from a file or can be generated using the random number generator. Demonstrate using Java how brute force
method works along with its time complexity analysis: worst case, average case and best case.

###  Concept
+ Selection sort is a sorting algorithm that selects the smallest element in the array and swaps with the first element of
the array. 
+ Next, the second smallest element in the array is exchanged with the second element and vice versa. 
+ This way the smallest element in the array is selected repeatedly and put in its proper position until the entire array is sorted.

Two sub-array are maintained:
    1.  Sorted: 
        In every iteration, the minimum element is found and placed in its peoper position. This sub-array is
sorted.
    2.  Unsorted: 
        Rest of the elements in the array which are not sorted yet.

It is a easy and straightforward sorting technique which find the smallest element in every pass and places it in correct
position. However, this technique is not suggested for larger lists of data.

### Example:
> #### Initial Array:
> 21 14 9 12 3
> 
> #### Pass 1:
> - Compare Min (initially 21) with the second element (14).
> - Since 21 > 14, swap them. Min is now 14.
> - Compare Min (now 14) with the third element (9).
> - Since 14 > 9, swap them. Min is now 9.
> - Compare Min (now 9) with the fourth element (12).
> - Since 9 < 12, no swap is needed.
> - Compare Min (still 9) with the fifth element (3).
> - Since 9 > 3, swap them. Min is now 3.
> - Pass 1 complete.
> 
> #### Array after Pass 1:
> 3 14 9 12 21
> 
> #### Pass 2:
> - Start with the second unsorted element (14).
> - Compare Min (initially 14) with the third element (9).
> - Since 14 > 9, swap them. Min is now 9.
> - Compare Min (now 9) with the fourth element (12).
> - Since 9 < 12, no swap is needed.
> - Compare Min (still 9) with the fifth element (21).
> - Since 9 < 21, no swap is needed.
> - Pass 2 complete.
> 
> #### Array after Pass 2:
> 3 9 14 12 21
> 
> #### Pass 3:
> - Start with the third unsorted element (14).
> - Compare Min (initially 14) with the fourth element (12).
> - Since 14 > 12, swap them. Min is now 12.
> - Compare Min (now 12) with the fifth element (21).
> - Since 12 < 21, no swap is needed.
> - Pass 3 complete.
> 
> #### Array after Pass 3:
> 3 9 12 14 21
> 
> #### Pass 4:
> - Start with the fourth unsorted element (14).
> - Compare Min (initially 14) with the fifth element (21).
> - Since 14 < 21, no swap is needed.
> - Pass 4 complete.
> 
> #### Array after Pass 4:
> 3 9 12 14 21
> 


###   Algorithm 
    Selection_sort (Array, size)
        repeat ( size-1) times
        set the first unsorted element as the Min
        for each of the unsorted elements
        if element < current_min
        set element as new Min
        swap Min with first unsorted position
    End Selection_sort
###  Time Complexity :
Number of Comparisons: (n-1) + (n-2) + (n-3) + … + 1 = n(n-1) / 2
 Therefore, Complexity = O(n2)
 
| Case          | Time Complexity   | Description                                      | Example Scenario                  |
|---------------|-------------------|--------------------------------------------------|-----------------------------------|
| Best Case     | O(n^2)            | Occurs when the array is already sorted.        | Array is sorted in ascending order. |
| Worst Case    | O(n^2)            | Occurs when the array is sorted in reverse order. | Array is sorted in descending order. |
| Average Case  | O(n^2)            | Random permutations of the array.               | Array elements are randomly ordered. |


###  Space Complexity :
    O(1) : because an extra variable temp is used.
| Case          | Space Complexity  | Description                                      |
|---------------|-------------------|--------------------------------------------------|
| Worst Case    | O(1)              | Selection Sort uses a constant amount of extra space. |


### Program
### Output


