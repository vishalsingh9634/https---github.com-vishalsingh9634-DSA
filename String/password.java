import java.util.Scanner;

public class password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        int digit = 0, alpha = 0, special = 0;

        // Display characters
        System.out.println("Characters:");
        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            System.out.println(c);

            if (Character.isDigit(c))
                digit++;
            else if (Character.isLetter(c))
                alpha++;
            else
                special++;
        }

        System.out.println("Digits: " + digit);
        System.out.println("Alphabets: " + alpha);
        System.out.println("Special Characters: " + special);

        // Change case
        String newPass = "";
        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);

            if (Character.isLowerCase(c))
                newPass += Character.toUpperCase(c);
            else if (Character.isUpperCase(c))
                newPass += Character.toLowerCase(c);
            else
                newPass += c;
        }

        // Search character
        System.out.print("Enter character to search: ");
        char ch = sc.next().charAt(0);

        if (newPass.indexOf(ch) != -1)
            System.out.println("Character found");
        else
            System.out.println("Character not found");

        System.out.println("Final Password: " + newPass);
    }
}
