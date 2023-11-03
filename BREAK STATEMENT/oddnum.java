//A program to print all odd numbers from 1 to 100 but stops when the number  reaches 25
public class oddnum {// Declares a public class called oddnum
    public static void main(String[] args) {// Shows main method
        int n = 1; // Declares a variable n to store the current number 1
        while (n <= 100) {// a while loop to iterate numbers from 1 to 100
            if (n == 25) {// Check if the current number is 25
                break;// If it is, break out of the loop
            }// ends if statement
            System.out.println(n);// Print the current number
            n += 2;// Increment the current number by 2
        }// ends the while loop
    }// ends the main method
}// ends the oddnum class