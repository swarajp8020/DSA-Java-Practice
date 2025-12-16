package string;

public class isPalindrome {
    static void main(String[] args) {
        String s = "swaraj";
        isPalindrome i = new isPalindrome();
        System.out.println(i.isPalindrome(s));
    }
    boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
