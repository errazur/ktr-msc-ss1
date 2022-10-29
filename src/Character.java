abstract class Character {
    protected String name;
    protected String RPGClass;
    protected int life;
    protected int strength;
    protected int agility;
    protected int wit;

    Character(String name, String RPGClass)
    {
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 60;
        this.strength = 2;
        this.agility = 2;
        this.wit = 2;
    }

    public void attack(String weapon)
    {
        System.out.println(this.name + " : Rrrrrrrrr....");
    }

    public String getName()
    {
        return this.name;
    }

    public int getLife()
    {
        return this.life;
    }

    public int getAgility()
    {
        return this.agility;
    }

    public int getStrength()
    {
        return this.strength;
    }

    public int getWit()
    {
        return this.wit;
    }

    public String getRPGClass()
    {
        return this.RPGClass;
    }

}
