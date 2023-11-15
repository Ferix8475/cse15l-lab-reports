# Lab 3 Report
**Felix Xie**

**AO3 CSE 15L**
## Part 1 - Bugs
### Logging into ieng6 Remotely
![Image](/Lab4Images/step4.PNG)

Keys pressed:
```
ssh<space>cs15lfa23fi@ieng6.ucsd.edu<enter>
```
There was no shorter way of logging into ieng6 on my account, so I typed the entire thing out using the ssh command, which successfully logged me into ieng6

### Cloning my Fork of the Lab7 Repository using SSH
![Image](/Lab4Images/step5.PNG)

Keys pressed:
```
git<space>clone<space><ctrl-v><enter>
```
When I did step 2, I copied the SSH url for the fork of Lab7 that I created. Thus, instead of typing out the SSH url, I pasted it from my clipboard after typing in "git clone". This successfully cloned my fork of the Lab7 Repository.

### Running the Initial Set of Tests
![Image](/Lab4Images/step6.PNG)

Keys pressed:
```
bash<space>test.sh<enter>
```
There was a shell script located within the Lab7 repository that ran the two commands: 

```
javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java
java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests
```
Thus, instead of typing these commands out, I simply ran the test.sh file using the command "bash test.sh", which then successfully ran the ListExamplesTests.java file. 

### Editting ListExamples.java
![Image](/Lab4Images/step7.PNG)

Keys pressed:
```
vim<space><shift>l<tab>.java<enter>
```
In order to edit the ListExamples.java file, I first had to enter vim. To open a vim editor on the ListExamples.java file, I used the command "vim ListExamples.java". Instead of typing out the entirety of "ListExamples", I used the tab button to autofill the name of the file after typing just "L". I then added the ".java" at the end, which after running then opened the vim editor.

Then:
```
:44<enter>lllllli<backspace>2<esc>:wq<enter>
```
Inside the vim editor, I first typed ":44" and <enter> to move to line 44, which is the line that needed to be editted. I then moved the cursor right 6 times and entered insert mode using the vim commands "lllllli". I then changed index1 to index2 by removing the 1 and replacing it with a 2, which I did by first deleteing the "1" in index1 with a backspace, inserting "2" by typing 2, and then exiting insert mode with <esc>. I then saved the file by typing :wq. 

### Rerunning ListExamplesTests.java
![Image](/Lab4Images/step8.PNG)

Keys pressed:
```
<up><up><enter>
```
Similar to the step of the first time running the tests, I reused the command "bash test.sh". However, it was already saved in my bash history, so I simply used the up arrow twice to access it and run it. 

### Committing and Pushing changes to GitHub
![Image](/Lab4Images/step9.PNG)

Keys pressed:
```
git<space>add<space>-<shift>a<enter>
```
Followed by:
```
git<space>commit<space>-m<space>"done"
```
Followed by:
```
git<space>push
```
I simply ran the typical commands to commit and push changes from the terminal here, using the commit message "done". I used no shortcuts, and simply typed out each command individually
```
git add -A
git commit -m "done"
git push
```
These 3 commands successfully commit and push the changes made within this lab report. 
