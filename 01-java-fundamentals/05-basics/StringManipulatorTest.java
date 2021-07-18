public class StringManipulatorTest {
    public static void main(String[] args){
        //Test the Trim And Concat Method
        StringManipulator manipulator0 = new StringManipulator();
        String str= manipulator0.trimAndConcat("     Hello      ", "     World      ");
        System.out.println(str);


        StringManipulator manipulator1 = new StringManipulator();
        char letter = 'o';
        String a = manipulator1.getIndexOrNull("Coding", letter);
        String b = manipulator1.getIndexOrNull("Hello World", letter);
        String c = manipulator1.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null 

        StringManipulator manipulator2 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        String a2 = manipulator2.getIndexOrNull(word, subString);
        String b2 = manipulator2.getIndexOrNull(word, notSubString);
        System.out.println(a2); // 2
        System.out.println(b2); // null

        StringManipulator manipulator3 = new StringManipulator();
        String word3 = manipulator3.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word3); // eworld

    }
}
