import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T> {
  private ArrayList<T> storage;

  public ArrayImpl() {
    storage = new ArrayList<T>();
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