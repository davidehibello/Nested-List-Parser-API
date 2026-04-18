public interface ListComponent {
    void printValue();
    void addChild(int index, ListComponent child);
    void removeChild(int index);
    ListComponent getChild(int index);
    int getChildCount();
}