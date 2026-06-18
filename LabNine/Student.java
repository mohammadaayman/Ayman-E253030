public class Student {
private String name;
private String id;
private double cgpa;
public void setName(String name) { this.name = name; }
public void setId(String id) { this.id = id; }
public void setCgpa(double cgpa) { this.cgpa = cgpa; }
public String getName() { return name; }
public String getId() { return id; }
public double getCgpa() { return cgpa; }
public static void main(String[] args) {
Student s = new Student();
s.setName("Mohammad Ayman");
s.setId("E253030");
s.setCgpa(3.329);
System.out.println("Student Information");
System.out.println("----------------------------");
System.out.println("Name : " + s.getName());
System.out.println("ID : " + s.getId());
System.out.println("CGPA : " + s.getCgpa());
}
}
