// Define an interface named 'uni' with a single method 'regstu()'
interface uni {
    public void regstu(); // Method to register a student
}

// Class 'regno' implements the 'uni' interface
class regno implements uni {
    // Implement the 'regstu()' method to print "The registered student is Anaella"
    public void regstu() {
        System.out.println("The registered student is Anaella");
    }
}

// Class 'course' extends the 'regno' class
class course extends regno {
    // Define a method named 'cname()' that prints "She registered for  Marketing course"
    public void cname() {
        System.out.println("She registered for Marketing course");
    }
}

// Class 'lecturer' extends the 'course' class
class lecturer extends course {
    // Define a method named 'lname()' that prints "The course's lecturer name is Mutabazi"
    public void lname() {
        System.out.println("The course's lecturer name is Mutabazi");
    }
}

// Class 'welcome' extends the 'lecturer' class
class welcome extends lecturer {
    // Define a method named 'study()' that prints "Welcome in today's class"
    public void study() {
        System.out.println("Welcome in today's class");
    }
}

// Create a public class named 'classes'
public class classes {
    // Create a main method with String arguments
    public static void main(String[] args) {
        // Create an object of the 'welcome' class and assign it to the variable 'x'
        welcome x = new welcome();

        // Call the 'regstu()' method of the 'x' object
        x.regstu();

        // Call the 'cname()' method of the 'x' object
        x.cname();

        // Call the 'lname()' method of the 'x' object
        x.lname();

        // Call the 'study()' method of the 'x' object
        x.study();
    }
}