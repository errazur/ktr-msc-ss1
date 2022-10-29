public class App {
    public static void main(String[] args) throws Exception {
        // Character perso = new TestCharacter("Jean-Luc");
        // System.out.println(perso.getName());
        // System.out.println(perso.getLife());
        // System.out.println(perso.getAgility());
        // System.out.println(perso.getStrength());
        // System.out.println(perso.getWit());
        // System.out.println(perso.getRPGClass());
        // perso.attack("wood");

        Character mage = new Mage("Harry");
        Character warrior = new Warrior("Gromash");

        warrior.tryAttack("screwdriver");
        mage.tryAttack("hammer");
        warrior.tryAttack("hammer");
        try {
            mage.attack("");
        } catch (WaeponException e) {
            System.out.println(e.getMessage());
        }
        // mage.attack("magic");
        // warrior.attack("hammer");
        // warrior.moveRight();
        // warrior.moveLeft();
        // warrior.moveBack();
        // warrior.moveForward();
        // mage.moveRight();
        // mage.moveLeft();
        // mage.moveBack();
        // mage.moveForward();

        // warrior.unleash();
        // mage.unleash();
    }
}
