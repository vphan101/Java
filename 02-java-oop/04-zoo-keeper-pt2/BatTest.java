package Zookeeper2;

public class BatTest{

    public static void main(String[] args){
        Bat B = new Bat(300);

        B.fly();//The bat fly and his energy decrease to: 250
        B.fly();// The bat fly and his energy decrease to: 200
        B.attackTown(); //The bat attacks  and his energy decrease to: 100
        B.attackTown(); //The bat attacks  and his energy decrease to: 0
        B.eatHumans();//The bat eats and his energy increase to: 25
        B.eatHumans();//The bat eats and his energy increase to: 50
    }
}