import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        String newstr = str.replaceAll("a|b|c","");
        return str.length() - newstr.length();
        // REPLACE WITH YOUR CODE
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        if (str.toLowerCase().indexOf("the") != -1) {
            return true;
        }
        // REPLACE WITH YOUR CODE
        return false;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        // REPLACE WITH YOUR CODEE
        String newstr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newstr = newstr+str.charAt(i);
        }
        if (newstr.equals(str)) {
            return true;
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What operation?");
        String operation = scan.nextLine();
        if (operation.equals("isPalindrome")) {
            System.out.println("Str");
            String str = scan.nextLine();
            System.out.println(isPalindrome(str));
        } else if (operation.equals("containsThe")){
            System.out.println("Str");
            String str = scan.nextLine();
            System.out.println(containsThe(str));
        } else if (operation.equals("countABC")){
            System.out.println("Str");
            String str = scan.nextLine();
            System.out.println(countABC(str));
        }
        // YOUR CODE HERE
    }
}
