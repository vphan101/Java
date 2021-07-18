public class ProjectTest {
    public static void main(String[] args) {
        Project p1 = new Project();
        Project p2 = new Project("Java");
        Project p3 = new Project("Java", "WebFun Dojo", 500);
        System.out.println(p1.ElevatorPitch());//null null 0.000000
        System.out.println(p2.ElevatorPitch());//Java null 0.000000
        System.out.println(p3.ElevatorPitch());//Java WebFun Dojo 500.00000

        p1.setName("Python");
        p1.setDescription("Coding Dojo");
        p1.setCost(4000.54);
        System.out.println(p1.ElevatorPitch());// Python Coding Dojo 4000.540000

        p2.setDescription("Part-time Stack");
        p2.setCost(3152.00);
        System.out.println(p2.ElevatorPitch());//Java Part-time Stack 3152.000000

       

        Portfolio PL = new Portfolio();
        PL.showPortfolio();
    }
}
