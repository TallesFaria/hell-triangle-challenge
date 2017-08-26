# Hell-Triangle-Challenge

Given a triangle of numbers, find the maximum total from top to bottom

Example:

6
3 5
9 7 1
4 6 8 4 

In this triangle the maximum total is 6 + 5 + 7 + 8 = 26. An element can only be summed with one of the two nearest elements in the next row so the element 3 in row 2 can be summed with 9 and 7, but not with 1.

Choose the programming language you want... let us know about why is that your choice, besides the solution itself, write an automated test for your code (using a known framework or just another function/method)

Your code will receive an (multidimensional) array as input. The triangle from above would be:

example = [[6],[3,5],[9,7,1],[4,6,8,4]]

We are interested in your solution considering:

1. Correctness;
2. Readability;
3. The automated test;
4. Execution time;

# Solution

Dynamic Programming – The Algorithm
We can make a short-cut with the algorithm, as we don’t have to break the problem into sub-problems, but can start from the bottom and work the way up through the triangle until we reach the top and the algorithm spits out a number.

We start with a triangle that looks like

3
7 4
2 4 6
8 5 9 3

Applying the algorithm to the small problem we will need three iterations. The first iteration we apply the rule a + max(b,c) which creates a new triangle which looks as

3
7 4
10 13 15

Making the second iteration of the algorithm makes the triangle look

3
20 19

And if we run the algorithm once more, the triangle collapses to one number – 23 – which is the answer to the question.

http://www.mathblog.dk/project-euler-18/