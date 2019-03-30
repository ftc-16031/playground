import java.util.Scanner;

public class ay {

	public static void main(String[] args) 
		throws InterruptedException {
		System.out.println("ay ay");
		String password1 = "lmao lmao";
		
		
		Scanner scanner = new Scanner(System.in);
		String response1 = scanner.nextLine();
		
		if (password1.toLowerCase().equals(response1)) {
			System.out.println("what if i was lazy and just told you to imagine a christmas tree in your head");
		} else {
			System.out.println("ur trash lmao");
			Thread.sleep(1000);
			System.out.println("please wait 10 seconds");
		}
		
		Thread.sleep(5000);
		System.out.println("\nlololol");
		Thread.sleep(2000);
		System.out.println("\ntime for round two");
		Thread.sleep(2000);
		System.out.println("ay ay");
		String response2 = scanner.nextLine();
		
		if (password1.toLowerCase().equals(response2)) {
			System.out.println("\na christmas frickin tree");
			System.out.println("        1");
			System.out.println("       2 2");
			System.out.println("      3   3");
			System.out.println("     4     4");
			System.out.println("    5       5");
			System.out.println("     6     6");
			System.out.println("    7       7");
			System.out.println("   8         8");
			System.out.println("  9           9");
			System.out.println(" 0             0");
			System.out.println("  VAVAVAVAVAVAV");
			
		} else {
			System.out.println("ur trash lmao");
		}
		scanner.close();
	}

}
