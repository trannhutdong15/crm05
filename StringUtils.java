public class StringUtils {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    // Function to reverse a string
    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("Is 'madam' a palindrome? " + isPalindrome("madam"));
        System.out.println("Reversed 'hello': " + reverse("hello"));
    }
}
