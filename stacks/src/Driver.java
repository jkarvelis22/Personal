public class Driver {

    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);

//        myStack.push("hello!");

        myStack.push("hello!");
        myStack.push("goodbye");
        myStack.push("abc");
        myStack.push("xyz!");
        myStack.push("123");
        myStack.push("------");
        myStack.push("stop");

        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println(myStack.size());
    }
}
