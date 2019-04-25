public class Book {

    private  String title;
    private String author;
    private String publisher;
    private int price ;
    private int copyright_date ;

    public Book(String title, String author, String publisher, int price , int copyright_date ) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.copyright_date = copyright_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCopyrightDate () {
        return copyright_date ;
    }

    public void setCopyrightDate(int copyright_date) {
        this.copyright_date = copyright_date;
    }

    public  String  toString(){


        return  "Title: " + getTitle() + "" +"\nAuthor: " + getAuthor() + "\nPublisher: " + getPublisher() +
                "\nPrice: " + getPrice() + " \nCopyright Date: " + getCopyrightDate();

    }


}
