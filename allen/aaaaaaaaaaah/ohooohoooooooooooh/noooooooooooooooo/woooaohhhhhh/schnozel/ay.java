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
			System.out.println("     /\\");
			System.out.println("    /  \\");
			System.out.println("   /_  _\\");
			System.out.println("    /  \\");
			System.out.println("   /    \\");
			System.out.println("  /______\\");
			System.out.println("     ||");
			
		} else {
			System.out.println("ur trash lmao");
		}
		scanner.close();
	}

}
