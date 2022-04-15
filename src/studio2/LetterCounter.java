package studio2;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a string to test the number of characters: ");
        String string = input.nextLine();
        string = string.toLowerCase();
        string= string.replaceAll("[^a-zA-Z]", "");


//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = string.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
//        Character.isAlphabetic();
        for(char character : charactersInString){
            if(charMap.containsKey(character)){
                int value = charMap.get(character);
                charMap.put(character, value + 1);
            } else {
                charMap.put(character, 1);
            }
        }
        charMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
                });

    }
}

