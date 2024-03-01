//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Write a function that prints "Hello World" n times recursively.
    public static void printHello(int num){
        if(num <= 0){
            System.out.println();
        }
        else{
            System.out.println("Hello World!");
            printHello(num-1);
        }
    }

    //Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.
    /*it's not working how I want it to, My idea was to add from the lowNum and check if each number is multiple of 7 then
    add to total, and after incrementing once it's the same value as the highNum the base case will add the last number
    and print out the total
    Inti tally, I had code that set the added 1 to the lowNum and minus 1 from the highNum and the recursion could itself
    but add 7 to the lowNum until it reached highNum then print the total but that wasn't working out either*/
    public static void sumItUp(int lowNum, int highNum){
        int total = 0;

        if(highNum == lowNum){          //base case: recursion should stop when lowNum reached highNum
            if(highNum%7 == 0){
                total += highNum;
            }
            System.out.println(total);
        }
        else if(lowNum%7 == 0){
                total += lowNum;
                sumItUp(lowNum+1, highNum);     //recursion call: adds 1 to go to next number until highNum
        }
        else{
            sumItUp(lowNum+1, highNum);
        }
    }

    //Write a function that implements the binary search algorithm recursively.
    public static void findNum(int num, int lower, int upper ){
        int mid = (upper+lower)/2;

        if(mid==num){
            System.out.println(mid);
        }
        else if(num>mid){
            findNum(num, mid, upper);
        }
        else{
            findNum(num, lower, mid);
        }
    }


    public static void main(String[] args) {
        printHello(0);
        sumItUp(14,21);
    }
}