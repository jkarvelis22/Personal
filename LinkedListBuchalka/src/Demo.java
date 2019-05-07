import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<>();
        placeToVisit.add("Sydney");
        placeToVisit.add("Melbourne");
        placeToVisit.add("Brisbane");
        placeToVisit.add("Perth");
        placeToVisit.add("Camberra");
        placeToVisit.add("Anatolia");
        placeToVisit.add("Turkey");

        printList(placeToVisit);

        placeToVisit.add(1, "Israel");
        printList(placeToVisit);

        placeToVisit.remove(4);
        printList(placeToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
            System.out.println("=================================");
        }

        private static boolean addInOrder (LinkedList < String > linkedList, String newCity){
            ListIterator<String> stringListIterator = linkedList.listIterator();

            while (stringListIterator.hasNext()) {
                int comparison = stringListIterator.next().compareTo(newCity);
                if (comparison == 0) {
                    //equal, do not add
                    System.out.println(newCity + " is already included as a destination");
                    return false;
                } else if (comparison > 0) {
                    //newCity should appear as this one
                    //Brisbane----->Anatolia
                    stringListIterator.previous();
                    stringListIterator.add(newCity);
                    return true;
                } else if (comparison < 0) {
                    //move to next city
                }
            }
                stringListIterator.add(newCity);
            }
