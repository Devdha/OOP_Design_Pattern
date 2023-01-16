import java.util.ArrayList;
import java.util.Iterator;

/**
 * Directory
 */
public class Directory extends Entry implements Acceptor {
    String name;
    ArrayList dir = new ArrayList();

    public Directory(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return 0; // ?
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public Iterator iterator() {
        return dir.iterator();
    }

    public String toString() {
        return name;
    }
}