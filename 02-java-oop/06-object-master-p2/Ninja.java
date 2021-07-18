
public class Ninja extends Human {
    protected int stealth = 10;

    public Ninja(){
        this.stealth = 10;
        
    }


    //Methods
    public void steal(Human target){
        target.health -= this.stealth;
        System.out.println("Health will be after been stolen by stealth: " + target.health);
    }

    public void runAway(){
        this.health -= 10;
        System.out.println("After running away, health decreases to: " + this.health);
    }

    public void worksOut(){
        this.strength +=5;
        System.out.println("After working out, strength increase to: " + this.strength);
    }




}
