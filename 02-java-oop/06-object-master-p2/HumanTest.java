public class HumanTest{
    public static void main(String[] args){
        Human Hman1 = new Human();
        Human Hman2 = new Human();

        Wizard W1 = new Wizard();
        Wizard W2 = new Wizard();

        Ninja N1 = new Ninja();
        Ninja N2 = new Ninja();

        Samurai S1 = new Samurai();
        Samurai S2 = new Samurai();
       
        
        Hman1.displayHealth();// Health is: 100
        Hman1.showStrength();//Strength is: 3
        Hman1.showStealth();// Stealth is: 3
        Hman1.showIntelligence();//Intelligence is: 5

        Hman2.displayHealth();//Health is: 100

        Hman1.attack(Hman2);
        Hman2.displayHealth();//Health is: 97
        Hman1.displayHealth();//Health is: 100

        Hman1.attack(Hman2);
        Hman2.displayHealth();//Health is: 94

        Hman1.read(); //After Human reads, increases Intelligence to: 11
        

        W1.displayHealth();//Health is:50
        W1.showIntelligence();//Intelligence is: 8

        W2.displayHealth();//Health is 50
        W1.heal(W2);//I've been HEALED, healthLevel increase of: 8
        W2.displayHealth();//Health is: 58

        W1.fireball(W2); //I've been attacked, Health Level decrease to: 34
        W2.displayHealth();//Health is:34
        W1.heal(W2);//I've been HEALED, healthLevel increase of: 8
        W2.displayHealth();//Health is: 42

        N1.displayHealth();//Health us 100
        N1.steal(N2);//Health will be after stolen by stealth: 90
        N2.displayHealth();//Health is: 90
        N2.runAway();//After running away, health decrease to: 80
        N2.worksOut();//After working out, strength increases to: 8

        S1.deathBlow(S2);// After deathBlow, health of Samurai is decrease to: 100
        S1.meditate();//After meditation, health is increased to: 150

        S1.howMany();//Total number of Samurai: 1


    }
}

