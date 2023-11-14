# Summa
Best way to sum two number

## Installation
Compile the source code:

```javac Generate.java```

And run: (replace ```maxNumber``` with the max operand of the sum)

```java Generate maxNumber```

A ```Summa.java``` will be generated: compile it:

```javac Summa.java```

and run (replace num1 and num2 with the two operands):

```java Summa num1 num2```

If no command line argument is given both the program requires a user input in the console.

## Note on the size of Summa.java
The file size is given by the equation (it is approximated that the two operands and the result are single character):

```496 + (70 * maxNumber² ) + 89``` bytes

So to cover all the number from 0 to 2147483647 (max int number) ```Summa.java``` will be ```1.614E20``` bytes or roughly ```140``` exaByte (1 exaByte = 1024 petaByte)
