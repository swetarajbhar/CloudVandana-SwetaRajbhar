import java.util.Scanner;

public class PangramCheck {

    public static boolean isPangram(String input) {
        boolean[] alphabetCheck = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isLetter(currentChar)) {
                int index = currentChar - 'a';

                if (index >= 0 && index < 26) {
                    alphabetCheck[index] = true;
                }
            }
        }

        // Check if all alphabet letters have been seen
        for (boolean letterPresent : alphabetCheck) {
            if (!letterPresent) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters from a to z are present
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input.toLowerCase());

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
