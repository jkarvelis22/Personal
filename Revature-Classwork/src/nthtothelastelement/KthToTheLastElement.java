package nthtothelastelement;

public class KthToTheLastElement {

    private static class Node(){
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;

        }
    }
    public Node getKthToTheLastElement(Node head, int v){
        Node current = head;
        runner = head;
        for(int i = 0;i<v;i++){
            if(current.next==null){
                return null;
            }
            current = current.next;
        }
        while(current.next!=null){
            current=current.next;
            runner=runner.next;
        }
        return runner;
    }

    public static void main(String[] args) {

    }
}
