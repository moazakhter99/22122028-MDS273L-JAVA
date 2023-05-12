## Question

- Create a new folder in git named 'Lab 7' for the following question and solve the following: create a flowchart and document the results, constraints, etc., in the README.md file for the lab.

- Given the famous iris dataset, find the 5-point summary [Mean, Median, Mode, Min, Max] for the attributes: SepalLengthCm, SepalWidthCm, PetalLengthCm, PetalWidthCm.

- Once the overall summary statistics have been calculated, identify the summary statistics for each Species of iris flower [Iris-setosa, Iris-versicolor, Iris-virginica].

- Present your results in the appropriate format and write the results in a file.


## Program Description

1. Static Function
- Array for Sepal Length
- Array for Sepal Width
- Array for Petal Length
- Array for Petal Width
- 2D Array for Setosa
- 2D Array for Versicolor
- 2D Array for Virginica
- Scanner class object for taking input

2. Select species function
- Takes in flower species as an argument
- Take user input to choose Species Attributes
- Create temporary 2D Array to hold species Array
- if Species is sertosa
    - assign sertosa Array to the temporary Array
- else if Spieces is Versicolor
    - assign Versicolor Array to the temporary Array
- else if Spiecies is Virginica
    - assign Virginiaca Array to the temporary Array

- Switch choice
    - case 1:
        - Call the mean, median, mode, max, and min function on the sertosa Array
    - case 2:
        -  Call the mean, median, mode, max, and min function on the Versicolcor Array
    - case 3:
        - Call the mean, median, mode, max, and min function on the Virginica Array
    - while choice is not 0


3. Create Array function
- Inside try/catch block
- Create an object of File class to open iris.csv file
- if file exists
    - Create Scanner class object to read the file
    - if file can be read
    - read the first line (column header)
    - Create variable to hold the index of the sepel, petal length and sepel, petal width Array
    - Create 3 variable to hold the index of sertosa, versicolor and virginica
    - while file has next line
        - Split the line deliminated by ',' in a Array
        - Assign the values of index 1 to sepal length 
        - Assign the values of index 2 to sepal width
        - Assign the values of index 3 to petal length 
        - Assign the values of index 4 to petal width
        - if value at index 5 is Iris-setosa
            - Assign the value at index 1 to setosa Array at index 0
            - Assign the value at index 2 to setosa Array at index 1
            - Assign the value at index 3 to setosa Array at index 2
            - Assign the value at index 4 to setosa Array at index 3
            - increment 1 to sertosa index
        - if value at index 5 is Iris-versicolor
            - Assign the value at index 1 to versicolor Array at index 0
            - Assign the value at index 2 to versicolor Array at index 1
            - Assign the value at index 3 to versicolor Array at index 2
            - Assign the value at index 4 to versicolor Array at index 3
            - increment 1 to versicolor index
        - if value at index 5 is Iris-virginica
            - Assign the value at index 1 to virginica Array at index 0
            - Assign the value at index 2 to virginica Array at index 1
            - Assign the value at index 3 to virginica Array at index 2
            - Assign the value at index 4 to virginica Array at index 3
            - increment 1 to virginica index
        - increment 1 to index of other Attributes
- catch any errors and print 


4. Mean function
- Takes in Array of floats as an arrgument
- Create a float variable total sum variable
- Loop through the Array
    - Add the float to the toatal sum variabale
- Divide the total sum by the array length
- return mean


5. Median function
- Takes in Array of floats as an arrgument
- Sort the Array using Arrays.sort
- Create a flaot variable median
- if Array length is odd
    - Take the middle value of the array
- else
    - Add the middle value and value one preceeding that and divide it by two
- return median


6. Count function
- Takes in Array of floats and a float value as an arrgument
- Creata a float count variable
- count the number of float in the Array of floats
- return count


7. Mode function
- Takes in Array of floats as an arrgument
- Create a variable to hold the value with max frequency
- Create a Array to hold the mode value and its frequency
- Loop through the Array
    - Call the count function the Array of float with the value
    - if count is more than the current max frequency value
        - change the max value variable to the current value from the Array
        - Assign the value and its frequency to the the Array
- return the Array


8. Max function
- Takes in Array of floats as an arrgument
- call the Min function and hold the minimum value in the array as current max value
- Loop through the array
    - if the value if greater than current max value
        - update the max value with the value
- return max value

9. Min function
- Takes in Array of floats as an arrgument
- call the Max function and hold the maximum value in the array as current min value
- Loop through the array
    - if the value if lesser than current min value
        - update the min value with the value
- return min value

10. Main Function
- Call the create Array function
- initiate choice variable
- start a do/while loop
    - Take user choice
    - Switch case
        - case 1:
            - Call the mean, median, mode, max, and min function on the sepal length Array
        - case 2:
            - Call the mean, median, mode, max, and min function on the sepal width Array
        - case 3:
            - Call the mean, median, mode, max, and min function on the petal length Array
        - case 4:
            - Call the mean, median, mode, max, and min function on the petal width Array
        - case 5:
            - Call the Select Speicies fumction with sertosa as an argument
        - case 6:
            - Call the Select Speicies fumction with versicolor as an argument
        - case 7:
            - Call the Select Speicies fumction with virginica as an argument
    while choice is not 0


## Output
<br>
<br>Press 1 for Sepel Length
<br>Press 2 for Sepel Width
<br>Press 3 for Petal Length
<br>Press 4 for Petal Width
<br>Press 5 for Iris Setosa
<br>Press 6 for Iris Versicolor
<br>Press 7 for Iris virginica
<br>Press 0 to exit
<br>Choice: 1
<br>For Sepal Length
<br>Mean: 5.8433347
<br>Median: 5.8
<br>Mode: 5.0
<br>Minimum Value: 4.3
<br>Maximum value: 7.9
<br>
<br>Press 1 for Sepel Length
<br>Press 2 for Sepel Width
<br>Press 3 for Petal Length
<br>Press 4 for Petal Width
<br>Press 5 for Iris Setosa
<br>Press 6 for Iris Versicolor
<br>Press 7 for Iris virginica
<br>Press 0 to exit
<br>Choice: 2
<br>For Sepal Width
<br>Mean: 3.054
<br>Median: 3.0
<br>Mode: 3.0
<br>Minimum Value: 2.0
<br>Maximum value: 4.4
<br>
<br>Press 1 for Sepel Length
<br>Press 2 for Sepel Width
<br>Press 3 for Petal Length
<br>Press 4 for Petal Width
<br>Press 5 for Iris Setosa
<br>Press 6 for Iris Versicolor
<br>Press 7 for Iris virginica
<br>Press 0 to exit
<br>Choice: 3
<br>For Petal Length
<br>Mean: 3.7586665
<br>Median: 4.3500004
<br>Mode: 1.5
<br>Minimum Value: 1.0
<br>Maximum value: 6.9
<br>
<br>Press 1 for Sepel Length
<br>Press 2 for Sepel Width
<br>Press 3 for Petal Length
<br>Press 4 for Petal Width
<br>Press 5 for Iris Setosa
<br>Press 6 for Iris Versicolor
<br>Press 7 for Iris virginica
<br>Press 0 to exit
<br>Choice: 4
<br>For Petal Width
<br>Mean: 1.1986669
<br>Median: 1.3
<br>Mode: 0.2
<br>Minimum Value: 0.1
<br>Maximum value: 2.5
<br>
<br>Press 1 for Sepel Length
<br>Press 2 for Sepel Width
<br>Press 3 for Petal Length
<br>Press 4 for Petal Width
<br>Press 5 for Iris Setosa
<br>Press 6 for Iris Versicolor
<br>Press 7 for Iris virginica
<br>Press 0 to exit
<br>Choice: 5
<br>Press 1 for Sepel Length for Setosa
<br>Press 2 for Sepel Width for Setosa
<br>Press 3 for Petal Length Setosa
<br>Press 4 for Petal Width Setosa
<br>Press 0 to go back
<br>Choice:
<br>1
<br>For Sepal Length
<br>Mean: 5.0059996
<br>Median: 5.0
<br>Mode: 5.0
<br>Minimum Value: 4.3
<br>Maximum value: 5.8
<br>
<br>Press 1 for Sepel Length for Setosa
<br>Press 2 for Sepel Width for Setosa
<br>Press 3 for Petal Length Setosa
<br>Press 4 for Petal Width Setosa
<br>Press 0 to go back
<br>Choice:
<br>2
<br>For Sepal Width
<br>Mean: 3.4180002
<br>Median: 3.4
<br>Mode: 3.4
<br>Minimum Value: 2.3
<br>Maximum value: 4.4
<br>
<br>Press 1 for Sepel Length for Setosa
<br>Press 2 for Sepel Width for Setosa
<br>Press 3 for Petal Length Setosa
<br>Press 4 for Petal Width Setosa
<br>Press 0 to go back
<br>Choice:
<br>3
<br>For Petal Length
<br>Mean: 1.464
<br>Median: 1.5
<br>Mode: 1.5
<br>Minimum Value: 1.0
<br>Maximum value: 1.9
<br>
<br>Press 1 for Sepel Length for Setosa
<br>Press 2 for Sepel Width for Setosa
<br>Press 3 for Petal Length Setosa
<br>Press 4 for Petal Width Setosa
<br>Press 0 to go back
<br>Choice:
<br>4
<br>For Petal Width
<br>Mean: 0.24399997
<br>Median: 0.2
<br>Mode: 0.2
<br>Minimum Value: 0.1
<br>Maximum value: 0.6
<br>
<br>Press 1 for Sepel Length for Setosa
<br>Press 2 for Sepel Width for Setosa
<br>Press 3 for Petal Length Setosa
<br>Press 4 for Petal Width Setosa
<br>Press 0 to go back
<br>Choice:
<br>0
<br>Press 1 for Sepel Length
<br>Press 2 for Sepel Width
<br>Press 3 for Petal Length
<br>Press 4 for Petal Width
<br>Press 5 for Iris Setosa
<br>Press 6 for Iris Versicolor
<br>Press 7 for Iris virginica
<br>Press 0 to exit
<br>Choice: 6
<br>Press 1 for Sepel Length for Versicolor
<br>Press 2 for Sepel Width for Versicolor
<br>Press 3 for Petal Length Versicolor
<br>Press 4 for Petal Width Versicolor
<br>Press 0 to go back
<br>Choice:
<br>1
<br>For Sepal Length
<br>Mean: 5.936002
<br>Median: 5.9
<br>Mode: 5.5
<br>Minimum Value: 4.9
<br>Maximum value: 7.0
<br>
<br>Press 1 for Sepel Length for Versicolor
<br>Press 2 for Sepel Width for Versicolor
<br>Press 3 for Petal Length Versicolor
<br>Press 4 for Petal Width Versicolor
<br>Press 0 to go back
<br>Choice:
<br>2
<br>For Sepal Width
<br>Mean: 2.77
<br>Median: 2.8
<br>Mode: 3.0
<br>Minimum Value: 2.0
<br>Maximum value: 3.4
<br>
<br>Press 1 for Sepel Length for Versicolor
<br>Press 2 for Sepel Width for Versicolor
<br>Press 3 for Petal Length Versicolor
<br>Press 4 for Petal Width Versicolor
<br>Press 0 to go back
<br>Choice:
<br>3
<br>For Petal Length
<br>Mean: 4.26
<br>Median: 4.3500004
<br>Mode: 4.5
<br>Minimum Value: 3.0
<br>Maximum value: 5.1
<br>
<br>Press 1 for Sepel Length for Versicolor
<br>Press 2 for Sepel Width for Versicolor
<br>Press 3 for Petal Length Versicolor
<br>Press 4 for Petal Width Versicolor
<br>Press 0 to go back
<br>Choice:
<br>4
<br>For Petal Width
<br>Mean: 1.3259999
<br>Median: 1.3
<br>Mode: 1.3
<br>Minimum Value: 1.0
<br>Maximum value: 1.8
<br>
<br>Press 1 for Sepel Length for Versicolor
<br>Press 2 for Sepel Width for Versicolor
<br>Press 3 for Petal Length Versicolor
<br>Press 4 for Petal Width Versicolor
<br>Press 0 to go back
<br>Choice:
<br>0
<br>Press 1 for Sepel Length
<br>Press 2 for Sepel Width
<br>Press 3 for Petal Length
<br>Press 4 for Petal Width
<br>Press 5 for Iris Setosa
<br>Press 6 for Iris Versicolor
<br>Press 7 for Iris virginica
<br>Press 0 to exit
<br>Choice: 7
<br>Press 1 for Sepel Length for virginica
<br>Press 2 for Sepel Width for virginica
<br>Press 3 for Petal Length virginica
<br>Press 4 for Petal Width virginica
<br>Press 0 to go back
<br>Choice:
<br>1
<br>For Sepal Length
<br>Mean: 6.5879993
<br>Median: 6.5
<br>Mode: 6.3
<br>Minimum Value: 4.9
<br>Maximum value: 7.9
<br>
<br>Press 1 for Sepel Length for virginica
<br>Press 2 for Sepel Width for virginica
<br>Press 3 for Petal Length virginica
<br>Press 4 for Petal Width virginica
<br>Press 0 to go back
<br>Choice:
<br>2
<br>For Sepal Width
<br>Mean: 2.9740002
<br>Median: 3.0
<br>Mode: 3.0
<br>Minimum Value: 2.2
<br>Maximum value: 3.8
<br>
<br>Press 1 for Sepel Length for virginica
<br>Press 2 for Sepel Width for virginica
<br>Press 3 for Petal Length virginica
<br>Press 4 for Petal Width virginica
<br>Press 0 to go back
<br>Choice:
<br>3
<br>For Petal Length
<br>Mean: 5.5520005
<br>Median: 5.55
<br>Mode: 5.1
<br>Minimum Value: 4.5
<br>Maximum value: 6.9
<br>
<br>Press 1 for Sepel Length for virginica
<br>Press 2 for Sepel Width for virginica
<br>Press 3 for Petal Length virginica
<br>Press 4 for Petal Width virginica
<br>Press 0 to go back
<br>Choice:
<br>4
<br>For Petal Width
<br>Mean: 2.0260003
<br>Median: 2.0
<br>Mode: 1.8
<br>Minimum Value: 1.4
<br>Maximum value: 2.5
<br>
<br>Press 1 for Sepel Length for virginica
<br>Press 2 for Sepel Width for virginica
<br>Press 3 for Petal Length virginica
<br>Press 4 for Petal Width virginica
<br>Press 0 to go back
<br>Choice:
<br>0
<br>Press 1 for Sepel Length
<br>Press 2 for Sepel Width
<br>Press 3 for Petal Length
<br>Press 4 for Petal Width
<br>Press 5 for Iris Setosa
<br>Press 6 for Iris Versicolor
<br>Press 7 for Iris virginica
<br>Press 0 to exit
<br>Choice: 0
<br>

## Flowchart

![alt text](https://github.com/moazakhter99/22122028-MDS273L-JAVA/blob/master/Lab_FlowChart/Java_lab_7_flowchart.png)