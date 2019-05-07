package remove;

public class LinkedList {
    //define what the linked list will have

    //head is the beginning of the list
    private Node head;

    //tail is the end of the list
    private Node tail;

    //save will hold node for the future
    private Node save;

    //give a method to insert data
    private Node insert(int data) {
        Node newNode = new Node(data, null);

        //check to see if Node is empty
        if (this.head == null) {
            //filling the first node
            System.out.println("This is empty");
            //defining head and tail in our node and in our linked list
            this.head = newNode;
            this.tail = newNode;
        }
        //if the node has things, put it at the end
        else {
            System.out.println("List has contents adding new node to the tail of the list");
            this.tail.setNextNode(newNode);
            this.tail = newNode;

        }
        public void printList () {


            //start with the head of the list
            Node currentNode = this.head;

            //while currentNode is not null, print out the node info and move on the next node
            while (currentNode != null) {
                System.out.println("Node value: " + currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
        }
    }

    public void removeDups() {
        Node current = head;
        Node runner = head.nextNode;
        while(current!=null){
            runner.nextNode = current;
            while(runner.nextNode!=null){
                if(runner.nextNode.data == current.data;

            }

        }

    }
}

