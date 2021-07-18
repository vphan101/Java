
public class Human{
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;

    public Human(int strength, int stealth, int intelligence, int health){
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public Human(){
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 5;
        this.health = 100;
    }


    public Human attack(Human target){
        target.health -= this.strength;
        return target;
    }
    public Integer displayHealth(){
        System.out.println("Health is: " + this.health);
        return health;
    }
    public void showStrength(){
        System.out.println("Strength is: " + this.strength);
    }
    public void showStealth(){
        System.out.println("Stealth is: " + this.stealth);
    }
    public void showIntelligence(){
        System.out.println("Intelligence is: " + this.intelligence);
    }
    public void read(){
        intelligence +=6;
        System.out.println("After Human reads, increases Intelligence to: " + this.intelligence);
    }
    

    //Getters and Setters
    public int getStrength(){
        return this.strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    /////
    public int getStealth(){
        return this.stealth;
    }
    public void setStealth(int stealth){
        this.stealth = stealth;
    }
    /////
    public int getIntelligence(){
        return this.intelligence;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }
    /////
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }

}
