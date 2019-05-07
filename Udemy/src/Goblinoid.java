public abstract class Goblinoid extends Creature implements Sentient {

    //===================FIELDS ===================

    String[] languages = {"Goblin", "Undercommon"};

    @Override
    public void speak(String words) {
        System.out.println(words);
    }
}
