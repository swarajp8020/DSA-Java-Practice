package Practice.WeekdayPractice;

public class Dec16Morning {

    /// String Practice
    static void main() {
        String s = "Swaraj";
        StringBuilder stringBuilder = new StringBuilder(s);
        int left = 0, right = stringBuilder.length()-1;
        while (left < right) {
            char temp = stringBuilder.charAt(left);
            stringBuilder.setCharAt(left, stringBuilder.charAt(right));
            stringBuilder.setCharAt(right,temp);
            left++;
            right--;
        }
        System.out.println(stringBuilder.toString());
    }
}
