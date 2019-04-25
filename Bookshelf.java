public class Bookshelf {

    int count = 0;
    private String name;
    Book[] bookShelf = new Book[5];

    public Bookshelf(String name) {
        this.name = name;
    }
//Following method will add a book to Bookshelf



    public void addBook(Book b) {

        for (int i = 0; i < bookShelf.length; i++) {

            if (bookShelf[i] != b && bookShelf[i] != null) {
            } else {
                bookShelf[i] = b;

                i = bookShelf.length;


            }

        }
        System.out.println("You have just added following book to your Bookshelf: " + b.getTitle());

    }

//Following method will check if added book is duplicate book in Bookshelf
    public void duplicateBook (Book b) {
        for (int i = 0; i <bookShelf.length; i++) {
            if (bookShelf[i] != b && bookShelf[i] !=null) {
                System.out.println(("This book is already exist in the bookshelf"));

            } else {
                bookShelf[i] = b;
            }
        }
    }
 //Following method will remove a book from the Bookshelf
    public void removeBook (Book c) {
        for (int i = 0; i <bookShelf.length; i++) {
            if (c == bookShelf[i] && bookShelf[i] != null) {
                System.out.println("You have just removed following book from your bookshelf: " + bookShelf[i].getTitle());
                bookShelf[i] = null;
            }
        }
    }
 //Foolwing method will check if the Bookshelf is full or not
    public boolean shelfFull() {
        int count = 0;
        boolean noSpace = false;
        for (int i = 0; i < bookShelf.length; i++) {
            if(bookShelf[i] !=null) {
                count++;
            }
        } if(count == 5) {
            noSpace = true;

        } else {
            noSpace = noSpace;
        }
        return noSpace;
    }
//Following method will check if the Bookshelf is empty or not
    public boolean shelfEmpty() {
        int count = 0;
        boolean noBook = false;
        for (int i = 0; i < bookShelf.length; i++) {
            if (bookShelf[i] == null) {
                count++;
            }
            if (count == 5) {
                noBook = true;
            } else {
                noBook = false;
            }

        } return noBook;
    }
    @Override
    public String toString() {
        String newString = "" ;

        for (int x = 0 ; x < bookShelf.length; x++) {

            if(bookShelf[x] !=null) {

                newString += bookShelf[x].toString() + "\n" + "\n";


            }
        }
        return  newString;

}}
