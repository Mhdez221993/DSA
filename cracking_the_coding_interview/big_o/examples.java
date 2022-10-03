// Example 1
// What is the runtime of the below code?
void foo(int[] array) {
  int sum = 0;
  int product = 1;
  for(int i = 0; i < array.length; i++) {
    sum += array[i];
  }
  for(int i = 0; i < array.length; i++) {
    product *= array[i];
  }
  System.out.println(sum + ", " + product);
}
// This will take O(N) time. The fact that we iterate through the array twice doesn't matter.

// Example 2
// What is the runtime of the below code?
void printPairs(int[] array) {
  for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array.length; j++) {
      System.out.println(array[i] + ", " + array[j]);
    }
  }
}
// The inner for loop has O ( N) iterations and it is called N times. Therefore, the runtime is O( N^2).

// Example 3
// This is very similar code to the above example, but now the inner for loop starts at i + 1.
void printUnorderedPairs(int[] array) {
  for (int i = 0; i < array.length; i++) {
    for (int j = i + 1; j < array.length; j++) {
      System.out.println(array[i] + ", " + array[j]);
    }
  }
}
// We know that the outer loop runs N time
// Since the inner loop does N/2 work on average and it is run N times, the total work is N^2/2 which is O(N^2)

// Example 4
// This is similar to the above, but now we have two different arrays.
void printUnorderedPairs (int[] arrayA, int[] arrayB) {
  for (int i = 0; i < arrayA.length; i++) {
    for (int j = 0; j < arrayB.length; j++) {
      if (arrayA[i] < arrayB.length; j++) {
        System.out.println(arrayA[i] + ", " + arrayB[j]);
      }
    }
  }
}
// For each element of array A, the inner for loop goes through b iterations, where b = arrayB. length.
// lf a = arrayA.length,then the runtime is O(ab).

// Examples 5
// What about this strange bit of code?
void printUnorderedPairs (int[] arrayA, int[] arrayB) {
  for (int i = 0; i < arrayA.length; i++) { // O(a)
    for (int j = 0; j < arrayB.length; j++) { // O(b)
      for (int k = 0; k < 100000; k++) { // O(1)
        System.out.println(arrayA[i] + "," arrayB[j]); // O(1)
      }
    }
  }
}
// Nothing has really changed here. 100,000 units of work is still constant, so the runtime is 0(ab).