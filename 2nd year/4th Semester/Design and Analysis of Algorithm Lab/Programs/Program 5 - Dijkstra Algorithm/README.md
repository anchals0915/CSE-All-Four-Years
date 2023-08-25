
#   EXPERIMENT 5

##  Program Statement
From a given vertex in weighted connected graph, find shortest path to other vertices using Dijkstras algorithm.
Write the program in java.

###  Concept
It is a greedy algorithm which finds the shortest path from the source vertex to all other vertices of the graph.
Steps

1. Input a cost matrix for graph. Read the source vertex and n from user

2. Create the array d [1…n] which stores the distance from source vertex to all other vertices of graph. <br>
Initialize distance to source vertex as 0(i.e. d [source] =0) and remaining vertices as 999.

3. Create the array visited [1…n] which keeps track of all the visited nodes.<br>
Visit the source vertex and initialize visited [source] =1.

4. For all adjacent vertices[vi,vi+1,…] for source vertex calculate distance using formula<br> `d[vi]=min(d[vi], d[source]+ cost[source][v1])` <br>
Update the array `d [1…n]`.

5. For all adjacent vertices find vertex vi which has minimum distance from source vertex.

6. Initialize  `source = vi` . <br>
    Repeat the steps 4, 5 until there all some vertices which are unvisited.

7. Stop

###   Algorithm 
###  Time Complexity :
###  Space Complexity :
### Program
### Output




#   EXPERIMENT 6

##  Program Statement
Find Minimum Cost Spanning Tree of a given connected undirected graph using Kruskal’s algorithm.
Implement the program in Java. Use Union-Find algorithm in your program.

###  Concept
A spanning tree is a subset of Graph G, which has all the vertices covered with minimum possible
number of edges. Hence, a spanning tree does not have cycles and it cannot be disconnected.

By this definition, we can draw a conclusion that every connected and undirected Graph G has at least one
spanning tree. A disconnected graph does not have any spanning tree, as it cannot be spanned to all its vertices.

We found three spanning trees off one complete graph. A complete undirected graph can have maximum
n
n-2 number of spanning trees, where n is the number of nodes. In the above addressed example, 3
3−2 = 3
spanning trees are possible.



###   Algorithm 
###  Time Complexity :
###  Space Complexity :
### Program
### Output




#   EXPERIMENT 7

##  Program Statement
Implement in Java, the 0/1 Knapsack problem using Dynamic Programming method
###  Concept
###   Algorithm 
###  Time Complexity :
###  Space Complexity :
### Program
### Output



#   EXPERIMENT 8

##  Program Statement

###  Concept
###   Algorithm 
###  Time Complexity :
###  Space Complexity :
### Program
### Output




#   EXPERIMENT 9

##  Program Statement
###  Concept
###   Algorithm 
###  Time Complexity :
###  Space Complexity :
### Program
### Output


