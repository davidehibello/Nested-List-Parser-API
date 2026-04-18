public class Item implements ListComponent {
    private int value;

    public Item(int value) {
        this.value = value;
    }

    public void printValue() {
        System.out.print(value);
    }

    public void addChild(int index, ListComponent child) {
        throw new UnsupportedOperationException();
    }

    public void removeChild(int index) {
        throw new UnsupportedOperationException();
    }

    public ListComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public int getChildCount() {
        return 0;
    }
    
    public int getValue() {
        return value;
    }
}