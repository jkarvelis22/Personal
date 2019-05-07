package SecondPackage;

public class Pizza {

    private String[] crust = {"Thin", "Handtossed", "Deep Dish", "Brooklyn"};
    private String[] sauce = {"Red", "Garlic Parm", "BBQ", "Ranch", "None"};
    private String[]cheese = {"Mozzarella", "Provolone","Cheddar", "None"};
    private String[] toppings = {"Pepperoni", "Ham", "Bacon", "Pineapples", "Red Peppers", "Mushrooms", "Sausage", "Chicken"};



    public String[] getCrust() {
        return crust;
    }

    public void setCrust(String[] crust) {
        this.crust = crust;
    }

    public String[] getSauce() {
        return sauce;
    }

    public void setSauce(String[] sauce) {
        this.sauce = sauce;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public String[] getCheese() {
        return cheese;
    }

    public void setCheese(String[] cheese) {
        this.cheese = cheese;
    }
}
