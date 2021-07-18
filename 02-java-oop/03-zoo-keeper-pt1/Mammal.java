package Zookeeper1;
public class Mammal{
    protected int energyLevel = 100;

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    //Getters and Setters
    public int getEnergyLevel(){
        return this.energyLevel;
    }
    public void setEnergyLevel(int energyLevel){
        this.energyLevel = energyLevel;
    }

   
    public Integer displayEnergy(){
        System.out.println("Energy level is: " + this.energyLevel);
        return energyLevel;
    }

    

}
