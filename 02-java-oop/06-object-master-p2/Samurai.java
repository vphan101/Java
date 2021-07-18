public class Samurai extends Human{
    protected int health =200;
    protected static int numOfSamurai =1;

    public Samurai(int health){
        this.health = health;
        Samurai.numOfSamurai++;
    }

    public Samurai(){
        this.health = 200;
    }

    /////Methods
    public void deathBlow(Human target){
        this.health -=100;
        System.out.println("After deathBlow, health of Samurai is decrease to: " + this.health);
    }

    public void meditate(){
        this.health += health/2;
        System.out.println("After meditation, health is increased to: " + this.health);
    }

    public static int howMany() {
        System.out.printf("Total number of Samurai:  " +  Samurai.numOfSamurai);
        return Samurai.numOfSamurai;
    }


    //Getters and Setters


}
