class Grandfather {
void company() {
System.out.println("Grandfather's Company : Sonali Traders");
}
}
class Father extends Grandfather {
void car() {
System.out.println("Father's Car : Toyota Corolla");
}
}
class Son extends Father {
void phone() {
System.out.println("Son's Phone : Samsung Galaxy S24");
}
public static void main(String[] args) {
Son s = new Son();
System.out.println("--- Son accessing all inherited properties ---");
s.company();
s.car();
s.phone();
}
}
