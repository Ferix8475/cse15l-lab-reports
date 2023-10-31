# Lab 2 Report
**Felix Xie**

**AO3 CSE 15L**
## Part 1, StringServer.java and Webpage
The following is a image of the StringServer.java and Server.java file:

![Image](/Lab2Information/StringServer.PNG)
![Image](/Lab2Information/Server.PNG)

### This is the web server after using **/add-string?s=Hello** 

![Image](/Lab2Information/add-message1.PNG)

The StringServer main method is called through running java StringServer 4000, which then starts up the server on the specified port (in this case, 4000). The URL is then parsed by the handleRequest method in the Handler class. The method checks if an add-message request has come through; otherwise, it simply prints out what already has been added. There are two important variables in this class, the lineNum variable and the printer variable. The lineNum variable keeps track of the line number of each item that has been added to the printer variable, and keeps track of the order in which items were added. The printer variable is a String that tracks what is to be printed on the web server, and it continuously added to by add-message requests.  If the add-message request has come through, it checks whether there is a String to be added. 

In this case, the request **add-message?s=Hello** was given. Thus,  Thus, this URL request is parsed, and **Hello** is added to the printer variable, along with the lineNum, which in this case, is 1. Afterwards, lineNum is incremented by 1. Thus, 

1. Hello

is printed as a result of calling this request.

### This is the web server after using **/add-string?s=How are you**  

![Image](/Lab2Information/add-message2.PNG)

The StringServer main method is called through running java StringServer 4000, which then starts up the server on the specified port (in this case, 4000). The URL is then parsed by the handleRequest method in the Handler class. The method checks if an add-message request has come through; otherwise, it simply prints out what already has been added. There are two important variables in this class, the lineNum variable and the printer variable. The lineNum variable keeps track of the line number of each item that has been added to the printer variable, and keeps track of the order in which items were added. The printer variable is a String that tracks what is to be printed on the web server, and it continuously added to by add-message requests.  If the add-message request has come through, it checks whether there is a String to be added. 

In this case, the request **add-message?s=How are you** was given. Thus, Thus, this URL request is parsed, and **How are you** is added to the printer variable, along with the lineNum, which in this case, is 2. Afterwards, lineNum is incremented by 1. Thus, 

1. Hello
2. How are you

is printed as a result of calling this request.

## Part 2, SSH Key

### This is the path to the private key for my SSH key

![Image](/Lab2Information/privateKey.PNG)
The directory is /home/linus/ieng6/cs15lfa23/cs15lfa23fi/.ssh/authorized_keys

### This is the path to the public key for my SSH key

![Image](/Lab2Information/publicKey.PNG)
The directory is C:\Users\felix\.ssh\id_rsa

### This is the terminal output of logging into the ieng6 account remotely without a password

![Image](/Lab2Information/Interaction.PNG)

## Part 3, Reflection

The most important thing that I learned these past two weeks were about websites and HTTPS URLs. I knew that websites had domains, but I didn't know the specific parts of URLS that specified what. For example the link:

[https://ucsd-cse15l-f23.github.io/week/week3/#week3-lab-report](https://ucsd-cse15l-f23.github.io/week/week3/#week3-lab-report)

Has a doman ucsd-cse15l-f23.github.io, a Path of /week/week3, no query, and an Anchor of #week3-lab-report. With URLs like google searches, the query often parsed and processed. For example, with a Google search, a search query would have a query that has the search request. Another part of URLs are the Anchors (if they exist), which often are used to direct towards page-specific data. For example, in lecture, the UCSD map had anchors that directed towards different buildings depending on the contents of the anchor. I also learned how to actually create my own web server and parse through my own queries on links, which is displayed in this lab as well. 
