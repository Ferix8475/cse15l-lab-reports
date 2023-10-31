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

### -name
```
felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.0020268.txt
technical/plos/pmed.0020268.txt
```
This command is searching for files with the specific name "pmed.0020268" in the technical directory, and outputting/printing anything that is found. This is useful for searching for a specific file in mind, and checking whether it exists or not. 


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
This command is searching in the technical directory for files with the specific name "pmed.", followed by any series of characters, and ended with ".txt". The "*" is used to create patterns, and essentially means "anything". Thus, anything that starts with pmed. and ends with .txt is searched for. Anything found is then outputted/printed. This is useful for searching for files with similar name structures or if searching for a specific file type (.pdf, .txt, etc.). 

### -type
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
The command is searching in the technical directory for directories that are in the technical directory, and it outputs/prints anything that is found. "-type d" specifies the type of structure to be searched for, and in this case, the "d" stands for directories, meaning that the search is for specifically directories only. This is useful for differentiating the types of files when searching, as sometimes searching for only regular files or searching for only directories is required. 

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
The command is searching in the technical directory for regular files that are in the technical directory, and it outputs/prints anything that is found. "-type f" specifies the type of structure to be searched for, and in this case, the "f" stands for regular files, meaning that the search is for specifically files only. This is useful for differentiating the types of files when searching, as sometimes searching for only regular files or searching for only directories is required. 


### -size
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
This command searches for files in the technical directory that have a size less than 3 kilobytes, and outputs/prints the files found. The "-" specifies that the search is for files less than 3 kilobytes, and the 3k specifies the size (3 kilobytes) that serves as the threshold of searching. This command can take other value arguments arguments can be passed with different sizes, which can be useful for searching for particularly small files (or directories, if changing the -type argument) under a certain threshold.  


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
This command searches for files in the technical directory that have a size greater than 100 kilobytes, and outputs/prints the files found. The "+" specifies that the search is for files larger than 100 kilobytes, and the 100k specifies size (100 kilobytes) that serves as the threshold of searching. This command can take other value arguments arguments can be passed with different sizes, which can be useful for searching for particularly large files (or directories, if changing the -type argument) over a certain threshold.  


### -delete
-delete example 1:
```
felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.0020278.txt
technical/plos/pmed.0020278.txt

felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.0020278.txt -delete

felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.0020278.txt

```
This command searches in the technical directory for and, if found, deletes the file specified under the -name argument. There is no output. In this case, if a file has the name pmed.0020278.txt, it will be deleted, which can be seen above as searching for the file after passing -delete shows that it does not exist anymore. This is useful if you want to delete a specific file but don't know if it exists, or where it's located. 


```
felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.002027*.txt -type f
technical/plos/pmed.0020272.txt
technical/plos/pmed.0020273.txt
technical/plos/pmed.0020274.txt
technical/plos/pmed.0020275.txt

felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.002027*.txt -type f -delete

felix@DESKTOP-UK76AME MINGW64 ~/Downloads/docsearch (main) $ find technical -name pmed.002027*.txt -type f

```
This command searches in the technical directory for and, if found, deletes the file specified under the -name argument. There is no output. In this case, if a file has "pmed." followed by any series of characters, and ends with ".txt", it will be deleted. This can be seen above as searching for the file(s) after passing -delete shows that it does not exist anymore. This is useful if you want to delete a bunch of files that have similar names, and you might not know where they are located/whether they exist in the first place. 

