// Define an interface named 'flower' with a single method 'fname()'
interface flower {
    public void fname(); // Method to print the flower's name
}

// Define a class named 'name' that implements the 'flower' interface
class name implements flower {
    // Implement the 'fname()' method to print "The flower's name is sunflower"
    public void fname() {
        System.out.println("The flower's name is sunflower ");
    }
}

// Define a class named 'color' that extends the 'name' class
class color extends name {
    // Define a method named 'fcolor()' to print "The flower's color is yellow"
    public void fcolor() {
        System.out.println("The flower's color is yellow");
    }
}

// Define a class named 'scent' that extends the 'color' class
class scent extends color {
    // Define a method named 'fscent()' to print "The flower's scent is vanilla"
    public void fscent() {
        System.out.println("The flower's scent is vanilla");
    }
}

// Define a class named 'owner' that extends the 'scent' class
class owner extends scent {
    // Define a method named 'fowner()' to print "The flower's owner is Cecile"
    public void fowner() {
        System.out.println("The flower's owner is Cecile");
    }
}

// Create a public class named 'flowers'
public class flowers {
    // Create a main method with String arguments
    public static void main(String[] args) {
        owner r = new owner(); // Create an object of the 'owner' class and assign it to the variable 'r'
        r.fname(); // Call the 'fname()' method of the 'r' object
        r.fcolor(); // Call the 'fcolor()' method of the 'r' object
        r.fscent(); // Call the 'fscent()' method of the 'r' object
        r.fowner(); // Call the 'fowner()' method of the 'r' object
    }
}
