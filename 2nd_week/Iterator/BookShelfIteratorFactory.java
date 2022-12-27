public class BookShelfIteratorFactory extends Factory {
  private static final int BOOKSHELF_ITERATOR = 0;
  private static final int BOOKSHELF_REVERSE_ITERATOR = 1;

  public Iterator createProduct(Aggregate list, int type) {
    Iterator p = null;
    switch (type) {
      case BOOKSHELF_ITERATOR:
        p = new BookShelfIterator((BookShelf) list);
        break;
      case BOOKSHELF_REVERSE_ITERATOR:
        p = new BookShelfReverseIterator((BookShelf) list);
        break;
    }
    return p;
  }
}