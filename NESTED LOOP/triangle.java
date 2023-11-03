//A program to print a right angled triangle
public class triangle {// declares public class triangle
    public static void main(String[] args) {//shows main method
        for (int i = 1; i <= 4; i++) {//declares for loop to iterate rows from 1 to 4
            for (int j = 1; j <= i; j++) {//declares for loop to iterate columns from 1 to i 
                System.out.print("*");//prints the asterisk
            }
            System.out.println();//prints a new line
        }//ends for loop
    }//ends main method
}//ends the public class triangle
