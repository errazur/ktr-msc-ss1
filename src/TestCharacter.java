class TestCharacter extends Character {

    TestCharacter(String name){
        super(name);
    }

    public void attack(String weapon){
        System.out.println(this.name + ": Rrrrrr....");
    }

    public void unleash()
    {
        System.out.println(this.name + ": Unleash his weapon");
    }
}
