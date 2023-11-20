## G1B4 Group Assignment, DSA Graded Project 2

### Question 1                                                                                                             MARKS : 20

Your friend is a chief architect, who is working on building a skyscraper, in Mumbai. The construction is in such a way that the floors will be constructed in other factories and they will be assembled. All the sizes will be distinct.<br>
The skyscraper needs to be constructed in N days with the following conditions :

⦁ Every day a floor is constructed in a separate factory of distinct size.<br>
⦁ The floor with the larger size must be placed at the bottom of the building.<br>
⦁ The floor with the smaller size must be placed at the top of the building.<br>

Note: A floor cannot be assembled in the building until all floors larger in size are placed.<br>
As a friend he wants you to build a small program that will help him analyze the construction process, to avoid manual work and errors.

#### Input

First Line: contains the total floors N in the building<br>
Second Line onwards: Contains N inputs in which the ith integer denotes the size of the floor that will be given to architect by factories on the ith day.<br>

#### Output

You are required to print N lines. Print the size of the floor in descending order, which can be assembled.<br>
If no floor can be assembled on the ith day, leave the line empty.<br>

#### Sample Test Cases

**TestCase 1**

enter the total no of floors in the building<br>
3<br>
enter the floor size given on day : 1<br>
3<br>
enter the floor size given on day : 2<br>
1<br>
enter the floor size given on day : 3<br>
2<br>

The order of construction is as follows

Day: 1<br>
3<br>
Day: 2<br>

Day: 3<br>
2 1

**Explanation**

The largest floor size is available on day 1 itself, hence it will be assembled on day 1.<br>
On the second day floor of size 1 is available and cannot be assembled as the floor of size 2 is not available.<br>
On the third day floor of size 2 is available and accordingly, the remaining floor (2,1) will assemble in the order 2,1<br>

**TestCase 2**

enter the total no of floors in the building<br>
5<br>
enter the floor size given on day : 1<br>
4<br>
enter the floor size given on day : 2<br>
5<br>
enter the floor size given on day : 3<br>
1<br>
enter the floor size given on day : 4<br>
2<br>
enter the floor size given on day : 5<br>
3<br>

The order of construction is as follows

Day: 1<br>

Day: 2<br>
5 4<br>
Day: 3<br>

Day: 4<br>

Day: 5<br>
3 2 1

**Explanation**

On the first day, the floor of size 4 is given. But it cannot be assembled as the floor of size 5 is still remaining.
On the second day, the floor of size 5 is given so now the floor of sizes 5 and 4 can be assembled
On the third and fourth days, floors cannot be assembled as the size of 3 needs to be given yet. Therefore, these lines are empty.
On the fifth day, all the floors of sizes 3, 2, and 1 can be placed.

**Test Case 3**

enter the total no of floors in the building<br>
10<br>
enter the floor size given on day : 1<br>
1<br>
enter the floor size given on day : 2<br>
2<br>
enter the floor size given on day : 3<br>
3<br>
enter the floor size given on day : 4<br>
8<br>
enter the floor size given on day : 5<br>
9<br>
enter the floor size given on day : 6<br>
10<br>
enter the floor size given on day : 7<br>
4<br>
enter the floor size given on day : 8<br>
5<br>
enter the floor size given on day : 9<br>
7<br>
enter the floor size given on day : 10<br>
6<br>

The order of construction is as follows

Day: 1<br>

Day: 2<br>

Day: 3<br>

Day: 4<br>

Day: 5<br>

Day: 6<br>
10 9 8<br>
Day: 7<br>

Day: 8<br>

Day: 9<br>
7<br>
Day: 10<br>
6 5 4 3 2 1

#### Instructions:

- You can use any inbuilt java function/s to implement the above functionalities
- You can choose any DataStructure(Stack, Queue, LinkedList) to implement the above functionality.

-------------------------------------------------------------------------------------------------------------------------

### Question 2                                                                                                          MARKS: 30

You are working in an MNC, which manages the Transactions, where only BST is used as a Data Structure. The company stores all the data of transactions in BST such that the tree is always a complete BST.<br>
A new business requirement has arrived where the BST should not contain any left node.<br>
You are required to modify the existing BST and display the node values present in ascending order.<br>

**Hint:** ( Convert the Binary Search Tree into a Skewed Tree).

         50                                             10
        /  \                                             \
      30    60             =>                            30
      /      \                                             \
    10        55                                           50
                                                             \
                                                             55
                                                               \
                                                               60

**Output**

10 30 50 55 60

#### Instructions:

You can hardcode the tree as follows

```java
Main tree = new Main();
tree.node = new Node(50);
tree.node.left = new Node(30);
tree.node.right = new Node(60);
tree.node.left.left = new Node(10);
tree.node.right.left= new Node(55);
