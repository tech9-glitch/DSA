package string;
import java.util.Scanner;
public class LengthOfLastWord58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine(); 

        LengthOfLastWord58 obj = new LengthOfLastWord58();
        int result = obj.lengthOfLastWord(s);

        System.out.println("Length of last word: " + result);

        sc.close();
    }

    public int lengthOfLastWord(String s) {
        String str = s.trim(); 
        int count = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}



//s = s.trim();
//return s.length() - s.lastIndexOf(" ") - 1;