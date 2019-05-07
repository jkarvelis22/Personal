package reversebubblesort;

public class Driver {
    public static void main(String[] args) {
        int[] myArray = {30, 46, 22, 1, 100,34};

        System.out.println("The unsorted int array is: ");

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void reverseBS(int[] arr) {
        int numberOfIterations = arr.length;
        int previousIndex = 0;
        for (int i = 0; i < numberOfIterations; i++) {
            for (int currentIndex = 0; currentIndex < numberOfIterations-i; currentIndex++) {
                //Check to see how the 2 values compare
                //The direction of the angle bracket determines
                //the direction of bubble sort.
                if(arr[currentIndex-1] < arr[currentIndex]) {
                    previousIndex = arr[currentIndex-1];
                    //If the previous node is larger is slides to the left.
                    arr[currentIndex-1] = arr[currentIndex];
                    //and in turn the index to the left slides to the right.
                    arr[currentIndex] = previousIndex;
                }
                //Otherwise don't do anything and just keep on moving to the next iteration.
            }
        }
    }
}

