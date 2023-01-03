import java.util.LinkedList;

public class LinkedListImpl<T> implements AbstractList<T> {
  private LinkedList<T> storage;

  public LinkedListImpl() {
    storage = new LinkedList<T>();
  }

  public void addElement(T obj) {
    storage.add(obj);
  }

  public T deleteElement(int i) {
    return storage.remove(i);
  }

  public int insertElement(T obj, int i) {
    storage.add(i, obj);
    return i;
  }

  public T getElement(int i) {
    return storage.get(i);
  }

  public int getElementSize() {
    return storage.size();
  }
}