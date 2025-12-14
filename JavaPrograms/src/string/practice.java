package string;

public class practice {
    static void main() {
        String s = "hello";
        System.out.println(s);
        System.out.println("Length of s: "+s.length());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s).reverse();
        System.out.println(stringBuilder.toString());
    }
}
