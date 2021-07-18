import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Puzzle {
    // Sum of all numbers in an array & have the function to return an array that
    // only includes numbers that are greater than 10
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(3, 5, 1, 2, 7, 9, 8, 13, 25, 32));
        System.out.println(values);// [3,5,1,2,7,9,8,13,25,32]
        int sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum += values.get(i);
        }
        System.out.println(sum);// 105

        /////
        int[] array = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        for (int i = 0; i < array.length; i++) {
            // System.out.println(age[i]);
            if (array[i] > 10) {
                System.out.println(array[i]);// 13,25,32
            }
        }

        // Random r = new Random();
        String[] myNames = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        for (String cookies : myNames) {
            System.out.println(cookies);
        }

        /////////////////
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("Nancy");
        mylist.add("Jinichi");
        mylist.add("Fujibayashi");
        mylist.add("Momochi");
        mylist.add("Ishikawa");

        System.out.println("Original List :" + mylist);
        Collections.shuffle(mylist);
        System.out.println("\nShuffled List :" + mylist);

        Random r = new Random();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            alphabet.add(ch);
        }
        System.out.println(alphabet);// [a,b,c,....z]
        System.out.println(alphabet.get(1));// b
        Collections.shuffle(alphabet);
        System.out.println(alphabet);/// display the alphabet shuffle

        int randomNum = r.nextInt(26);
        System.out.println(randomNum);
        System.out.println(alphabet.get(randomNum));

        int number;
        System.out.println("Example to find the array of random numbers");
        System.out.println("Enter the range upto where you need to get the random numbers:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        Random rand = new Random();
        System.out.println("*****OUTPUT*****");
        System.out.println("Random numbers are:-");
        for (number = 1; number <= 10; number++) {
            System.out.println(rand.nextInt(number));
        }

        // double[] arr = new double[25];
        // Random randNum = new Random();
        // for (int i = 5; i < 25; i++) {
        // arr[i] = randNum.nextInt();
        // }
        // System.out.println("Random numbers = "+Arrays.toString(arr));

    }

    ///////////////
    ArrayList<Integer> numbers = new ArrayList<Integer>();

}
