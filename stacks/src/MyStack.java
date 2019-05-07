import java.util.Arrays;

public class MyStack {

    private int currentElementPosition = 0;
    private String[] elements;

    public MyStack(int initialSize) {
        elements = new String[initialSize];
    }

    public void push(String newString) {

        //if array is filled, expand its size
        if (currentElementPosition == elements.length) {
            int increasedSize = elements.length * 2;
            elements = Arrays.copyOf(elements, increasedSize);
        }
        elements[currentElementPosition++] = newString;
    }

    public String pop() {

        //If the current element position is 0, then return null
        if (currentElementPosition == 0) {
            System.out.println("The stack is empty");
            return null;
        }

        //If the current element position is not zero, then return the value in the stack

            //retrieve the top most element
            String value = elements[--currentElementPosition];

            //empty the element value
            elements[currentElementPosition] = null;

            return value;
        }
        public int size () {
            return currentElementPosition;

        }
    }
