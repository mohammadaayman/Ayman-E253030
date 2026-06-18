public class Shape {
double area(double length, double width) {
return length * width;
}
double area(double radius) {
return Math.PI * radius * radius;
}
public static void main(String[] args) {
Shape s = new Shape();
double rectArea = s.area(10.0, 5.0);
double circleArea = s.area(7.0);
System.out.println("Area of Rectangle : " + rectArea);
System.out.println("Area of Circle : " + circleArea);
}
}
