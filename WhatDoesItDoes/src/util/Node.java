package util;

public class Node<T> {

    // =====================FIELDS========================

    private T data;
    private Node<T> nextNode;

    // ====================CONSTRUCTOR========================

    public Node(T info, Node<T> next) {
        super();
        this.data = info;
        this.nextNode = next;
    }
    // ================GETTERS AND SETTERS========================

    public T getData() {
        return this.data;
    }

    public void setData(T newData) {
        this.data = newData;
    }

    public Node<T> getNextNode() {
        return this.nextNode;

    }

    public void setNextNode(Node<T> newNode) {
        this.nextNode = newNode;
    }
}
