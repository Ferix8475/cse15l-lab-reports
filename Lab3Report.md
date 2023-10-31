# Lab 3 Report
**Felix Xie**

**AO3 CSE 15L**
## Part 1 - Bugs
From the ArrayExamples class, and the reversed() method, The following is a failure-inducing input
```
@Test
public void testReversed() {
    int[] input1 = {1, 2, 3, 4 };
    assertArrayEquals(new int[]{4, 3, 2, 1 }, ArrayExamples.reversed(input1));
}
```
From the ArrayExamples class, and the reversed() method, The following is not a failure-inducing input
```
@Test
public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
}
```


The reversed() method originally:
```
static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
}
```
The reversed() method after edits:
```
static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
}
```

The bug in the code was that arr and newArray were flipped in the for-loop as well as in the return statement. In the buggy version, arr was being set to 0s, as it was being assigned newArray's values (which were all zeroes upon initialization). Thus, by flipping them, newArray's values were now being set to arr's values in reverse order, and the correct array was also returned. 
