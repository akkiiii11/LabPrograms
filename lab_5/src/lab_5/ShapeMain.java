//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.

// package declaration
package lab_5;

//abstract class Shape declaration
abstract class Shape
{
	// field for the length of a side
	double a;
	
	// constructor to initialize the length of a side
	public Shape(double a) {
		super();
		this.a = a;
	
	}

	// abstract method to calculate the area
	abstract double calculateArea();
	
	// abstract method to calculate the perimeter
	abstract double calculatePerimeter();
}

//class Circle extends Shape
class Circle extends Shape
{

	// constructor to initialize the radius of the circle
	public Circle(double a) {
		super(a);
	}

	// overriding the calculateArea method for Circle
	@Override
	double calculateArea() {
		
		return 3.14 * a * a;
	}

	// overriding the calculatePerimeter method for Circle
	@Override
	double calculatePerimeter() {
		
		return 2 * 3.14 * a ;
	}
	
}

//class Triangle access the all methods of Shape
class Triangle extends Shape
{
	// fields for the lengths of the other two sides
	double b;
	double c;

	// constructor to initialize the lengths of the three sides
	public Triangle(double a, double b, double c) {
		super(a);
		this.b = b;
		this.c = c;
				
	}

	// overriding the calculateArea method for Triangle
	@Override
	double calculateArea() {
		
		return 0.5 * a * b;			// calculating the area of the triangle
	}

	// overriding the calculatePerimeter method for Triangle
	@Override
	double calculatePerimeter() {
		
		return a + b + c;		// calculating the perimeter of the triangle
	}
	
}

public class ShapeMain {

	public static void main(String[] args) {

		// creating a Circle object
		Circle sc = new Circle(5);
		
		// calculating and printing the area and perimeter of the circle
		System.out.println("Area of Circle: " +sc.calculateArea()+ " sq.meter");
		System.out.println("Perimeter of Circle: " +sc.calculatePerimeter()+ " meter");
		
		System.out.println();
		
		// creating a Triangle object
		Triangle st = new Triangle(5, 3, 2);
		
		// calculating and printing the area and perimeter of the triangle
		System.out.println("Area of Circle: " +st.calculateArea()+ " sq.meter");
		System.out.println("Perimeter of Circle: " +st.calculatePerimeter()+ " meter");
		
	}

}

/*Dry Run
 
Area of Circle: 78.5 sq.meter
Perimeter of Circle: 31.400000000000002 meter

Area of Circle: 7.5 sq.meter
Perimeter of Circle: 10.0 meter

 */
