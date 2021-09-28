# APCSwork


0. What does "base" in "base --x Number System" mean?
  The base in the base --x number system means that the number system will be built on the number x. Base signifies that the number system must be limited to a certain value in a digit. The value of each digit must be from 0 to (x-1). For example, the values of the digits in a base 2 number system are 0 to 1 (2-1). You will never see the number x as a digit in a base x number system. In the base 2 number system, you will never see the number 2 as a digit. 
  
1. What is binary and why do we, in computing, care?
  Binary is a base 2 number system and it is used by computers to store data. The reason computers use binary is because it is easy to store data using on and off switches called transitors which is efficient for circuits. The computer is limited to using 2 digits, so a base 2 number system is what it has to work with. It's also simpler than other number systems because it is easier to distinguish between on and off as opposed to on and off and a between value.





Binary to Decimal
1. Separate the binary number into individual digits. 
2. Going from right to left, multiply each digit by 2 to the power of x.
3. The value of x corresponds with the position of the digit in the binary number. For the rightmost digit, x=0. For all digits left of the rightmost digit, x increases in increments of 1 as you move left. For example, for the digit left of the rightmost digit, x=1 and for the digit left of that digit, x-2 and so on.
4. Add the products that you get from multiplying each digit with a power of 2 together.

Ex: 10110
We start with the rightmost digit 0. Because it is rightmost. 0 * 2 ^ 0 = 0.
We move onto the digit left of 0 which is 1. 1 * 2 ^ 1 = 2.
For the next digit 1, 1 * 2 ^ 2 = 4.
For the next digit 0, 0 * 2 ^ 3 = 0.
For the next digit 1, 1 * 2 ^ 4 = 16.
Add together all the products. 2+4+16=22.
10110 in base 2 is 22 in base 10.



Algorithm for converting decimal to binary

The decimal number 5 will be used as an example

Step 1: Divide the decimal number by 2 and record the remainder
        Ex: 5 / 2 = 2, remainder 1
        
Step 2: Write down the remainder as the first digit (from the right) of the binary number
        Ex: _ _ 1
        
        note: I put 3 spaces here because I already know 5 in binary has 3 digits. This is just for the sake of making it clear where to place the digits
        
Step 3: Repeat the above steps, dividing the quotient, and recording the remainder until your quotient is 0. Make sure to write down the remainder on the left of the previous digit
        Ex: 2 / 2 = 1, remainder 0      
            > _ 0 1
            
            1 / 2 = 0, remainder 1
            > 1 0 1
            
            101 is 5 in binary
