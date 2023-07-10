import sun.awt.geom.AreaOp;

class LibraryItem{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String title;
    int year;
}
class Book extends LibraryItem{
    String author;
    public void bookDetails(){
        System.out.println("Title:"+title+", Year"+year+", Author:"+author);
    }


}
class Magazine extends LibraryItem{
    int issue;
    public void magazineDetais(){
        System.out.println("Title:"+title+", Issue:"+issue+", Year:"+year);
    }


}
public class Main {
    public static void main(String[] args) {
        Magazine magazine=new Magazine();
        Book book=new Book();

        magazine.title="Indian Express";
        magazine.issue=13;
        magazine.year=2002;

        book.author="James";
        book.title="Indian Express";
        book.year=2002;

        book.bookDetails();
        magazine.magazineDetais();
        book.setId(101);
        magazine.setId(202);
        System.out.println("Book Id:"+book.getId());
        System.out.print("Magazine Id:"+magazine.getId());

    }
}