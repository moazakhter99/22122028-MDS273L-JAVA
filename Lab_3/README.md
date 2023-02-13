## Question

- Create a java program, that stores the details of a student (Name, Register Number, Email, Class, Department).
- You can use a two-dimensional array to store the details.
HINT: String arr[] = {{"Alwin","1847207","alwin@christ.in","MCA","Computer Science"},{"Balagangadhar","2011204","bala@christ.in","MDS","Data Science"}}

You need to have functions to:
- Collect the details of the student
- Display the details of the student
- Search the details of the student
- With the help of a menu-driven main function, you need to access these functions inside your class and perform the operations.

- Whenever you are entering the details of a student, you need to enter the value into a static global string array, that stores the names that the user has entered. Searching this array will help you to find if the details of the student are already entered into the program.

- You will have a function to perform this search operation, which can be used to implement two functionality in the code
- To check if the name is already entered
- While searching for a name, you can identify the index of the two-dimensional array to print the details directly.
In the end, you will have
- Four functions inside your lab program class including your main class
- One static String array storing the names (note the program can store up to 1024 students)
- One two-dimensional string array storing the details of up to 1024 students
- A menu-driven main method implementing the functions and functionality
- Plan your program with a flow chart before starting with coding.
- Since you are using functions, plan what should be the returning values and how to implement them.

## Code Output

Press 1 to Enter Student detail
Press 2 to Search for a name
Press 3 to display a name
Press 4 to exit
/-----------------------------------------------------
Enter option: 1
/-----------------------------------------------------
Enter the Student information
Enter your name:
Moaz         
Enter your Registration no.:
22122028
Enter your email id:
moazakhter99@gmail.com
Enter your class:
2 MSDS A
Enter your Department:
Data Science
/-----------------------------------------------------
Enter option: 1
/-----------------------------------------------------
Enter the Student information
Enter your name:
Pritesh  
Enter your Registration no.:
22122155
Enter your email id:
pritesh@gmail.com
Enter your class:
2 MSDS B
Enter your Department:
Data Science
/-----------------------------------------------------
Enter option: 1
/-----------------------------------------------------
Enter the Student information
Enter your name:
Amit
Enter your Registration no.:
22111005
Enter your email id:
amitrana@gmail.com
Enter your class:
2 BBA Law
Enter your Department:
Law
/-----------------------------------------------------
Enter option: 2
/-----------------------------------------------------
Enter the name to be searched:
Amit
/-----------------------------------------------------
Amit is at 2 position
/-----------------------------------------------------
Enter option: 2
/-----------------------------------------------------
Enter the name to be searched:
Moaz
/-----------------------------------------------------
Moaz is at 0 position
/-----------------------------------------------------
Enter option: 2
/-----------------------------------------------------
Enter the name to be searched:
Pritesh
/-----------------------------------------------------
Pritesh is at 1 position
/-----------------------------------------------------
Enter option: 2
/-----------------------------------------------------
Enter the name to be searched:
Tushar
/-----------------------------------------------------
The name was not found
/-----------------------------------------------------
Enter option: 3
/-----------------------------------------------------
Enter the name to display: tushar
/-----------------------------------------------------
Name not found
/-----------------------------------------------------
Enter option: 3
/-----------------------------------------------------
Enter the name to display: Moaz
Name: Pritesh
Registration No: 22122155
Email id: pritesh@gmail.com
Class: 2 MSDS B
Department: Pritesh
/-----------------------------------------------------
Enter option: 3
/-----------------------------------------------------
Enter the name to display: Amit
/-----------------------------------------------------
Name: Amit
Registration No: 22111005
Email id: amitrana@gmail.com
Class: 2 BBA Law
Department: Amit
/-----------------------------------------------------
Enter option: 4
/-----------------------------------------------------
Exiting Program

## Flow Chart
