package lesson3.task2;

import java.util.Scanner;

/**
 * Постройте частотный словарь букв русского (или английского) алфавита.
 * Т.е. Сколько раз каждая бука алфавита повторяется в введенной строке.
 * Alphabet.put(“A”, 0)
 * А → 3
 * Б → 0
 */

public class Task2 {
    public static void main(String[] args) {

        String text;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any text: ");
        text = scanner.nextLine();
        text = text.toLowerCase();

        int[] arrayLetters = new int['z' - 'a'];

        for(int i = 0; i < text.length(); i++){
            char character = text.charAt(i);
            if(character >= 'a' && character <= 'z'){
                arrayLetters[character - 'a']++;
            }
        }

        for(int i = 0; i < arrayLetters.length; i++){
            if (arrayLetters[i] != 0) {
                System.out.println((char) (i + 'a') + " → " + arrayLetters[i]);
            }
        }
    }
}
