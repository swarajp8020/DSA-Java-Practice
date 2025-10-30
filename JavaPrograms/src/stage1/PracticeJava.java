package stage1;

import java.util.Scanner;

public class PracticeJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and string: ");
        int i = sc.nextInt();
        String j = sc.next();
        if(i >= 1 && i <= 10){
            System.out.println("Hi "+i);
        } else  {
            System.out.println(j);
        }
        sc.close();
    }
}
