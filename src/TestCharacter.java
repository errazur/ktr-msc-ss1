class TestCharacter extends Character {

    TestCharacter(String name){
        super(name);
    }

    public void attack(String weapon){
        System.out.println(this.name + ": Rrrrrr....");
    }
}
