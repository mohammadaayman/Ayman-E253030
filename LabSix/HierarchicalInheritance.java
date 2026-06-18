class Person {
String name;
int age;
Person(String name, int age) {
this.name = name;
this.age = age;
}
void displayInfo() {
System.out.println("Name : " + name + ", Age : " + age);
}
}
class Doctor extends Person {
Doctor(String name, int age) {
super(name, age);
}
void work() {
System.out.println(name + " treats patients at the hospital.");
}
}
class Teacher extends Person {
Teacher(String name, int age) {
super(name, age);
}
void teach() {
System.out.println(name + " teaches students at the university.");
}
}
class Engineer extends Person {
Engineer(String name, int age) {
super(name, age);
}
void design() {
System.out.println(name + " designs software systems.");
}
}
public class HierarchicalInheritance {
public static void main(String[] args) {
Doctor d = new Doctor("Dr. Rahman", 45);
d.displayInfo();
d.work();
System.out.println("----------------------------");
Teacher t = new Teacher("Mr. Karim", 38);
t.displayInfo();
t.teach();
System.out.println("----------------------------");
Engineer e = new Engineer("Ms. Nadia", 30);
e.displayInfo();
e.design();
System.out.println("----------------------------");
}
}
