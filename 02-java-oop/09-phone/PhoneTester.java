public class PhoneTester {
    
    public static void main(String[] args){
        IPhone IP = new IPhone("X", 100, "Verizon", "ring ring ring");
        Galaxy Ga = new Galaxy("S9", 90, "T-Mobile", "Ring Galaxy");


        IP.displayInfo();
        System.out.println(IP.ring());
        System.out.println(IP.unlock());

        Ga.displayInfo();
        System.out.println(Ga.ring());
        System.out.println(Ga.unlock());
    }


}
