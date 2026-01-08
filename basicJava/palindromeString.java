public class palindromeString {
    public static boolean isPalindrome(String s1) {
        String s2= new StringBuilder(s1).reverse().toString();
        boolean s= s1.equals(s2);
        return s;
    }
    public static void main(String[] args) {
        String s1="add";
         if (isPalindrome(s1)) {
            System.out.println("Yes, it's a palindrome.");
        } else {
            System.out.println("No, it's not a palindrome.");
        }

    }
}
