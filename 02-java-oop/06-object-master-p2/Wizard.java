
public class Wizard extends Human{
    protected int health = 50;
    protected int intelligence = 8;


    //public Wizard(int healthLevel){
    //    super(healthLevel);
    //}

    public Wizard(int health, int intelligence){
        this.health = health;
        this.intelligence = intelligence;
    }

    public Wizard(){
        this.health = 50;
        this.intelligence = 8;
    }

    //Methods
    public void heal(Wizard healed){
        healed.health += this.intelligence;
        System.out.println("I've been HEALED, healthLevel increase of: " + this.intelligence);
    }

    public void fireball(Wizard fireballed){
        fireballed.health  -= 3 * this.intelligence;
        System.out.println("I've been attacked, Health Level decrease to:" + fireballed.health);

    }




    //Getters and Setters
    public int getHealthLevel(){
        return this.health;
    }
    public void setHealthLevel(int health){
        this.health = 50;
    }

    
    public int getIntelligence(){
        return this.intelligence;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    ///////////
    public Integer displayHealth(){
        System.out.println("Health is: " + this.health);
        return health;
    }//////////////////////


    public void showIntelligence(){
        System.out.println("Intelligence is: " + this.intelligence);
    }


}
