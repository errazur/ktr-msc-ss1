public class App {
    public static void main(String[] args) throws Exception {
        Character perso = new TestCharacter("Jean-Luc", "Warrior");
        System.out.println(perso.getName());
        System.out.println(perso.getLife());
        System.out.println(perso.getAgility());
        System.out.println(perso.getStrength());
        System.out.println(perso.getWit());
        System.out.println(perso.getRPGClass());
        perso.attack("wood");
    }
}
