import java.util.ArrayList;

public class ProjjectTest {
    public static void main(String[] args) {
        double[] portCost = {100.00, 200.00};
        Projject newProj1 = new Projject();


        newProj1.getName();
        newProj1.setName("One Buddha Temple");
        System.out.println(newProj1);//Project@4926097b

        newProj1.getDescription();
        newProj1.setDescription("To remodel the temple");
        System.out.println(newProj1);//Project@4926097b

        newProj1.getCost();
        newProj1.setCost(100.00);
        String printThis = newProj1.elevatorPitch();
        System.out.println(printThis);//One Buddha Temple($100): to remodel the temple

        Projject newProj2 = new Projject();
        newProj2.getName();
        newProj2.setName("One Buddha Temple");
        newProj2.getDescription();
        newProj2.setDescription("To add some facilities");
        newProj2.getCost();
        newProj2.setCost(200.00);
        String printOther = newProj2.elevatorPitch();
        System.out.println(printOther);//One Buddha Temple($200): To add some facilities
       
        
        ArrayList<Object> portfolio = new ArrayList<Object>();
        portfolio.add(printThis);
        portfolio.add(printOther);
        portfolio.add(portCost);
        System.out.println(portfolio);
        //[One Buddha Temple($100.0): To remodel the temple, One Buddha Temple($200.0): To add some facilities, [D@606d8acf] ]

        Projject.portCost(portCost);//300 as the total cost

      

        

    }
}
