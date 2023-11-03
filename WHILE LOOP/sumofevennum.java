//A program to print the sum of all even numbers from 0 to 50
public class sumofevennum{//declares public class sumofeven
public static void main(String[] args) {// shows main method
    int sum = 0;// declares variable sum and inittializes it to 0
    int i = 0;//declares variable i and initializes it to 0
    while (i <= 50) {//starts while loop with a condition
        sum += i;//increments sum by i
        i += 2;//increments i by 2
    }//ends while loop
    System.out.println("The sum of all even numbers from 0 to 50 is: " + sum);//prints the sum of all even numbers from 0 to 50
}//ends main method
}//ends public class sumofeven num
