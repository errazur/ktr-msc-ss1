class Mage extends Character{

    Mage(String name){
        super(name);
        this.RPGClass = "Mage";
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(this.name + ": May the gods be with me.");
    }

    public void attack(String weapon)throws WaeponException
    {
        if (weapon == "magic" || weapon == "wand"){
            System.out.println(this.name + ": Rrrrrr....");
           System.out.println(this.name + ": Feel the power of my "+weapon);
        }   else {
            throw new WaeponException("I don\'t need this stupid "+ weapon +" Don\'t misjudge my powers !");
        } 
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
        System.out.println(this.name + ": Unleash his weapon with magic.");
    }

    public void moveRight(){
        System.out.println(this.name + ": Move Right futively.");
    }

    public void moveLeft(){
        System.out.println(this.name + ": Move Left futively.");
    }

    public void moveForward(){
        System.out.println(this.name + ": Move Forward futively.");
    }

    public void moveBack(){
        System.out.println(this.name + ": Move Back futively.");
    }
}
