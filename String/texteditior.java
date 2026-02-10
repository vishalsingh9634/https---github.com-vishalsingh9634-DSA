import java.util.*;
public class texteditior {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter substring to delete: ");
        String subStr = sc.nextLine();

        System.out.print("Enter string to insert: ");
        String insertStr = sc.nextLine();

        int pos = mainStr.indexOf(subStr);

        if (pos != -1) {
            // delete substring
            mainStr = mainStr.substring(0, pos)
                    + mainStr.substring(pos + subStr.length());

            // insert string
            mainStr = mainStr.substring(0, pos)
                    + insertStr
                    + mainStr.substring(pos);
        }

        // replace spaces with _
        mainStr = mainStr.replace(' ', '_');

        System.out.println("Modified String: " + mainStr);
    }
}
