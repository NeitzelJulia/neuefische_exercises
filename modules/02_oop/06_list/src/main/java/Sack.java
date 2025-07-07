import java.util.Arrays;

public class Sack {

    private Object[] elements = new Object[0];

    public void add(Object element) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = element;
    }

    public Object get(int index) {
        return elements[index];
    }

    public int size() {
        return elements.length;
    }

    public void removeLast() {
        elements = Arrays.copyOf(elements, elements.length - 1);
    }

    public void removeByIndex(int index) {
        Object[] temp = new Object[elements.length - 1];

        for (int i = 0; i < index; i++) {
            temp[i] = elements[i];
        }

        for (int i = index + 1; i < elements.length; i++) {
            temp[i - 1] = elements[i];
        }

        elements = temp;
    }
}
