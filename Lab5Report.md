# Lab 5 Report
**Felix Xie**

**AO3 CSE 15L**
## Part 1 - Context
### File & Directory Structure

The following file/directory structure is required to run this scenario:

```
Lab9Report/
  makeArrays.sh
  SortArrayByParity.java
```

Note: The files `outputFile.txt` and `SortArrayByParity.class` will be created as a result of running `bash makeArrays.sh`

### Content of Files Before Fixes

The following image shows the content of the `SortArrayByParity.java`:

![Image](Lab5Info/SortArray.PNG)
![Image](Lab5Info/SortArray2.PNG)

Intended purpose of `SortArrayByParity.java`: `SortArrayByParity.java`'s main method takes one argument, an integer. An array of the specified size of integers from 0 (inclusive) to the specified value (exclusive) are then populated as the values in the array. Then, the array is sorted by parity, where the even numbers appear in the front and the odd numbers appear in the end. For example, if the call was `java SortArrayByParity 5`, an array of size 5 where any value can be any integer in the range [0, 4] would be generated. Then, the even numbers would be pushed to the front of the array, and the odd numbers to the back. If there were 3 even numbers, then the first 3 numbers of the sorted array would be even (any order works). 


The following image shows the content of the `makeArrays.sh`:

![Image](Lab5Info/makeArrays.PNG)

Intended purpose of `makeArrays.sh`: `makeArrays.sh` takes two arguments, the first being the number of arrays to be created, and the second is the size of the arrays to be created. The file will generate the specified number of arrays unsorted to sorted, and write them all out to outputFile.txt, as well as print the result into the terminal. 
