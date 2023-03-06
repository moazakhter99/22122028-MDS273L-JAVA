## Question

<br>Below is an encryption/decryption standard in which the letters in the message will be replaced with the letters in the cypher row

![alt text]("C:\Users\moaza\OneDrive\Pictures\Screenshots\Screenshot_20230306_132606.png")

<br>Plaintext:  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
<br>Ciphertext: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD

<br>You are supposed to create a menu-driven program that can encrypt or decrypt a message that the user wishes to transfer.
<br>Your program should have two functions, one for encryption and another for decryption. Each function will accept a string message and return the encrypted or decrypted message.

## Program Description

1. Decryption function
- Takes in a String sentence as an argument
- variables containing
    - String of all the 26 characters
    - An empty String
    - length of the sentence
- Loops through the sentence using index
    - If its a space the add space to the empty String
    - Else
        - Take the index of the indivisual String within the String of 26 charachters
        - if index + 3 is >= 26
            - change the value of the index variable to index - 26
        - Take the charachter in the index + 3 of the 26 characters
        - Add it to the empty string
- Return the empty String

2. Encryption function
- Takes in a String sentence as an argument
- variables containing
    - String of all the 26 characters
    - An empty String
    - length of the sentence
- Loops through the sentence using index
    - If its a space the add space to the empty String
    - Else
        - Take the index of the indivisual String within the String of 26 charachters
        - if index is >= 3
            - change the value of the index variable to index - 26
        - Take the charachter in the index + 23 of the 26 characters
        - Add it to the empty string
- Return the empty String

3. The Main Function
- Take the input String from encryption or decryption
- Turn it to uppercase
- Take the user iput to choose for encryption or decryption
- Start a switch case statement
    - case 1
    - Encryption function
    - Print the value returned by the function
    - case 2
    - Decryption function
    - print the value returned by the function
    - Default
    - Wrong Input

## Output
- Encryption
<br>Enter the message: 
<br>Moaz Akhter
<br>Press 1 to encrypt the message
<br>Press 2 to decrypt the message
<br>Your choice:
<br>1
<br>JLXW XHEQBO
- Decryption
<br>Enter the message: 
<br>jlxw xheqbo
<br>Press 1 to encrypt the message
<br>Press 2 to decrypt the message
<br>Your choice:
<br>2
<br>MOAZ AKHTER
<br>

## Flowchart

![alt text](https://github.com/moazakhter99/22122028-MDS273L-JAVA/blob/master/Lab_FlowChart/Java_lab_5_flowchart.png)
