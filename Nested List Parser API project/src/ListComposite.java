import java.util.*;

public class ListComposite implements ListComponent {
    private List<ListComponent> children = new ArrayList<>();

    public void printValue() {
        System.out.print("[ ");
        for (int i = 0; i < children.size(); i++) {
            children.get(i).printValue();
            if (i < children.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.print(" ]");
    }

    public void addChild(int index, ListComponent child) {
        children.add(index, child);
    }

    public void removeChild(int index) {
        children.remove(index);
    }

    public ListComponent getChild(int index) {
        return children.get(index);
    }

    public int getChildCount() {
        return children.size();
    }
}