/**
 * Checks if given <code>text</code> is a palindrome.
 *
 * @param text any string
 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
 */
public static boolean isPalindrome(String text) {
    String str = text.replaceAll("[^a-zA-Z0-9]", "");
    return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
}
