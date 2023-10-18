# Lab 2 Report
**Felix Xie**

**AO3 CSE 15L**
## StringServer.java and Webpage
The following is a image of the StringServer.java and Server.java file:

![Image](/Lab2Information/StringServer.PNG)
![Image](/Lab2Information/Server.PNG)

This is the web server after using **/add-string?s=Hello** 

![Image](/Lab2Information/add-message1.PNG)

The StringServer main method is called through running java StringServer 4000, which then starts up the server on the specified port (in this case, 4000). The URL is then parsed by the handleRequest method in the Handler class. The method checks if an add-message request has come through; otherwise, it simply prints out what already has been added. There are two important variables in this class, the lineNum variable and the printer variable. The lineNum variable keeps track of the line number of each item that has been added to the printer variable, and keeps track of the order in which items were added. The printer variable is a String that tracks what is to be printed on the web server, and it continuously added to by add-message requests.  If the add-message request has come through, it checks whether there is a String to be added. 

In this case, the request **add-message?s=Hello** was given. Thus,  Thus, this URL request is parsed, and **Hello** is added to the printer variable, along with the lineNum, which in this case, is 1. Afterwards, lineNum is incremented by 1. Thus, 

1. Hello

is printed as a result of calling this request.

This is the web server after using **/add-string?s=How are you** after 

![Image](/Lab2Information/add-message2.PNG)

The StringServer main method is called through running java StringServer 4000, which then starts up the server on the specified port (in this case, 4000). The URL is then parsed by the handleRequest method in the Handler class. The method checks if an add-message request has come through; otherwise, it simply prints out what already has been added. There are two important variables in this class, the lineNum variable and the printer variable. The lineNum variable keeps track of the line number of each item that has been added to the printer variable, and keeps track of the order in which items were added. The printer variable is a String that tracks what is to be printed on the web server, and it continuously added to by add-message requests.  If the add-message request has come through, it checks whether there is a String to be added. 

In this case, the request **add-message?s=How are you** was given. Thus, Thus, this URL request is parsed, and **How are you** is added to the printer variable, along with the lineNum, which in this case, is 2. Afterwards, lineNum is incremented by 1. Thus, 

1. Hello
2. How are you

is printed as a result of calling this request.

