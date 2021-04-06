import java.util.*;

public class foreachexam {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<String> ();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");

        for (String number: numbers) {
            System.out.println(number);
        }
    }
}
