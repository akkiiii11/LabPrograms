package lab_4;

// Abstract class to represent a Shape
class Shape2 {
    // Abstract method to draw the shape
    void draw() {
        
    }
    
    // Abstract method to calculate the area of the shape
    public double calculateArea() {
        return 0;
    }
}

// Class to represent a Circle (extends Shape2)
class Circle2 extends Shape2 {
    double radius; // radius of the circle
    
    // Constructor to initialize the radius
    Circle2(double radius) {
        this.radius = radius;
    }
    
    // Override the draw method to draw a circle
    void draw() {
        System.out.println("Drawing a circle");
    }
    
    // Override the calculateArea method to calculate the area of a circle
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Class to represent a Cylinder (extends Circle2)
class Cylinder extends Circle2 {
    double height; // height of the cylinder
    
    // Constructor to initialize the radius and height
    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    // Override the draw method to draw a cylinder
    void draw() {
        System.out.println("Drawing a Cylinder");
    }
    
    // Override the calculateArea method to calculate the area of a cylinder
    public double calculateArea() {
        return (2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius) ;
    }
}

public class Shape2Main {

    public static void main(String[] args) {
        // Create a Circle object and perform operations
        Circle2 sc = new Circle2(5);
        sc.draw();
        System.out.println("Area of a Circle is: " + sc.calculateArea());
        
        // Create a Cylinder object and perform operations
        Cylinder s = new Cylinder(4, 9);
        s.draw();
        System.out.println("Area of a Cylinder is: " + s.calculateArea());
    }
}

/*Dry Run

Drawing a circle
Area of a Circle is: 78.5
Drawing a Cylinder
Area of a Cylinder is: 326.56

*/