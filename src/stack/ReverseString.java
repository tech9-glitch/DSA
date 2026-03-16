package stack;
import java.util.*;

public class ReverseString{
	public static void reverseString(char []s){
		Stack<Character> stack = new Stack<>();
		for(char c : s) {
			stack.push(c);
			}
		for(int i= 0 ; i<s.length;i++) {
			s[i]=stack.pop();
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String input = sc.nextLine();
		char[] s = input.toCharArray();
		reverseString(s);
		System.out.print("Reversed String : "+ new String(s));
	}

}
