package util;

//Linked list--CRUD Functionality--Create,Read,Update, Delete

public class MyLinkedList<T> {

    //The root node of our linked list, called the 'head'
    private Node<T> head;

    //The end node of our linked list, called the 'tail'
    private Node<T> tail;

    //Insert a node at the end of the linked list
    public void insert(T data) {

        //create a new node object whose next value is null, and contains some data
        Node<T> newNode = new Node<>(data, null);

        //if the head of this linked list is null, then the new node will become
        //the first and the last element of this list
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        //if there are elements in the linked list, then we will select the tail
        //set its next node to the new one we just created, and then set the tail
        //to the newly added node
        else {
            System.out.println("List has contents adding new node to the tail of the list");
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    //Implement a peek method
//return, but do not return the first item in the list
    public T peek() {
        if (this.head != null) {
            return this.head.getData();
        }
        return null;

    }

        //Implement a pop method-Pull from the front
    //remove and return the first item in the list(dequeing)
        public T pop() {
           Node<T> firstNode = this.head;

           if(firstNode != null)
               this.head = this.head.getNextNode();
           return firstNode.getData();
            }
            return null;
        }
        public boolean removeByKey(T key) {

        if(this.head == null){
            return false;

             //Create a reference to hold our current node
            Node<T> currentNode = this.head;

            //Create a reference to the hold the next node(after the currentNOde)
            Node<T> nextNode = currentNode.getNextNode();

            //If the cureentNode has the data we want to delete we will move the data to the next node
            if(currentNode.getData(equals(key)) {
                this.head = nextNode;
                return true;
            }
            /iterate across the linked list while currentNode is not null
                while(currentNode!=null){

                    /*If the nextNode is not null and contains the data we want to delete, have the currentNode
                    point to the node after nextNode and return true

                     */
                    if(nextNode!=null&&nextNode.getData().equals(keys))
                        currentNode.setNextNode(nextNode.getNextNode());
                    return true;
                    }

                //advance currentNode to the next node in the list
            currentNode = currentNode.getNextNode();

                //if nextNode is not null, then advance the next node to the one after it
            if(nextNode != null)nextNode = nextNode.getNextNode();

                }

        return false;
        }

        }
            //Implement a remove method-Traverse and remove specific data "Look for "Test2" and remove the first
//            public T remove() {
//
//            }

        //Instance oou find it
        //Implement a Remove Duplicate Method - Remove specific
//convenience method for printing the list contents
        public void printList() {


            //start with the head of the list
            Node<T> currentNode = this.head;

            //while currentNode is not null, print out the node info and move on the next node
            while (currentNode != null) {
                System.out.println("Node value: " + currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
        }
    }