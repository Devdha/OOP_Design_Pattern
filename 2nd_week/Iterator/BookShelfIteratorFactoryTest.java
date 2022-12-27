public class BookShelfIteratorFactoryTest {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("Around the World in 80 Days"));
    bookShelf.appendBook(new Book("Bible"));
    bookShelf.appendBook(new Book("Cinderella"));
    bookShelf.appendBook(new Book("Daddy-Long-Legs"));
    BookShelfIteratorFactory factory = new BookShelfIteratorFactory();
    Iterator it = factory.createProduct(bookShelf, 0);
    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }
    it = factory.createProduct(bookShelf, 1);
    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }
  }
}