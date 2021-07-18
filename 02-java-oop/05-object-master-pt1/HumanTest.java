public class HumanTest{
    public static void main(String[] args){
        Human Hman1 = new Human();
        Human Hman2 = new Human();
       
        
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

        Hman1.read();
        


    }
}
