import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentdir = ".";

    public ListVisitor() {
    }

    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    public void visit(Directory directory) {
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        System.out.println(currentdir);

        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }

        currentdir = savedir;
    }
}