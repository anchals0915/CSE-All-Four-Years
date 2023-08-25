
#   EXPERIMENT 3 - Merge Sort
##  Program Statement
Sort a given set of n integer elements using Merge Sort method and compute its time complexity. Run the program for
varied values of n> 5000, and record the time taken to sort. Plot a graph of the time taken versus n. The elements can be
read from a file or can be generated using the random number generator. Demonstrate using C++/Java how the divideand-conquer method works along with its time complexity analysis: worst case, average case and best case.


###  Concept

Merge sort is a perfect example of a successful application of the divide-and-conquer technique.
+   Split array A[1..n] in two and make copies of each half in arrays B[1.. n/2 ] and C[1.. n/2 ]
+   Sort arrays B and C
+   Merge sorted arrays B and C into array A as follows:
    
    a) Repeat the following until no elements remain in one of the arrays:
        
        i) compare the first elements in the remaining unprocessed portions of the arrays
        
        ii) copy the smaller of the two into A, while incrementing the index indicating the unprocessed portion of that array
    
    b) Once all elements in one of the arrays are processed, copy the remaining unprocessed elements from the
other array into A.

###   Algorithm 
    MergeSort (A [0...n-1])
    //This algorithm sorts array A [0...n-1] by recursive mergesort. //Input: An
    array A [0...n-1] of orderable elements.
    //Output: Array A [0...n-1] sorted in non-decreasing order
    { 
        if n>1
        { 
            Copy A [0…└n/2┘-1] to B [0…└n/2┘-1] 
            Copy A [└n/2┘… n-1] to C [0…┌n/2┐-1] 
            MergeSort (B [0…└n/2┘-1])
            MergeSort (C [0…┌n/2┐-1]) 
            Merge (B, C,A)
        }
    }
    
    
###   Algorithm: 
    Merge (B [0…p-1], C [0...q-1], A [0...p+q-1]) 
    //Merges two  sorted arrays into one sorted array.
    //Input: Arrays B [0…p-1] and C [0...q-1] both sorted. 
    //Output: Sorted array  A [0...p+q-1] of the elements of B and C.
    {
        i ← 0; j←0; k←0 while i<p and j<q
        do
        {
            if B[i] <= C[j]
            A[k] ← B[i]; i← i+1
            else
            A[k] ← C[j]; j← j+1 k ← k+1
        }
        if i=p
            copy C [j…q-1] to A[k…p+q-1]
        else
            copy B [i…p-1] to A[k…p+q-1]
    }

###  Time Complexity :
| Case          | Time Complexity   | Description                                      | Example Scenario                  |
|---------------|-------------------|--------------------------------------------------|-----------------------------------|
| Best Case     | O(n log n)        | Occurs when the array is already sorted.        | Array is sorted in ascending order. |
| Worst Case    | O(n log n)        | Same as best case, as Merge Sort's worst case is still efficient. | Array is sorted in any order. |
| Average Case  | O(n log n)        | Random permutations of the array.               | Array elements are randomly ordered. |


###  Space Complexity :
| Case          | Space Complexity  | Description                                      |
|---------------|-------------------|--------------------------------------------------|
| Worst Case    | O(n)              | Merge Sort requires extra space for temporary arrays during the merging process. |
| Best and Average Case | O(n)              | The space complexity remains the same in most cases. |

### Program
### Output


