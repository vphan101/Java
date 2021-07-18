package Zookeeper2;



public class Bammal {
    protected int startingEnergy = 300;

    public Bammal(int startingEnergy){
        this.startingEnergy = startingEnergy;
    }

    //Getters and Setters
    public int getstartingEnergy(){
        return this.startingEnergy;
    }
    public void setstartingEnergy(int startingEnergy){
        this.startingEnergy = startingEnergy;
    }

    public Integer displayEnergy(){
        System.out.println("Energy level is: " + this.startingEnergy);
        return startingEnergy;
    }

}
