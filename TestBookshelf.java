public class TestBookshelf {

    public static void main(String[] args) {
     Bookshelf myBook = new Bookshelf("My Bookshelf");

     Book first = new Book("Intro to Java Programming","Daniel Liang","Pearson" , 200,1997);
     Book second = new Book("Advanced Java Programming","Daniel Liang ","Pearson" , 220,1999);
     Book third = new Book("The C Programming Language ","Dennis Ritchie","Princeton" , 80,1978);
     Book fourth = new Book("Davinci Code","Dan Brown ","Doubleday" , 25,2003);
     Book fifth = new Book("The Lost Symbol","Dan Brown  ","Doubleday" , 35,2009);

     myBook.addBook(first);
     System.out.println("------------------------------------------");
     myBook.addBook(second);
     System.out.println("------------------------------------------");
     myBook.addBook(third);
     System.out.println("------------------------------------------");
     myBook.addBook(fourth);
     System.out.println("------------------------------------------");
     myBook.addBook(fifth);
     System.out.println("------------------------------------------");
     myBook.removeBook(second);
     System.out.println("------------------------------------------");
     myBook.removeBook(fifth);
     System.out.println("------------------------------------------");

     System.out.println(myBook.shelfFull());
     System.out.println("------------------------------------------");

     System.out.println(myBook.shelfEmpty());
     System.out.println("------------------------------------------");

     System.out.println(myBook.toString());
     System.out.println("------------------------------------------");

 }
}
