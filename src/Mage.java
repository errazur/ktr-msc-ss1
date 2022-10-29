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

    public void attack(String weapon)
    {
        System.out.println(this.name + ": Rrrrrr....");
        if (weapon == "magic" || weapon == "wand"){
            
           System.out.println(this.name + ": Feel the power of my "+weapon);
        }   else {
            System.out.println(this.name + ": I can't attack");
        } 
    }
}
