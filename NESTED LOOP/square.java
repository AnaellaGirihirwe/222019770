//A program to print a square of 4 rows and 4 columns
public class square {// declares public class square
        public static void main(String[] args) {//shows main method
            for (int i = 1; i < 5; i++) {// declares for loop to iterate rows from 1 to 4
                for (int j = 1; j < 5; j++) {// declares for loop to iterate columns from 1 to 4
                    System.out.print("*");// print the asterisk
                }
                System.out.println();// prints a new line
            }//ends for loop
        }//ends main method
    }//ends public class square
