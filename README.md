# array
# Write a Java program to declare an integer array of size N. 

The array size must be taken from the user. Assign the elements in the array between 1 and 100 using the nextInt(n) method of the java.util.Random class, which returns a random number between 0 and n−1 inclusive. Write a Java method that passes the array as argument and randomly selects the array index and removes the element from that cell until the array holds no more elements. Use the nextInt(N) method to randomly selects the array index (which is between 0 and N-1). Do not use any array-related in-built Java classes and methods. You can use the Scanner class to take input from the user. The sample input/ output is given below: (20 points)
Sample input/ output:
(The sample input/ output may differ during actual execution. User’s input is shown in bold)
Enter the size of the array: 5
The array elements after random insertion: 14 1 90 1 28
Deleting element from index 4: 28
Deleting element from index 3: 1
Deleting element from index 4: The cell is empty
Deleting element from index 0: 14
Deleting element from index 3: The cell is empty
Deleting element from index 4: The cell is empty
Deleting element from index 2: 90
Deleting element from index 0: The cell is empty
Deleting element from index 1: 1
The array is empty!


