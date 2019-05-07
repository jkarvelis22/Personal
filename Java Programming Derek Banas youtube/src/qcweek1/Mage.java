package qcweek1;

public class Mage extends Player {

    // =====================FIELDS===========================



    // =====================CONSTRUCTORS===========================

    public Mage() {
    }

    public Mage(int playerNum, String playerColor, int characterLevel, int position, int health, int stamina, int mana) {
        super(playerNum, playerColor, characterLevel, position, health, stamina, mana);
        this.setStamina(this.getStamina() * 3);
        this.setHealth(this.getHealth() * 2);
        this.setMana(this.getMana() * 6);
    }

    // =====================BEHAVIORS===========================

    private void mageFire() {
        Attack mf = new Attack(((int) (Math.random() * 8)), "magic");
        int damage = (int)(Math.random() * ((8 - 1) + 1)) + 1;
        String damageType = "magic";
    }

    // =====================OVERRIDE METHODS===========================



    // =====================GETTERS AND SETTERS===========================
}
