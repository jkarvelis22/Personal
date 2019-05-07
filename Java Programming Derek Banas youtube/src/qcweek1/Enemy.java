package qcweek1;

public class Enemy extends Unit implements Speak{

    public Enemy(int position, int health, int stamina, int mana) {
        super(position, health, stamina, mana);
    }

    @Override
    public void speak() {
        System.out.println("Dieeeeeeeee!!!!!!!");
    }
}
