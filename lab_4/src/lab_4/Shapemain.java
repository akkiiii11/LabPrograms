package lab_4;

// Abstract class to represent a Shape
class Shape {
    // Abstract method to draw the shape
    void draw() {
        
    }
    
    // Abstract method to calculate the area of the shape
    public double calculateArea() {
        return 0;
    }
}

// Class to represent a Circle (extends Shape)
class Circle extends Shape {
    double radius; // radius of the circle
    
    // Constructor to initialize the radius
    Circle(double radius) {
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

// Class to represent a Square (extends Shape)
class Square extends Shape {
    double side; // side length of the square
    
    // Constructor to initialize the side length
    Square(double side) {
        this.side = side;
    }
    
    // Override the draw method to draw a square
    void draw() {
        System.out.println("Drawing a Square");
    }
    
    // Override the calculateArea method to calculate the area of a square
    public double calculateArea() {
        return side * side;
    }
}

// Class to represent a Triangle (extends Shape)
class Triangle extends Shape {
    double height; // height of the triangle
    double width; // width of the triangle
    
    // Constructor to initialize the height and width
    Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    
    // Override the draw method to draw a triangle
    void draw() {
        System.out.println("Drawing a Triangle");
    }
    
    // Override the calculateArea method to calculate the area of a triangle
    public double calculateArea() {
        return 0.5 * height * width;
    }
}

public class Shapemain {

    public static void main(String[] args) {
        // Create a Circle object and perform operations
        Circle sc = new Circle(4);
        sc.draw();
        System.out.println("Area of a Circle is: " + sc.calculateArea());
        
        // Create a Square object and perform operations
        Square ss = new Square(4);
        ss.draw();
        System.out.println("Area of a Square is: " + ss.calculateArea());
        
        // Create a Triangle object and perform operations
        Triangle st = new Triangle(4, 5);
        st.draw();
        System.out.println("Area of a Triangle is: " + st.calculateArea());
    }
}

/*Dry Run

Drawing a circle
Area of a Circle is: 50.24
Drawing a Square
Area of a Square is: 16.0
Drawing a Triangle
Area of a Triangle is: 10.0

*/