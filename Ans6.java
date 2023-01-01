import java.util.Scanner;

public class Ans6 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input first number: ");
	int a=sc.nextInt();
	System.out.println("Expected Output: ");
	for(int i=1;i<=10;i++) {
		System.out.println(a+"x"+i+"="+(a*i));
	}
}
}
