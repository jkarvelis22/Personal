package qcweek1;

public class Tough extends Player {

    // =====================FIELDS===========================



    // =====================CONSTRUCTORS==========================

    public Tough(int position, int health, int stamina, int mana, int playerNum, String playerColor, int characterLevel) {
        super(position, health, stamina, mana, playerNum, playerColor, characterLevel);
    }

    // =====================BEHAVIORS===========================
    @Override
    void takeDamage(int damage, String damageType) {
        if(damageType != "Magic") {
            damage *= .75;
        } else {
            damage *= .50;
        }
    }


    // =====================OVERRIDE METHODS===========================



    // =====================GETTERS AND SETTERS===========================

}
