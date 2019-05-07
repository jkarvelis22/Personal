package qcweek1;

public abstract class Unit {

    // =====================FIELDS===========================
    private int position = 1;
    private int health = 10;
    private int stamina = 10;
    private int mana = 10;



    // =====================CONSTRUCTORS===========================

    public Unit(int position, int health, int stamina, int mana) {
        this.position = position;
        this.health = health;
        this.stamina = stamina;
        this.mana = mana;
    }


    // =====================BEHAVIORS===========================



    // =====================OVERRIDE METHODS===========================



    // =====================GETTERS AND SETTERS===========================
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
