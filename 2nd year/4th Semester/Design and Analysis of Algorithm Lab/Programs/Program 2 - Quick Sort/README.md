
#   EXPERIMENT 2 - Quick Sort

##  Program Statement
Sort a given set of n integer elements using Quick Sort method and compute its time complexity. Run the
program for varied values of n > 5000 and record the time taken to sort. Plot a graph of the time taken versus n
on graph sheet. The elements can be read from a file or can be generated using the random number generator.
Demonstrate using Java how the divide-and-conquer method works along with its time complexity analysis:
worst case, average case and best case

###  Concept
Divide and Conquer: 
+ In divide and conquer approach, the problem in hand, is divided into smaller subproblems and then each problem is solved independently. 
+ When we keep on dividing the subproblems into even smaller sub-problems, we may eventually reach a stage where no more division is possible. 
+ Those "atomic" smallest possible sub-problem (fractions) are solved. The solution of all sub-problems is finally merged in order to obtain the solution of an original problem.

Broadly, we can understand divide-and-conquer approach in a three-step process.

+   Divide/Break: 
    
    This step involves breaking the problem into smaller sub-problems. Sub-problems should represent a part of the original problem. This step generally takes a recursive approach to divide the problem until no sub-problem is further divisible. At this stage, sub-problems become atomic in nature but still represent some part of the actual problem.

+   Conquer/Solve: 

    This step receives a lot of smaller sub-problems to be solved. Generally, at this level, the problems are considered 'solved' on their own.
    
+   Merge/Combine: 

    When the smaller sub-problems are solved, this stage recursively combines them until they formulate a solution of the original problem. This algorithmic approach works recursively and conquer & merge steps works so close that they appear as one.

The following computer algorithms are based on divide-and-conquer programming approach −
+   Merge Sort
+ Quick Sort

## Quick Sort Method:
### Quick Sort Partitioning Process:

Quick Sort is a divide-and-conquer sorting algorithm that operates by selecting a "pivot" element from the array and rearranging the other elements such that elements smaller than the pivot are on the left, and elements greater than the pivot are on the right. This creates a partitioning effect.

Consider an array A[0..n-1] and a pivot element A[s] at index s:

Before Partitioning:
A[0]...A[s-1]   A[s]   A[s+1]...A[n-1]
All elements to the left of A[s] are smaller than or equal to A[s].
All elements to the right of A[s] are greater than or equal to A[s].

### Partitioning Process:

1. Choose a pivot element (A[s]) from the array.
2. Initialize two pointers, i and j, where i starts at the first element (A[0]) and j starts at the last element (A[n-1]).
3. Move pointer i to the right until A[i] becomes greater than A[s].
4. Move pointer j to the left until A[j] becomes smaller than A[s].
5. Swap elements A[i] and A[j] if i is less than or equal to j.
6. Repeat steps 3-5 until i is greater than j.
7. Swap the pivot element A[s] with element A[j], placing the pivot in its correct position.

After Partitioning:
A[0]...A[j-1]   A[j]   A[j+1]...A[n-1]
All elements to the left of A[j] are smaller than or equal to A[j].
All elements to the right of A[j] are greater than or equal to A[j].

The pivot A[s] is now in its sorted position in the array.

### Recursive Step:

Once the pivot is placed in its sorted position, the algorithm recursively applies the partitioning process to the subarrays on the left and right of the pivot until the entire array is sorted.

This divide-and-conquer approach efficiently sorts the array by repeatedly partitioning it into smaller subarrays and sorting them.



###   Algorithm 
    QUICKSORT(a[l..r]) //Sorts a subarray by quicksort
    //Input: A subarray A[l..r] of A[0..n-1],defined by its left and right indices l and r
    //Output: SubarrayA[l..r] sorted in nondecreasing order
    {
        if l<r
        {
            s← Partition(A[l..r]) //s is a split position
            QUICKSORT(A[l..s1])
            QUICKSORT(A[s+1..r])
        }
    }

###   Algorithm 
    Partition(A[l..r])
    //Partition a subarray by using its first element as its pivot
    //Input:A subarray A[l..r] of A[0..n-1],defined by its left and right indices l and r (l<r)
    //Output:Apartition of A[l..r],with the split position returned as this function’s value
    {
        p ← A[l]
        i ← l; j ← r+1 repeat
        {
        repeat i ← i+1 until A[i] >=p
        repeat j ← j-1 until A[j] <=p swap(A[i],A[j])
    } until i>=j
    
        swap(A[i],A[j]) // undo last swap when i>=j

        swap(A[l],A[j])
            return j
    }

###  Time Complexity :

Cbest (n) =2 Cbest (n/2) +n for n>1 Cbest (1)=0Cworst (n) (n2)
Cavg (n) ≈ 1.38nlog2n

| Case          | Time Complexity                     | Description                                      | Example Scenario                  |
|---------------|-------------------------------------|--------------------------------------------------|-----------------------------------|
| Best Case     | O(n log n)                          | Occurs when the pivot selection leads to nearly balanced partitioning. | Pivot consistently divides array into two almost equal halves. |
| Worst Case    | O(n^2)                              | Occurs when the pivot selection is poor, leading to unbalanced partitioning. | Array is already sorted or pivot consistently chosen at the end. |
| Average Case  | O(n log n)                          | Random permutations of the array with balanced partitioning. | Pivot selection results in relatively balanced partitions. |


###  Space Complexity :
| Case          | Space Complexity                      | Description                                      |
|---------------|--------------------------------------|--------------------------------------------------|
| Worst Case    | O(n)                                 | Quick Sort can use a lot of extra space in worst-case scenarios due to the recursive call stack. |
| Best and Average Case | O(log n) to O(n) (depends on implementation) | The space complexity can vary based on the implementation and pivot selection. |


### Program
### Output



