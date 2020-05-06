import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word");
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
            if (arr[i] == ' ' || arr[i] == '-')
                continue;
            for (int j = i + 1; j<i; j++){
                if (arr[i]==arr[j])
                    return false;

            }
        }
        return true;
    }
}


