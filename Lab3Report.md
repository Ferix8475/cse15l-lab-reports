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
The following are the results of the previous two inputs:

Failure-inducing input:
![Image](/Lab3Info/FailRun.PNG)

Non-failure inducing input:
![Image](/Lab3Info/GoodRun.PNG)

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

## Part 2 - find command
**This section is sourced from ChatGPT. The prompt given was initially "find command line options", but it listed out many different options for various different commands. The prompt was then specified to be asking options for only the find command, of which a list of options was given.**

# -name
```
felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.0020268.txt
technical/plos/pmed.0020268.txt
```

```
felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.*.txt
technical/plos/pmed.0010008.txt
technical/plos/pmed.0010010.txt
technical/plos/pmed.0010013.txt
technical/plos/pmed.0010021.txt
technical/plos/pmed.0010022.txt
technical/plos/pmed.0010023.txt
.
.
.
..skipping..
.
.
technical/plos/pmed.0020258.txt
technical/plos/pmed.0020268.txt
```
# -type
```
felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -type d
technical
technical/911report
technical/biomed
technical/government
technical/government/About_LSC
technical/government/Alcohol_Problems
technical/government/Env_Prot_Agen
technical/government/Gen_Account_Office
technical/government/Media
technical/government/Post_Rate_Comm
technical/plos
```

```
felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -type f
technical/biomed/1471-2334-2-24.txt
technical/biomed/1471-2334-2-26.txt
technical/biomed/1471-2334-2-27.txt
technical/biomed/1471-2334-2-29.txt
technical/biomed/1471-2334-2-5.txt
technical/biomed/1471-2334-2-6.txt
.
.
.
..skipping..
.
.
technical/plos/pmed.0020249.txt
technical/plos/pmed.0020257.txt
technical/plos/pmed.0020258.txt
technical/plos/pmed.0020268.txt
```
# -size
```
felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -type f -size -3k
technical/government/Media/Campaign_Pays.txt
technical/government/Media/Court_Keeps_Judge_From.txt
technical/government/Media/Fire_Victims_Sue.txt
technical/government/Media/It_Pays_to_Know.txt
technical/government/Media/Justice_requests.txt
technical/government/Media/Lawyer_Web_Survey.txt
technical/government/Media/Self-Help_Website.txt
technical/plos/pmed.0020028.txt
technical/plos/pmed.0020048.txt
technical/plos/pmed.0020082.txt
technical/plos/pmed.0020120.txt
technical/plos/pmed.0020157.txt
technical/plos/pmed.0020191.txt
technical/plos/pmed.0020192.txt
technical/plos/pmed.0020226.txt
```

```
felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -type f -size +100k
technical/911report/chapter-1.txt
technical/911report/chapter-12.txt
technical/911report/chapter-13.2.txt
technical/911report/chapter-13.3.txt
technical/911report/chapter-13.4.txt
technical/911report/chapter-13.5.txt
technical/911report/chapter-3.txt
technical/911report/chapter-6.txt
technical/911report/chapter-7.txt
technical/911report/chapter-9.txt
technical/biomed/1471-2105-3-2.txt
technical/government/About_LSC/commission_report.txt
technical/government/About_LSC/State_Planning_Report.txt
technical/government/Env_Prot_Agen/bill.txt
technical/government/Env_Prot_Agen/ctm4-10.txt
technical/government/Env_Prot_Agen/multi102902.txt
technical/government/Env_Prot_Agen/tech_adden.txt
technical/government/Gen_Account_Office/ai9868.txt
technical/government/Gen_Account_Office/d01376g.txt
technical/government/Gen_Account_Office/d01591sp.txt
technical/government/Gen_Account_Office/d0269g.txt
technical/government/Gen_Account_Office/d02701.txt
technical/government/Gen_Account_Office/gg96118.txt
technical/government/Gen_Account_Office/GovernmentAuditingStandards_yb2002ed.txt
technical/government/Gen_Account_Office/im814.txt
technical/government/Gen_Account_Office/May1998_ai98068.txt
technical/government/Gen_Account_Office/pe1019.txt
technical/government/Gen_Account_Office/Sept27-2002_d02966.txt
technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt
```
# -delete
```
felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.0020278.txt
technical/plos/pmed.0020278.txt

felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.0020278.txt -delete

felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.0020278.txt

```


```
felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.002027*.txt -type f
technical/plos/pmed.0020272.txt
technical/plos/pmed.0020273.txt
technical/plos/pmed.0020274.txt
technical/plos/pmed.0020275.txt

felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.002027*.txt -type f -delete

felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.002027*.txt -type f

```
