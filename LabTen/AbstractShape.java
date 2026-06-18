abstract class Shape {
abstract double area();
}
class Circle extends Shape {
private double radius;
Circle(double radius) {
this.radius = radius;
}
@Override
double area() {
return Math.PI * radius * radius;
}
}
class Rectangle extends Shape {
private double length;
private double width;
Rectangle(double length, double width) {
this.length = length;
this.width = width;
}
@Override
double area() {
return length * width;
}
}
public class AbstractShape {
public static void main(String[] args) {
Circle c = new Circle(7.0);
Rectangle r = new Rectangle(10.0, 5.0);
System.out.println("Area of Circle : " + c.area());
System.out.println("Area of Rectangle : " + r.area());
}
}
