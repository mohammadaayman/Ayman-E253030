public class LibraryBook {
String title;
String author;
String bookID;
LibraryBook(String title, String author, String bookID) {
this.title = title;
this.author = author;
this.bookID = bookID;
}
void displayBookInfo() {
System.out.println("Book ID : " + bookID);
System.out.println("Title : " + title);
System.out.println("Author : " + author);
System.out.println("----------------------------");
}
public static void main(String[] args) {
LibraryBook book1 = new LibraryBook("Introduction to Java",
"Herbert Schildt", "LIB-001");
LibraryBook book2 = new LibraryBook("Clean Code",
"Robert C. Martin", "LIB-002");
book1.displayBookInfo();
book2.displayBookInfo();
}
}
