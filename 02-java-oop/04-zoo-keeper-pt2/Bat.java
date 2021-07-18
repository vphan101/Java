package Zookeeper2;
public class Bat extends Bammal {
   public Bat(int startingEnergy){
       super(startingEnergy);
   } 

   public void fly(){
        startingEnergy -=50;
        System.out.println("The bat fly and his energy decrease to: " + this.startingEnergy);
    }
    
    public void eatHumans(){
        startingEnergy +=25;
        System.out.println("The bat eats and his energy increase to: " + this.startingEnergy);
    }
    
    public void attackTown(){
        startingEnergy -=100;
        System.out.println("The bat attacks and his energy decrease to: " + this.startingEnergy);
    }
    
}
