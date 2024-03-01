# Lab4Assignemnt
Lab week 04:

Classroom tasks:

Task 01) Run the following code:

void countDown(int num)

 {

      if (num == 0) // test

                  System.out.println("Blastoff!");

       else {

                  System.out.println("...");

                    countDown(num-1); // recursive call

             } 

}

what is the output of this code?

- modify it so that it prints only the even numbers. 

- what is the time complexity of this algorithm and why?

Task 02) Run the following code:

int gcd(int x, int y) {

      if (x % y == 0) //base case

             return y;

       else

             return gcd(y, x % y);

}

what is the output of this code?

- modify it to find the gcd using subtraction instead of %.

Task 03) Run the following code:


int fib(int n)

{

       if (n <= 0) // base case

            return 0;

      else if (n == 1) // base case

             return 1;

       else

             return fib(n – 1) + fib(n – 2);

}

what is the time complexity of this algorithm and why?

Homework

please submit the solution to the following problems:

Write a function that prints "Hello World" n times recursively. 
Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.
Write a function that implements the binary search algorithm recursively.
Push your code to GitHub and submit the URL here. Make sure to include comments. 
