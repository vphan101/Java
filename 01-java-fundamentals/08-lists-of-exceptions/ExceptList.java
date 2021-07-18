import java.util.Arrays;
import java.util.ArrayList;


public class ExceptList {
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello World");
        myList.add(48);
        myList.add("Goodbye World");

        System.out.println(myList); //[13, Hello World, 48, Goodbye World]

        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(myList);
            }catch(Exception e){
                System.out.println("Exception: out of bounds");
            }
        }


    }

    
}
