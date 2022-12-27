public class BookShelfReverseIterator implements Iterator {
  private BookShelf bookShelf;
  private int index;

  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("Around the World in 80 Days"));
    bookShelf.appendBook(new Book("Bible"));
    bookShelf.appendBook(new Book("Cinderella"));
    bookShelf.appendBook(new Book("Daddy-Long-Legs"));
    Iterator it = bookShelf.reverseIterator();
    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }
  }

  public BookShelfReverseIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.index = bookShelf.getLength() - 1;
  }

  public boolean hasNext() {
    if (index >= 0) {
      return true;
    } else {
      return false;
    }
  }

  public Object next() {
    Book book = bookShelf.getBookAt(index);
    index--;
    return book;
  }
}