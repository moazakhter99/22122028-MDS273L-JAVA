## Question
- Create a Student class, that will store the details of the Student, below mentioned are the attributes of a student.
- Reg. No.
- Name
- Email
- Phone
- Class
- Department
- The Student class will have the following methods:
- A constructor to initialize the values of the Student
- A method to print the Details of the Student.
- A method (named 'toString()) that convert the student details to string, and can be used to write the student details to file.
- In the main-method class, create an array of Student Class to hold maximum details of 100 Students.

- In the menu-driven program, the menu options will have
- Add a student
- Adds the details of 1 student to the array of Student.
- Search for a student
- Search for the details of a student from the array of Student.
- Searching can be done with Name or Register Number.
- Update the details of a student
- Update the student details based on the search based on name or register number.
- Display all students
- Displays the details of all students.
- Save the details of each student in a file, with the student name as filename.

- Note: Make use of functions to implement the menu options.

- Once the program is complete
- Add the code to GitHub under the folder Lab 6.
- Create a README.md file for documentation.
- Add proper comments in the code.
- Create a flowchart using the online tool and update the README.md file.
- Update the changes to the GitHub website and submit the URL.

## Program Description

### StudentInfo Class
- Create variables with new String object of all the detail.
    - Reg. No.
    - Name
    - Email
    - Phone
    - Class
    - Department
- Contructor 
    - Give empty Strings for all the String objects created
- Display Method
    - Print Statements for all the String objects created
- toString Method
    - A single String that takes for all the String objects in one
    - return the string object
- Write to file Method
    - Strat a 'try/catch' statement
    - Check if the file with the same name as the 'name' varables exists
        - If true print file already exists
        - else create a new file with the same name as the variables 'name'
    - Check if we can write in the file
        - if true 
            - Create a new object of 'FileWriter'
            - then write the return statement of the 'toString' function
        - else print 'could not write in file'
    - Catch any exception
        - print the exception

### Main Function Class
1. addDetail Function
- Takes in the Array of StudentInfo objects as an argument
- Take in user input for Student details
    - Reg. No.
    - Name
    - Email
    - Phone
    - Class
    - Department
    - Increment 1 to the current student count
2. searchobject Function
- Takes in the argument 
    - Array of StudentInfo objects
    - The serch term
- Creata a boolean variable with false
- A new object of the studentInfo class
- Start a for loop for the current count of students
    - Save the each objects name and reg no to a variables
    - If the serch term matches with either name or reg no
        - make the boolean value true
        - add the object to the new object variable
        - break the loop
- if the boolean variable is false
    - return null
else
    - return the the object saved in the new studentInfo class object
3. updateObject function
- Takes in the argument 
    - Array of StudentInfo objects
    - The serch term
- Call the search function
- If the search function returns null value
    - Print 'Stdudent not found'
- else
    - Take in user input to update the values of all the details
4. displayDetail fuction
- Takes in the Array of StudentInfo objects as an argument
- Start a for loop for the current count of student
    - Class the display method of the studentInfo class on each of the objects

5. Create Static global variables
- A new Object of the Scanner class
- The Current count of Students

6. Main Function
- Create a new Array of objects of the studentInfo Class
- A boolean variable with false
- Start a 'do/while' loop
    - Get the user choice to select one function
        - Enter new Detail
        - Search a Detail
        - Update a Detail
        - Update all the student detail
        - Write the detail in a file
        - Exit the program
    - Start a 'switch/case' statement
    - if case 1:
        - Create a new object of the class studentInfo at current student count index
        - Call the addDetail function
        - break
    - if case 2:
        - Take user input for the name or reg no. to be searched
        - Call the searchObject function
        - if it returns null
            - Print student not found
        - else
            - call the dislay method for the returned object of the StudentInfo Class
        - break
    - if case 3:
        - Take the reg no of the student to update details
        - Call the updateObject functuion
        - break
    - if case 4:
        - call the displaydetail function
    - if case 5:
        - Create a for loop for the current count of students on Array of Objects of studentinfo Class
            - Call the writeToFile method on each of the object within the array
    - if case 6:
        - change the value of the boolean variable true
    
    - while the boolean value is false

## Output
<br>
<br>Press 1 to Enter new Student Details
<br>Press 2 to Search for a Name
<br>Press 3 to Update any Student Detail
<br>Press 4 to display all the Student details
<br>Press 5 to write info to file
<br>Press 6 to Exit the program
<br>Enter Your Choice: 1
<br>Enter Name: Moaz Akhter
<br>Enter Reg No.: 22122028
<br>Enter Class Name: MSDS A
<br>Enter Phone No.: 8877556699
<br>Enter Email ID: narpat@gmail.com
<br>Enter Department Name: Computer Science
<br>
<br>Press 1 to Enter new Student Details
<br>Press 2 to Search for a Name
<br>Press 3 to Update any Student Detail
<br>Press 4 to display all the Student details
<br>Press 5 to write info to file
<br>Press 6 to Exit the program
<br>Enter Your Choice: 2
<br>Enter the name or reg no. to search: Moaz Akhter
<br>Name: Moaz Akhter
<br>reg No.: 22122028
<br>email: narpat@gmail.com
<br>phone: 8877556699
<br>Class: MSDS A
<br>Department: Computer Science
<br>
<br>Press 1 to Enter new Student Details
<br>Press 2 to Search for a Name
<br>Press 3 to Update any Student Detail
<br>Press 4 to display all the Student details
<br>Press 5 to write info to file
<br>Press 6 to Exit the program
<br>Enter Your Choice: 3
<br>Enter the reg no. to update: 22122028
<br>Enter Name: Moaz Akhter
<br>Enter Reg No.: 22122028
<br>Enter Class Name: MSDS A
<br>Enter Phone No.: 8877556699
<br>Enter Email ID: moaz@gmail.com
<br>Enter Department Name: Data Science
<br>
<br>Press 1 to Enter new Student Details
<br>Press 2 to Search for a Name
<br>Press 3 to Update any Student Detail
<br>Press 4 to display all the Student details
<br>Press 5 to write info to file
<br>Press 6 to Exit the program
<br>Enter Your Choice: 1
<br>Enter Name: Narpat Kumar
<br>Enter Reg No.: 22122031
<br>Enter Class Name: MSDS A
<br>Enter Phone No.: 2211335544
<br>Enter Email ID: narpat@gmail.com
<br>Enter Department Name: Data Science
<br>
<br>Press 1 to Enter new Student Details
<br>Press 2 to Search for a Name
<br>Press 3 to Update any Student Detail
<br>Press 4 to display all the Student details
<br>Press 5 to write info to file
<br>Press 6 to Exit the program
<br>Enter Your Choice: 4
<br>Detail of Student 1
<br>Name: Moaz Akhter
<br>reg No.: 22122028
<br>email: moaz@gmail.com
<br>phone: 8877556699
<br>Class: MSDS A
<br>Department: Data Science
<br>
<br>Detail of Student 2
<br>Name: Narpat Kumar
<br>reg No.: 22122031
<br>email: narpat@gmail.com
<br>phone: 2211335544
<br>Press 3 to Update any Student Detail
<br>Press 4 to display all the Student details
<br>Press 5 to write info to file
<br>Press 6 to Exit the program
<br>Enter Your Choice: 5
<br>File Does not exist
<br>File Does not exist
<br>
<br>Press 1 to Enter new Student Details
<br>Press 2 to Search for a Name
<br>Press 3 to Update any Student Detail
<br>Press 4 to display all the Student details
<br>Press 5 to write info to file
<br>Press 6 to Exit the program
<br>Enter Your Choice: 6
<br>

## Flowchart

![alt text](https://github.com/moazakhter99/22122028-MDS273L-JAVA/blob/master/Lab_FlowChart/Java_lab_6_flowchart.png)

