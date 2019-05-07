public class Constructors {

    public Constructors(double money){
        System.out.println("money");
    }

    public Constructors(int value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        //create instances here
        Constructors c = new Constructors(5839);

        //use the no-arg constructor
        Constructors cNoArg = new Constructors(36.59);
    }
}
