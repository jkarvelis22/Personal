package linkedlistdemo;

import util.MyLinkedList;

public class Driver {

    public static void main(String[] args) {
        MyLinkedList<String> stringList = new MyLinkedList<>();
        stringList.insert("test1");
        stringList.insert("test2");
        stringList.insert("test3");
        stringList.insert("test4");
        stringList.insert("test5");
        System.out.println(stringList.peek());
        System.out.println(stringList.peek());
        System.out.println(stringList.pop());
        System.out.println(stringList.pop());
        System.out.println(stringList.pop());
        System.out.println(stringList.pop());
        System.out.println("+-------------+");

        String key = "test7";
        boolean wasRemoved = stringList.removeByKey(key);
        System.out.println("The value " + key + " was removed: "+ wasRemoved);

        String value = stringList.peek();

    }
}
