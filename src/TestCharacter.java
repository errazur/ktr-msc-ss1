class TestCharacter extends Character {

    TestCharacter(String name){
        super(name);
    }

    public void attack(String weapon) throws WaeponException {
        System.out.println(this.name + ": Rrrrrr....");
    }

    public void tryAttack(String weapon) throws WaeponException {
        try {
            attack(weapon);
        }   catch (WaeponException e) {
            System.out.println(e.getMessage());
        }
    }

    public void unleash()
    {
        System.out.println(this.name + ": Unleash his weapon");
    }
}
