public class Warrior extends Character{

    Warrior(String name){
        super(name);
        this.RPGClass = "Warrior";
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        System.out.println(this.name + ": My name will go down in history !");
    }

    public void attack(String weapon){
        System.out.println(this.name + ": Rrrrrr....");
        if (weapon == "hammer" || weapon == "sword"){
            
            System.out.println(this.name + ": I'll crush you with my "+weapon);
         }   else {
             System.out.println(this.name + ": I can't attack");
         }
    }

    public void unleash()
    {
        System.out.println(this.name + ": Unleash his weapon like a pure warrior.");
    }

    public void moveRight(){
        System.out.println(this.name + ": Move Right like a bad boy.");
    }

    public void moveLeft(){
        System.out.println(this.name + ": Move Left like a bad boy.");
    }

    public void moveForward(){
        System.out.println(this.name + ": Move Forward like a bad boy.");
    }

    public void moveBack(){
        System.out.println(this.name + ": Move Back like a bad boy.");
    }
}
