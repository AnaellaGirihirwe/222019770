//a program to print the day of the week based on a given day of week number
public class daysoftheweek{//creates a public class daysoftheweek
    public static void main(String[] args) {//declares the main method
        int dayOfWeek = 2;//enters the week of the day ranging from 1 to 7
        //an if-else statement to print the day of the week based on the day of week number
        if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day of week");
        }
    }//ends the mainn method
}//ends the class