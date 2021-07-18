import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args){
        double base = 0;
        double height = 0;
        double hypotenuse = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for the base:");
        base = scanner.nextDouble();

        System.out.println("Enter the value for the height:");
        height = scanner.nextDouble();

        //hypotenuse = sqrt(base = base + height * height)
        hypotenuse = Math.sqrt((base * base) + (height * height));

        System.out.println("Hypotenuse of a Right-Angled Triangle is: " + hypotenuse);
    }
}
