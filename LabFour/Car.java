public class Car {
String brand;
String model;
double price;
Car(String brand, String model, double price) {
this.brand = brand;
this.model = model;
this.price = price;
}
void setBrand(String brand) { this.brand = brand; }
void setModel(String model) { this.model = model; }
void setPrice(double price) { this.price = price; }
void displayCar() {
System.out.println("Brand : " + brand);
System.out.println("Model : " + model);
System.out.println("Price : " + price + " BDT");
}
public static void main(String[] args) {
Car car1 = new Car("Honda", "Civic", 1800000);
car1.displayCar();
car1.setBrand("Toyota");
car1.setModel("Corolla");
car1.setPrice(2500000);
car1.displayCar();
}
}

class name of this code
