package Zookeeper1;


public class Gorilla extends Mammal{
    public Gorilla(int energyLevel){
        super(energyLevel);
    }
    public void throwSomething(){
        energyLevel -=5;
        System.out.println("The gorilla throwing stuff and her energy decrease to: " + this.energyLevel);
    }
    public void eatBanana(){
        energyLevel +=10;
        System.out.println("The Gorilla eating bananas and her energy increase to: " + this.energyLevel);
    }
    public void climb(){
        energyLevel -=9;
        System.out.println("The Gorilla climbing the trees and her energy decrease to: " + this.energyLevel);
    }
}
