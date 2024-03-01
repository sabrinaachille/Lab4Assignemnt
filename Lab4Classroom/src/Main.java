//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Task 01
    public static void countDown(int num) {
    //added public static
        if (num == 0) { // test
            //added curly brackets
            System.out.println("Blastoff!"); // base case
        }
        else {
            System.out.println("...");
            countDown(num-1); // recursive call
        }
    }
    /*
    what is the time complexity of this algorithm and why?
    The time complexity is O(num) because countDown has 3 operations (line 8, 10, 13)
    And countDown is called num+1 times, so the expression for this algorithm would be
    num + 4 so all constants are omitted and it's then simplified to just num
    */

    //    modify it so that it prints only the even numbers.
    public static void evenCountDown(int num) {
        if (num == 0) {
            System.out.println("Blastoff!"); // base case
        }
        else {
            //checks if num is even
            if(num % 2 == 0){
                //prints even number then recursion call
                System.out.println(num);
                evenCountDown(num-2);
            }
            else{
                //if num is odd, call recursion and -1 to make num even
                evenCountDown(num-1);
            }
        }
    }

    //Task 02
    public static int gcd(int x, int y) {
        if (x % y == 0) { //base case
            return y;
        }
        else {
            return gcd(y, x % y);
        }
    }

    //modify it to find the gcd using subtraction instead of %.
    public static int gcdSub(int x, int y) {
        if (x == y) { //base case
            return y;
        }
        else if(x>y){
            return gcdSub(x - y, y);
        }
        else {
            return gcdSub(y - x, x);
        }
    }

    //Task 03
    public static int fib(int n) {
        if (n <= 0) { // base case
            return 0;
        }
        else if (n == 1) { // base case
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    /*
    what is the time complexity of this algorithm and why?
    The runtime complexity is O(2^n) because for each value the function calls
    2 recursions so it's doubling at each call when is grater then one so it's
    growing exponentially.
     */


    public static void main(String[] args) {
        //what is the output of this code?
        //Task01
        countDown(5);
        System.out.println();
        //Task 02
        evenCountDown(7);
        System.out.println();
        System.out.println(gcd(32, 4));
        System.out.println();
        System.out.println(gcdSub(32, 4));
        System.out.println();
        //Task 03
        System.out.println(fib(3));
    }
}