class Animal {
void sound() {
System.out.println("Some generic sound");
}
}
class Dog extends Animal {
@Override
void sound() {
System.out.println("Dog barks");
}
}
class Cat extends Animal {
@Override
void sound() {
System.out.println("Cat meows");
}
}
public class AnimalSound {
public static void main(String[] args) {
Animal a = new Animal();
Dog d = new Dog();
Cat c = new Cat();
System.out.println("Animal : ");
a.sound();
System.out.println("Dog : ");
d.sound();
System.out.println("Cat : ");
c.sound();
}
}
