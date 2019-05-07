public class Creature {

    // ================SIMULATOR==================
    public static void main(String[] args) {
        Creature goblin = new Creature();

        System.out.println(goblin.unarmedAttack());

    }
    // ================FIELDS==================



    private int hitPoints;
    private int armorClass;

    private int STR;
    private int DEX;
    private int CON;
    private int WIS;
    private int INT;
    private int CHA;

    private int[] position;
    private int moveSpeed;

    private String size;

    //================== CONSTRUCTOR ==================

    public Creature() {
    }

    public Creature(int hitPoints, int armorClass, int STR, int DEX, int CON, int WIS, int INT, int CHA, int[] position, int moveSpeed) {
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
        this.STR = (int)(Math.random() * ((6 - 1) + 1);
        this.DEX = (int) Math.random() * ((18 - 3) + 1));
        this.CON = CON;
        this.WIS = WIS;
        this.INT = INT;
        this.CHA = CHA;
        this.position = position;
        this.moveSpeed = moveSpeed;
    }

    // ================BEHAVIORS==================

    public int unarmedAttack() {
        return (int)((Math.random() * ((4 - 1) + 1)) + 1) + this.getSTR();
    }

    //Setter for Position

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getSTR() {
        return STR;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public int getDEX() {
        return DEX;
    }

    public void setDEX(int DEX) {
        this.DEX = DEX;
    }

    public int getCON() {
        return CON;
    }

    public void setCON(int CON) {
        this.CON = CON;
    }

    public int getWIS() {
        return WIS;
    }

    public void setWIS(int WIS) {
        this.WIS = WIS;
    }

    public int getINT() {
        return INT;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    public int getCHA() {
        return CHA;
    }

    public void setCHA(int CHA) {
        this.CHA = CHA;
    }

    public int[] getPosition() {
        return position;



    }

    // MOVE IS A STAND-IN FOR SET POSITION
    public void move(String direction, int numberOfSquares) {
        switch (direction.toLowerCase()) {
            case "north":
                getPosition()[1] += numberOfSquares;
                break;
            case "northwest":
                getPosition()[0] -= numberOfSquares / 2;
                getPosition()[1] += numberOfSquares /2;
                break;
            case "west":
                getPosition()[0] -= numberOfSquares;
                break;
            case "southwest":
                getPosition()[0] -= numberOfSquares / 2;
                getPosition()[1] -= numberOfSquares /2;
                break;
            case "south":
                getPosition()[1] -= numberOfSquares;
                break;
            case "southeast":
                getPosition()[0] += numberOfSquares / 2;
                getPosition()[1] -= numberOfSquares /2;
                break;
            case "east":
                getPosition()[0] += numberOfSquares;
                break;
            case "northeast":
                getPosition()[0] += numberOfSquares / 2;
                getPosition()[1] += numberOfSquares /2;
                break;
            default:
                System.out.println("Invalid Move");
                break;
        }
    }


    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}