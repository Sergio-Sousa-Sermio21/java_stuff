package java_stuff;
import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.print(false);
		System.out.println(true);
		final String finalExplanation = "constant"; /*final = const*/
		System.out.println(finalExplanation);
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("How much do you glib:");
			String glib = scan.nextLine();
			System.out.println(glib + ".");
		} finally {
			scan.close(); /*how scan works*/
		}
	}
}
