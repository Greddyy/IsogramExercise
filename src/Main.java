import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String input = sc.nextLine();
        System.out.println(isogram(input));


}
	// write your code here

   public static boolean isogram(String str) {
        boolean iso = true;
        str = str.toLowerCase();
        int len = str.length();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return iso = false;
            }

        }
        return iso;
    }
}
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your word");
//        String input = sc.nextLine();
//        char[] chars = input.toCharArray();
//        for (int i = 0; i <= input.length() - 1; i++) {
//            if (chars[i] == chars[i + 1])
//                return false;
//        }
//        return true;
