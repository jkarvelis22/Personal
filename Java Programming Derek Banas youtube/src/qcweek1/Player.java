package qcweek1;

public abstract class Player extends Unit implements Speak {
    private int playerNum;
    private String playerColor;
    private int characterLevel;

    // =================CONSTRUCTORS===========================

    public Player(int position, int health, int stamina, int mana, int playerNum, String playerColor, int characterLevel) {
        super(position, health, stamina, mana);
        this.playerNum = playerNum;
        this.playerColor = playerColor;
        this.characterLevel = characterLevel;
    }

    // ====================BEHAVIORS========================

    void takeDamage(int damage, String damageType) {
        this.setHealth(this.getHealth() - damage);
    }

    // ==================OVERRIDE METHODS========================
    public void speak(){
        System.out.println("Ready for action!");
    }

// ====================GETTERS AND SETTERS========================

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public String getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }
}
