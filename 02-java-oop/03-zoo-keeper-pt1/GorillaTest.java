package Zookeeper1;
public class GorillaTest {
    public static void main(String[] args){
        Gorilla G = new Gorilla(100);

        G.displayEnergy();// Energy level is: 100
        G.throwSomething();//The gorilla throwing stuff and her energy decrease to: 95
        G.throwSomething();//The gorilla throwing stuff and her energy decrease to: 90
        G.eatBanana();//The Gorilla eating bananas and her energy increase to: 100
        G.eatBanana();//The Gorilla eating bananas and her energy increase to: 110
        G.climb();//The Gorilla climbing the trees and her energy decrease to: 101
        G.displayEnergy();// Energy level is: 101
    }
}
