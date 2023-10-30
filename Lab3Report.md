
```
@Test
public void testReversed() {
    int[] input1 = {1, 2, 3, 4 };
    assertArrayEquals(new int[]{4, 3, 2, 1 }, ArrayExamples.reversed(input1));
}
```

```
@Test
public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
}
```
