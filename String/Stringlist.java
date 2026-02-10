
import java.util.Scanner;

public class Stringlist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        // Display
        System.out.println("\nStrings:");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);

        // Sort
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nSorted Strings:");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);

        // Compare
        System.out.print("Enter two indexes to compare: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (arr[a].equals(arr[b]))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        // Concatenate
        arr[a] = arr[a] + arr[b];
        System.out.println("After Concatenation: " + arr[a]);
    }
}
