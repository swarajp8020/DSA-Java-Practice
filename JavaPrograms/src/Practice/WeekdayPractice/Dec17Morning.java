package Practice.WeekdayPractice;

public class Dec17Morning {

    /// reverse String
    static void main(String[] args) {
        String s = "swaraj";
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = sb.length()-1;
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
//            left++;
            right--;
            left++;
        }
        System.out.println(sb.toString());
    }
}
