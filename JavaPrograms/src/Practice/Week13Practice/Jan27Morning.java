package Practice.Week13Practice;


public class Jan27Morning {
    public static boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();
        for (char c:s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                clean.append(Character.toLowerCase(c));
            }
        }
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) return false;
            left++;
            right--;
        } return true;
    }
    static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
