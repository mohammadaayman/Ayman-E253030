class Shape {
void draw() {
System.out.println("Drawing shape");
}
}
class Circle extends Shape {
@Override
void draw() {
System.out.println("Drawing Circle");
}
}
class Rectangle extends Shape {
@Override
void draw() {
System.out.println("Drawing Rectangle");
}
}
public class ShapeDraw {
public static void main(String[] args) {
Shape s = new Shape();
Circle c = new Circle();
Rectangle r = new Rectangle();
System.out.println("Shape : ");
s.draw();
System.out.println("Circle : ");
c.draw();
System.out.println("Rectangle : ");
r.draw();
}
}
